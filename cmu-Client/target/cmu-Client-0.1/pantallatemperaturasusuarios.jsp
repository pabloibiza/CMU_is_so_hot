<%-- 
    Document   : pantallatemperaturasusuarios
    Created on : 22-may-2021, 11:35:50
    Author     : Oscar
--%>
<%@page import="client.jaxws.Medicion"%>
<%@page import="client.ListarMediciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession misession = (HttpSession) request.getSession();
    session.setAttribute("admin", misession.getAttribute("admin"));
    session.setAttribute("login", misession.getAttribute("login"));

    //Comprobación para que el cliente no pueda entrar en jsp de administrador
    if ((String) session.getAttribute("login") == null) {
        response.sendRedirect(response.encodeURL("index.jsp"));
    } else {
        if (session.getAttribute("admin").equals("admin")) {
            response.sendRedirect(response.encodeRedirectURL("pantallainicioadministrador.jsp"));
        }
    }

    if (session == null) {
        session = request.getSession(true);
    }

    String login = (String) session.getAttribute("login");
    String admin = (String) session.getAttribute("admin");

    if (login == null || admin.equals("admin")) {
        response.sendRedirect(response.encodeURL("index.jsp"));
    }

    ListarMediciones mediciones = (ListarMediciones) session.getAttribute("listamedicionesplanta");
    if (mediciones == null) {
        mediciones = new ListarMediciones();
        response.sendRedirect(response.encodeURL("getMedicionesPlanta"));
    } else {
        session.setAttribute("listamedicionesplanta", null);
    }
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Listar Temperaturas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
        <style type="text/css">
            .boton_personalizado{
                width:80px;
                height:45px;
                text-decoration: none;
                padding: 7px;
                font-weight: 600;
                font-size: 20px;
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
                padding: 7px;
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
        </style>
    </head>
    <body>
        <div class="boton_personalizado" >
            <div><button onclick="pageRedirect()">Volver</button></div>
        </div>
        <div class="boton_cerrarSesion" >
            <div><button onclick="cerrarSesion()">Logout</button></div>

        </div>
        <div class="limiter">
            <div class="container-table100">
                <div  style="width:rem;" align="center">
                    <img class="card-img-left"  src="images/logo.png" align="left" alt="Card image cap">
                    <div class="card-body" align="center">
                        <h2 class="card-title">Listado Temperaturas</h2>
                    </div>
                    <br>
                    <br>
                </div>

                <div class="wrap-table100">
                    <div class="table">
                        <div class="row header">
                            <div class="cell">
                                Temperatura
                            </div>
                            <div class="cell">
                                Fecha
                            </div>
                            <div class="cell">
                                Habitacion
                            </div>
                            <div class="cell">
                                Planta
                            </div>
                        </div>



                        <% for (Medicion m : mediciones.getLista()) {%>
                        <div class="row">
                            <div class="cell" data-title="Temperatura">
                                <%=m.getTemperatura()%> ºC
                            </div>
                            <div class="cell" data-title="Fecha">
                                <%=m.getFecha()%>
                            </div>
                            <div class="cell" data-title="Habitacion">
                                <%=m.getHabitacion()%>
                            </div>
                            <div class="cell" data-title="Planta">
                                <%=m.getPlanta()%>
                            </div>

                        </div>

                        <% }%>



                    </div>
                </div>
            </div>
        </div>


        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>
        <!--===============================================================================================-->
        <script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
        <script>
                function pageRedirect() {
                    window.location.replace("pantallainiciousuariosnormales.jsp");
                }

                function cerrarSesion() {
                    window.location.replace("index.jsp");
                }
        </script>
    </body>
</html>



