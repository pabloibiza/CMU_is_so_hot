package client.servlet;

import client.ejb.Termostato;
import client.mqtt.MqttManagerBean;

import client.mqtt.Topic;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pablo
 */
@WebServlet(name = "SwitchSonoff", urlPatterns = {"/switchSonoff"})
public class SwitchSonoff extends HttpServlet {

    @EJB
    MqttManagerBean mqttManager;
    @EJB
    Termostato termostato;

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
            throws ServletException, IOException, InterruptedException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(true);

        String comando = request.getParameter("comando");
        if (comando.equals("STATE")) {
            String topic_estado;
            topic_estado = Topic.TOPIC_SONOFF_CMND_POWER.replace("*", "2");
            System.out.println("--------------------------------------------------------------------TOPIC ESTADO: " + topic_estado);
            mqttManager.publish(topic_estado, "", false);
        } else if (!comando.equals("STATE") && comando != null) {
            String topic_power;
            topic_power = Topic.TOPIC_SONOFF_CMND_POWER.replace("*", "2");
            System.out.println("--------------------------------------------------------------------TOPIC POWER: " + topic_power);
            mqttManager.publish(topic_power, comando, false);
        }

        sleep(300);
        response.sendRedirect(response.encodeURL("pantallaControlCalefaccion.jsp"));

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
        } catch (InterruptedException ex) {
            Logger.getLogger(SwitchSonoff.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (InterruptedException ex) {
            Logger.getLogger(SwitchSonoff.class.getName()).log(Level.SEVERE, null, ex);
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
