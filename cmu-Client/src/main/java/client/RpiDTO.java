package client;

import com.google.gson.Gson;


/**
 *
 * @author Pablo
 */

public class RpiDTO {
    private String  temp    = "nulo"; 
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
