/*
 Modela la info asociada a una raspberry.
De momento solo se considera la temperatura de su CPU.
 */
package client.ejb;


import client.jaxws.CMUService;
import client.jaxws.CMUService_Service;
import client.jaxws.Medicion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.WebServiceRef;



/**
 *
 * @author fsern, pablo
 */
@Stateless
public class Raspberry {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/155.210.71.106_8080/CMU_server/CMUService.wsdl")
    private CMUService_Service service;

   
  
    private String habitacion;
    private String  temp;  
    private String  press;  
    private Date fecha;
    
    public String getHabitacion() {
        return habitacion;
    }
    
    public void setHabitacion(String habitacion){
        this.habitacion = habitacion;
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

    public void parsearEntrada(String entrada){
        Scanner sc = new Scanner(entrada).useDelimiter(";");
        
        setHabitacion(sc.next());
        System.out.println("LA HABITACION ES: " + getHabitacion());
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
    
    public void enviarMedicion() throws DatatypeConfigurationException {
        GregorianCalendar date = new GregorianCalendar();
        date.setTime(this.getFecha());
        Medicion medicion = new Medicion();
        medicion.setTemperatura("11.2");
        medicion.setFecha(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
        medicion.setHabitacion("119");
        medicion.setPlanta("Primera");
        
        
        
        
        
        try { // Call Web Service Operation
            CMUService port = service.getCMUServicePort();
            // TODO initialize WS operation arguments here
           
            port.addMedicion(medicion);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

      


    }
    
    
    
}
