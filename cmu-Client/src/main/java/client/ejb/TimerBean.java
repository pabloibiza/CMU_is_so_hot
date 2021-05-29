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
 * @author  Pablo
 */
@Stateless
public class TimerBean {

    @EJB
    MqttManagerBean mqttManager;
    @EJB
    Termostato sonoff;

    @Schedule(hour = "*", minute = "*", second = "*/30", persistent = false)
    public void toggleSonoffTimer() {
        String estado;
        String topic_estado;
        topic_estado = Topic.TOPIC_SONOFF_CMND_POWER.replace("*", "2");
        if (sonoff.getEstado()) {
            sonoff.setEstado(false);
               mqttManager.publish(topic_estado, "OFF", false);
        } else {
            sonoff.setEstado(true);
            mqttManager.publish(topic_estado, "ON", false);
        }
    }

}
