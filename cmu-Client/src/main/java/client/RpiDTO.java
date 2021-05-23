/*
Clase auxiliar, solo se usa para parsear el json 
recibido en el topic ".../rpi/cpuTemp".
 */
package client;

import com.google.gson.Gson;


/**
 *
 * @author fsern
 */

public class RpiDTO {
    private String  temp    = "nulo";  // tª del BMP280
    private String  press   = "nulo"; 
    private String  habitacion   = "nulo"; 
    private String  fecha   = "nulo"; 

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
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

    
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
   
}
