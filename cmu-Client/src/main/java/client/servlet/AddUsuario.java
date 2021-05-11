/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.servlet;

import client.hash.TextToHash;
import client.jaxws.CMUService;
import client.jaxws.CMUService_Service;
import client.jaxws.Usuario;


import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddUsuario", urlPatterns = {"/addUsuario"})
public class AddUsuario extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/155.210.71.106_8080/CMU_server/CMUService.wsdl")
    private CMUService_Service service;    
  
    
    private boolean administrador;

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

        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String planta = request.getParameter("planta");
        String tipoUsuario = request.getParameter("tipoUsuario");
        
        if (tipoUsuario.equals("administrador")){
            administrador = true;
        }      
        
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setContrasena(TextToHash.getSHA256(contrasena));
        usuario.setPlanta(planta);
        usuario.setAdministrador(administrador);

        
        try { // Call Web Service Operation
           CMUService port = service.getCMUServicePort();
            // TODO initialize WS operation arguments here
          
            port.addUsuario(usuario);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
         
       


        response.sendRedirect("pantallaregistrousuarios.jsp");
        

        
        
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
