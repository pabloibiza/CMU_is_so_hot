/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.mqtt;

import client.RpiDTO;
import java.util.Date;
import client.ejb.MedicionTermometro;
import client.ejb.Termostato;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author  Pablo
 */
public class MqttListener implements MqttCallback {

    private Termostato termostato;
    private MedicionTermometro medTer;

    public MqttListener() {
        try {
            InitialContext ic = new InitialContext();
            termostato = (Termostato) ic.lookup("java:global/cmu-Client-0.1/Termostato");
            medTer = (MedicionTermometro) ic.lookup("java:global/cmu-Client-0.1/MedicionTermometro");
        } catch (NamingException ex) {
            Logger.getLogger(MqttListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void messageArrived(String _topic, MqttMessage _mm) throws Exception {
        System.out.println("=== MESSAGE RX: '" + _topic + "' -> '" + _mm.toString() + "'   QOS:" + _mm.getQos() + "  Duplicado?:" + _mm.isDuplicate() + "  Retained?:" + _mm.isRetained());
        String payload = _mm.toString();
        String planta;
        switch (_topic) {
            case Topic.TOPIC_SONOFF_STAT_PLANTA_1:
                planta = "1";
                if (termostato != null) {
                    if (payload.equals("ON")) {
                        termostato.setEstado(true);
                    } else {
                        termostato.setEstado(false);
                    }
                }
                break;

            case Topic.TOPIC_SONOFF_STAT_PLANTA_2:
                planta = "2";
                System.out.println(payload + "PAYLOAD");
                if (termostato != null) {
                    if (payload.equals("ON")) {
                        termostato.setEstado(true);
                    } else {
                        termostato.setEstado(false);
                    }
                }
                break;

            case Topic.TOPIC_SONOFF_STAT_PLANTA_3:
                planta = "3";
                if (termostato != null) {
                    if (payload.equals("ON")) {
                        termostato.setEstado(true);
                    } else {
                        termostato.setEstado(false);
                    }
                }
                break;

            case Topic.TOPIC_RASPI_MEDICION:
                Gson gson = new Gson();
                RpiDTO rpiDto = gson.fromJson(payload, RpiDTO.class);
                medTer.setTemp(rpiDto.getTemp());
                medTer.setHabitacion(rpiDto.getHabitacion());
            
                medTer.setPress(rpiDto.getPress());
                System.out.println(medTer.toString());
                medTer.enviarMedicion();

                break;

        }
    }

    @Override
    public void connectionLost(Throwable thrwbl) {
        System.out.println("XXXX Connection Lost XXXXXXXXXXXXXXXXX " + thrwbl.getMessage());
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
    }

}
