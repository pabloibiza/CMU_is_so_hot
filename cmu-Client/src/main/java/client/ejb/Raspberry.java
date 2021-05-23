/*
 Modela la info asociada a una raspberry.
De momento solo se considera la temperatura de su CPU.
 */
package client.ejb;

import client.RpiDTO;
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

    private String habitacion = "319";
    private String temp;
    private String press;
    private GregorianCalendar fecha;

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
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

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /*
    public void parsearEntrada(String entrada) {
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
     */

 
    public void enviarMedicion() throws DatatypeConfigurationException {
        GregorianCalendar date = new GregorianCalendar();
        String planta="";
        setFecha(date);
        Medicion medicion = new Medicion();
        medicion.setTemperatura(this.getTemp());
        medicion.setFecha(DatatypeFactory.newInstance().newXMLGregorianCalendar(this.getFecha()));
        medicion.setHabitacion(this.getHabitacion());
        
        String[] piso = this.getHabitacion().split("");
        
        if(piso[0].equals("1")){
            planta = "Primera";
        } else if (piso[0].equals("2")){
            planta = "Segunda";
        } else if (piso[0].equals("3")){
            planta = "Tercera";
        }
        
        medicion.setPlanta(planta);

        try { // Call Web Service Operation
            CMUService port = service.getCMUServicePort();
            // TODO initialize WS operation arguments here
            
            port.addMedicion(medicion);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

}
