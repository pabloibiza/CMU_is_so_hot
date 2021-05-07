/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspi.ejb;

import raspi.mqtt.MqttManagerBean;
import raspi.mqtt.Topic;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author fsern, pablo
 */
@Singleton
@Startup
public class Starter {

    @EJB MqttManagerBean mqtt;
    @EJB Sonoff sonoff;
    
    @PostConstruct
    public void sayHello(){
        System.out.println("01. Starter =======> init");
        
        mqtt.addTopicToSubscribe(Topic.TOPIC_SONOFF_STAT_POWER);
        mqtt.addTopicToSubscribe(Topic.TOPIC_RASPI_TEMP);
        mqtt.addTopicToSubscribe(Topic.TOPIC_RASPI_PRESS);
        mqtt.addTopicToSubscribe(Topic.TOPIC_RASPI_MEDICION);
        mqtt.connectToMqttBroker();
    }

}
