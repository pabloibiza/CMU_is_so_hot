/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ejb;

import client.mqtt.MqttManagerBean;
import client.mqtt.Topic;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author  Pablo
 */
@Singleton
@Startup
public class Starter {

    @EJB MqttManagerBean mqtt;
    @EJB Termostato sonoff;
    
    @PostConstruct
    public void sayHello(){
        System.out.println("01. Starter =======> init");
       
        mqtt.addTopicToSubscribe(Topic.TOPIC_SONOFF_STAT_PLANTA_1);
        mqtt.addTopicToSubscribe(Topic.TOPIC_SONOFF_STAT_PLANTA_2);
        mqtt.addTopicToSubscribe(Topic.TOPIC_SONOFF_STAT_PLANTA_3);
        mqtt.addTopicToSubscribe(Topic.TOPIC_RASPI_MEDICION);
        mqtt.connectToMqttBroker();
    }

}
