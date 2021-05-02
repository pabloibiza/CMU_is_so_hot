/*
 Modela la info asociada a una raspberry.
De momento solo se considera la temperatura de su CPU.
 */
package raspi.ejb;

import com.google.gson.Gson;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author fsern, pablo
 */
@Stateless
public class Raspberry {
    private String  temp;  // tª del BMP280
    private String  press;  // del BMP280
    private Date fecha;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "{\"temp\":"+temp+",\"fecha\":"+fecha+",\"press\":"+press+",\"fecha\":"+fecha+"}";
    }
    
    
    
}
