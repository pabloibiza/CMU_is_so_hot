/*
 Modela la info asociada a una raspberry.
De momento solo se considera la temperatura de su CPU.
 */
package raspi.ejb;

import com.google.gson.Gson;
import javax.ejb.Stateless;

/**
 *
 * @author fsern, pablo
 */
@Stateless
public class Medicion {
    private String  temp;  // tª del BMP280
    private String  press;  // del BMP280

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
   

   
    
}
