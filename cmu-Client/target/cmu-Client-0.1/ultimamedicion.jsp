<%-- 
    Document   : ultimamedicion
    Created on : 13-may-2021, 22:18:37
    Author     : Pablo
--%>




<%@page import="client.ejb.MedicionTermometro"%>
<%@page import="client.UltimaMedicion"%>
<%@page import="client.jaxws.Medicion"%>



<%@page import="javax.naming.InitialContext"%>
<%

    HttpSession misession = (HttpSession) request.getSession();

    session.setAttribute("login", misession.getAttribute("login"));

    if ((String) session.getAttribute("login") == null) {
        response.sendRedirect(response.encodeURL("index.jsp"));
    }

    InitialContext ic = new InitialContext();
    MedicionTermometro medicionTermometro = null;
    medicionTermometro = (MedicionTermometro) ic.lookup("java:global/cmu-Client-0.1/MedicionTermometro");
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
        <style type="text/css">
            .boton_personalizado{
                width:80px;
                height:45px;
                text-decoration: none;
                padding: 4px;
                font-weight: 600;
                font-size: 22px;
                color: #ffffff;
                background-color: #1883ba;
                border-radius: 6px;
                border: 2px solid #0016b0;
                align-content: rigth;
                margin-top: 10px;
                position: absolute;
                right:100px;
            }
            .boton_personalizado:hover{
                color: #1883ba;
                background-color: #ffffff;
            }

            .boton_cerrarSesion{
                width:80px;
                height:45px;
                text-decoration: none;
                padding: 5px;
                font-weight: 600;
                font-size: 20px;
                color: #ffffff;
                background-color: #FF0000;
                border-radius: 6px;
                border: 2px solid #0016b0;
                margin-top: 10px;
                position: absolute;
                right:10px;
            }
            .boton_cerrarSesion:hover{
                color: #1883ba;
                background-color: #ffffff;
            }

            button {
                outline: none !important;
                border: none;
                background: transparent;
            }

            button:hover {
                cursor: pointer;
            }

            iframe {
                border: none !important;
            }
        </style>
    </head>

    <body>

        <% String admin = (String) session.getAttribute("admin");
            if (admin.equals("admin")) {%>
        <div class="boton_personalizado" >
            <div><button onclick="pageRedirectAdmin()">Volver</button></div>
        </div>
        <% } else { %>
        <div class="boton_personalizado" >
            <div><button onclick="pageRedirectNormal()">Volver</button></div>
        </div>
        <%}%>

        <div class="boton_cerrarSesion" >
            <div><button onclick="cerrarSesion()">Logout</button></div>

        </div>
        <section id='app' class='hero is-link is-fullheight'>


            <div class='hero-body'>
                <div class='container'>
                    <div class='columns has-text-centered'>
                        <div class='column'>
                            <h1 style='font-size: 2.5rem'>Consultar Temperatura</h1>
                            <i class='fa fa-thermometer-half' style='font-size: 4rem;'></i>
                        </div>
                    </div>

                    <div class='columns'>
                        <div class='column has-text-centered'>
                            <h2 class='is-size-4 has-text-warning'>Temperatura</h2>
                            <h2 class='is-size-1'> <%= medicionTermometro.getTemp()%></h2>
                        </div>
                        <div class='column has-text-centered'>
                            <h2 class='is-size-4 has-text-warning'>Presión</h2>
                            <h2 class='is-size-1'><%= medicionTermometro.getPress()%></h2>
                        </div>
                    </div>

                    <br>

                    
                    <div class='columns'>
                        <div class='column'>

                            Si quiere leer la última medición Clica <a href="ultimamedicion.jsp"><b> Aquí </b></a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script>
            function pageRedirectAdmin() {

                window.location.replace("pantallainicioadministrador.jsp");
            }

            function pageRedirectNormal() {

                window.location.replace("pantallainiciousuariosnormales.jsp");
            }

            function cerrarSesion() {
                window.location.replace("index.jsp");
            }
        </script>
    </body>

</html>

