/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspi.mqtt;


import java.util.Date;
import raspi.ejb.Raspberry;
import raspi.ejb.Sonoff;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import raspi.util.Time;

/**
 *
 * @author fsern, pablo
 */
public class MqttListener implements MqttCallback {

    private Sonoff sonoff;
    private Raspberry rpi;
    
    
    public MqttListener(){
        try {
            InitialContext ic = new InitialContext();
            sonoff  = (Sonoff)ic.lookup("java:global/CMU_is_so_hot-Raspberry/Sonoff");
            rpi     = (Raspberry)ic.lookup("java:global/CMU_is_so_hot-Raspberry/Raspberry");
        } catch (NamingException ex) {
            Logger.getLogger(MqttListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void messageArrived(String _topic, MqttMessage _mm) throws Exception {
        System.out.println("=== MESSAGE RX: '"+_topic+"' -> '"+_mm.toString()+"'   QOS:"+_mm.getQos()+"  Duplicado?:"+_mm.isDuplicate()+"  Retained?:"+_mm.isRetained()); 
        String payload = _mm.toString();
        switch (_topic){
            case Topic.TOPIC_SONOFF_STAT_POWER:
                // actualizamos el estado. Ha podido ser modificado por otro cliente.
                if (sonoff!=null){
                    if (payload.equals("ON")){
                        sonoff.setEstado(true);
                    }else{
                        sonoff.setEstado(false);
                    }
                }
                break;
                
            case Topic.TOPIC_RASPI_TEMP:
                rpi.setTemp(payload);
                Time time_temp = new Time();
                rpi.setFecha(time_temp.getDate());
                break;
                
            case Topic.TOPIC_RASPI_PRESS:
                rpi.setPress(payload);
                Time time_press = new Time();
                rpi.setFecha(time_press.getDate());
                break;
            
            case Topic.TOPIC_RASPI_MEDICION:
                System.out.println("SE HA RECIBIDO UNA MEDICION");
                System.out.println(payload);
                rpi.parsearEntrada(payload);

        }
    }
    
    @Override
    public void connectionLost(Throwable thrwbl) {
        System.out.println("XXXX Connection Lost XXXXXXXXXXXXXXXXX "+thrwbl.getMessage());
    }
    
    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
    }
    
}
