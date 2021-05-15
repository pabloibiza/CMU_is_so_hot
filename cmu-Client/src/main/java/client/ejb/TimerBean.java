/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ejb;

import client.mqtt.MqttManagerBean;
import client.mqtt.Topic;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author fsern, pablo
 */
@Stateless
public class TimerBean {

    @EJB MqttManagerBean mqttManager;
    @EJB Sonoff sonoff;

    
   //@Schedule(hour = "*", minute = "*/5", second = "7", persistent = false)
    public void toggleSonoffTimer() {
        System.out.println("==== TIMER ==== ");
        if (sonoff.getEstado()){
            sonoff.setEstado(false);
        }else{
            sonoff.setEstado(true);
        }
        mqttManager.publish(Topic.TOPIC_SONOFF_CMND_POWER, String.valueOf(sonoff.getEstado()), false);
    }

}
