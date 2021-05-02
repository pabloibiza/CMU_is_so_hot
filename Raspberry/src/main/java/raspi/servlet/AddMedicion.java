/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspi.servlet;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.WebServiceRef;
import raspi.ejb.Raspberry;
import raspi.mqtt.MqttListener;
import raspi.webservice.CMUService;
import raspi.webservice.CMUService_Service;
import raspi.webservice.Medicion;

/**
 *
 * @author pauib
 */
@WebServlet(name = "addMedicion", urlPatterns = {"/addMedicion"})
public class AddMedicion extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/155.210.71.106_8080/cmu-Server/CMUService.wsdl")
    private CMUService_Service service;
    private Raspberry rpi;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DatatypeConfigurationException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            InitialContext ic = new InitialContext();
            rpi     = (Raspberry)ic.lookup("java:global/CMU_is_so_hot-Raspberry-1.0-SNAPSHOT/Raspberry");
        } catch (NamingException ex) {
            Logger.getLogger(MqttListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String temperatura = rpi.getTemp();
        GregorianCalendar date = new GregorianCalendar();
        date.setTime(rpi.getFecha());
        
        Medicion medicion = new Medicion();
        if(temperatura != null && date != null){
            medicion.setTemperatura(temperatura);
            medicion.setFecha(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
        }
        
        try { // Call Web Service Operation
            CMUService port = service.getCMUServicePort();
            port.addMedicion(medicion);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(AddMedicion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(AddMedicion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
