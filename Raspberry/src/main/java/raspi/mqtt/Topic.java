/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspi.mqtt;

/**
 *
 * @author fserna
 */
public class Topic {

    // to subscribe
    public static final String TOPIC_SONOFF_STAT_POWER = "/cmu/stat/sonoff/POWER";
    public static final String TOPIC_RASPI_MEDICION    = "/cmu/raspi/medicion";

    // to publish
    public static final String TOPIC_SONOFF_CMND_POWER  = "/cmu/cmnd/sonoff/POWER";
    
    // topic de testamento
    public static final String TOPIC_APP_MQTT_LASTWILL  = "/stw/fs/thatsAllFolks";
    
    
    
}
