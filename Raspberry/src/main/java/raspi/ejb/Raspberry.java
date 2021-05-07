/*
 Modela la info asociada a una raspberry.
De momento solo se considera la temperatura de su CPU.
 */
package raspi.ejb;

import com.google.gson.Gson;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author fsern, pablo
 */
@Stateless
public class Raspberry {
    private String  temp;  
    private String  press;  
    private Date fecha;

    public void parsearEntrada(String entrada){
        Scanner sc = new Scanner(entrada).useDelimiter(";");
        
        setTemp(sc.next());
        System.out.println("LA TEMPERATURA ES: " + getTemp());
        setPress(sc.next());
        System.out.println("LA PRESION ES: " + getPress());
        String fecha_sin_parsear = sc.next();
        System.out.println(fecha_sin_parsear);
        setFecha(parsearFecha(fecha_sin_parsear));
        System.out.println("LA FECHA ES: " + getFecha().toString());
        
    }
    
    public Date parsearFecha(String entrada){
        /*Scanner sc = new Scanner(input);
        
        int dia = Integer.valueOf(sc.next(";"));
        int mes = Integer.valueOf(sc.next(";"));
        int ano = Integer.valueOf(sc.next(";"));
        int hora = Integer.valueOf(sc.next(";"));
        int minuto = Integer.valueOf(sc.next(";"));
        int segundo = Integer.valueOf(sc.next(";"));
        
        Date fechaParseada = new Date();
        */
        System.out.println(entrada);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fechaParseada = null;
        try {
            fechaParseada = sdf.parse(entrada);
        } catch (ParseException ex) {
            Logger.getLogger(Raspberry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fechaParseada;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
