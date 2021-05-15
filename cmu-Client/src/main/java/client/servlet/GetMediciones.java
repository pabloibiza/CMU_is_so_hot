/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.servlet;

import client.ListarMediciones;
import client.jaxws.CMUService;
import client.jaxws.CMUService_Service;
import client.jaxws.Medicion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author oscar
 */
@WebServlet(name = "GetMediciones", urlPatterns = {"/getMediciones"})
public class GetMediciones extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/155.210.71.106_8080/CMU_server/CMUService.wsdl")
    private CMUService_Service service;

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        List<Medicion> mediciones = null;

        try { // Call Web Service Operation
            CMUService port = service.getCMUServicePort();
            // TODO process result here
            mediciones = port.getMediciones();

            if (mediciones == null) {
                mediciones = new ArrayList();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        ListarMediciones listamediciones = new ListarMediciones(mediciones);
        session.setAttribute("listamediciones", listamediciones);
        response.sendRedirect("pantallatemperaturas.jsp");

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
        processRequest(request, response);
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
        processRequest(request, response);
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
