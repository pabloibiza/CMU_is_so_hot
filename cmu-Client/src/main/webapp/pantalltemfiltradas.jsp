<%-- 
    Document   : pantalltemfiltradas
    Created on : 22-may-2021, 10:02:51
    Author     : oscar
--%>

<%@page import="client.jaxws.Medicion"%>
<%@page import="client.ListarMediciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ListarMediciones mediciones = (ListarMediciones) session.getAttribute("listamedicioneshabitacion");
    if (mediciones == null) {
        mediciones = new ListarMediciones();
        response.sendRedirect(response.encodeURL("temperaturasHabitacion"));
    } else {
        session.setAttribute("listamedicioneshabitacion", null);
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
    </head>
    <body>


        <div class="limiter">

            <div class="container-table100">
                <div  style="width:rem;" align="center">
                    <img class="card-img-left"  src="images/logo.png" align="left" alt="Card image cap">
                    <div class="card-body" align="center">
                        <h2 class="card-title">Listado Temperaturas</h2>
                    </div>
                    <form method="POST" action="<%=response.encodeURL("temperaturasHabitacion")%>">
                        <div class="field" id="searchform">
                            <input type="text" id="searchterm" name="numHab" placeholder="Introduce el num de habitación" />
                            <button type="submit" id="search">Buscar</button>
                        </div>
                    </form>
                </div>

                <div class="wrap-table100">
                    <div class="table">
                        <div class="row header">
                            <div class="cell">
                                Id
                            </div>
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
                            <div class="cell">
                                Eliminar
                            </div>

                        </div>



                        <% for (Medicion m : mediciones.getLista()) {%>
                        <div class="row">
                            <div class="cell" data-title="Id">
                                <%=m.getId()%>
                            </div>
                            <div class="cell" data-title="Temperatura">
                                <%=m.getTemperatura()%>
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
                            <div class="cell" data-title="Eliminar">
                                <a href="<%=response.encodeURL("eliminarMedicion?id=" + m.getId())%>">Eliminar</a>
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

    </body>
</html>



