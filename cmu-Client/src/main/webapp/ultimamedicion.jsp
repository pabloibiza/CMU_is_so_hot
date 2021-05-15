<%-- 
    Document   : ultimamedicion
    Created on : 13-may-2021, 22:18:37
    Author     : Pablo
--%>




<%@page import="client.UltimaMedicion"%>
<%@page import="client.jaxws.Medicion"%>
<%@page import="client.ejb.Raspberry"%>
<%@page import="client.ejb.Sonoff"%>

<%@page import="javax.naming.InitialContext"%>
<%
    UltimaMedicion ultimamedicion = (UltimaMedicion) session.getAttribute("ultimamedicion");
    if (ultimamedicion == null) {
        ultimamedicion = new UltimaMedicion();
        response.sendRedirect(response.encodeURL("getMedicion"));
    } else {
        session.setAttribute("ultimamedicion", null);
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    body {background-color:#DCF9E4 ;font-family: "Lato", sans-serif; font-size: 12px;}

</style>
<!DOCTYPE html>
<html lang='es'>

    <head>
        <meta charset='UTF-8'>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <title>Ultima Medición</title>
        <link rel='stylesheet' href='https://unpkg.com/bulma@0.9.1/css/bulma.min.css'>
        <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
    </head>

    <body>
        <section id='app' class='hero is-link is-fullheight'>

            <div class='hero-body'>
                <div class='container'>
                    <div class='columns has-text-centered'>
                        <div class='column'>
                            <h1 style='font-size: 2.5rem'>Última Medición</h1>
                            <i class='fa fa-thermometer-half' style='font-size: 4rem;'></i>
                        </div>
                    </div>
                    <% for (Medicion m : ultimamedicion.getLista()) {%>
                    <div class='columns'>
                        <div class='column has-text-centered'>
                            <h2 class='is-size-4 has-text-warning'>Temperatura</h2>
                            <h2 class='is-size-1'> <%=m.getTemperatura()%></h2>
                        </div>
                        <div class='column has-text-centered'>
                            <h2 class='is-size-4 has-text-warning'>Presión</h2>
                            <h2 class='is-size-1'>nnnn</h2>
                        </div>
                    </div>
                    <% }%>
                    <br>

                    <div class='columns has-text-centered'>
                        <div>  <h2 class='is-size-4 has-text-warning'>Elegir Habitación   </h2></div>
                        <div><h2> <select class='is-size-0' name="habitacion">
                                    <option value="1">225</option> 
                                    <option value="2">225</option> 
                                    <option value="3">225</option>
                                    <option value="3">225</option>
                                </select>
                            </h2>
                        </div>
                    </div>

                    <div class='columns'>
                        <div class='column'>

                            <a href="ultimamedicion.jsp">Última lectura</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>

</html>

