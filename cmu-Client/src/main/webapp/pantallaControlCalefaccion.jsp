<%-- 
    Document   : pantallaControlCalefaccion
    Created on : 24-may-2021, 18:43:37
    Author     : Pablo
--%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="client.ejb.Termostato"%>
<%
    HttpSession misession = (HttpSession) request.getSession();
    session.setAttribute("admin", misession.getAttribute("admin"));
    session.setAttribute("login", misession.getAttribute("login"));

    String admin = (String) session.getAttribute("admin");
    //Comprobación para que el cliente no pueda entrar en jsp de administrador
    if ((String) session.getAttribute("login") == null || (String) session.getAttribute("admin") == null) {
        response.sendRedirect(response.encodeURL("index.jsp"));
    } else {
        if (!session.getAttribute("admin").equals("admin")) {
            response.sendRedirect(response.encodeRedirectURL("pantallainiciousuariosnormales.jsp"));
        }
    }

    Termostato termostato = null;
    InitialContext ic = new InitialContext();
    termostato = (Termostato) ic.lookup("java:global/cmu-Client-0.1/Termostato");

    if (termostato.esPrimerEncendido()) {
        response.sendRedirect(response.encodeURL("switchSonoff?comando=STATE"));
        termostato.setPrimerEncendido(false);
    }

    String onDisabled = "";
    String offDisabled = "";
    String colorSonoff = "";
    String estadoSonoff = "???";

    if (termostato.getEstado()) {
        onDisabled = "DISABLED";
        offDisabled = "";
        colorSonoff = "yellowgreen";
        estadoSonoff = "ENCENDIDO";
    } else {
        onDisabled = "";
        offDisabled = "DISABLED";
        colorSonoff = "red";
        estadoSonoff = "APAGADO";
    }


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calefacción</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>
            /* BASIC */

            img {

                margin: 2px;
            }

            .card-title {

                font-weight: bold; 
                font-style: italic;
            }

            .msgBienvenida{
                font-weight: bold; 
                font-style: italic;
            }

            body{
                background-color: #DCF9E4;
            }
            .boton_personalizado{
                width:80px;
                height:45px;
                text-decoration: none;
                padding: 3px;
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
                padding: 1px;
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





            legend{
                margin-left: 20px;
            }







            textarea{
                background: silver;
                border: 1px solid #393939;
                border-radius: 5px 5px 5px 5px;
                color: #393939;
                font-size: 15px;
                padding: 5px; 
                margin-left:420px;
                align-content: center;
                text-align : justify;
            }
            .tituloInstruccion{
                margin-left: 420px;
                font-size: 30px
            }

            legend{
                margin-left:0px
            }

            .wrap-table100{
                background-color:#FFFFFF;
                width: 200px;
                height:300px;
                margin-left: 700px;
            }
            .botones{
                margin-top: 10px;
                margin-left: 40px;
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
            <div  style="width:rem;" align="center">
                <img class="card-img-left"  src="images/logo.png" align="left" alt="Card image cap">
                <div class="card-body" align="center">
                    <h2 class="card-title">Estado Calefacción</h2>

                </div>
                <br>
                <br>
            </div>


            <hr>
            <br>
            <table>
                <tr>
                    <td valign="top">
                        <fieldset>

                            <div class="wrap-table100">
                                <div class="table">
                                    <div class="row header">
                                        <div class="cell">
                                            <b>Termostato </b>
                                        </div>



                                    </div>
                                    <div class="row">

                                        <canvas id="estadoCalefaccion" > </canvas>

                                        <canvas id="mipanel"></canvas>



                                    </div>
                                    
                                    <div class="row">
                                        
                                        <div class="botones" data-title="Encender/Apagar">

                                            <form method="POST" id="sonoff" action="<%=response.encodeURL("switchSonoff")%>">
                                                <button type="submit" form="sonoff" name="comando" value="ON" <%=onDisabled%>>ON</button> 
                                                <button type="submit" form="sonoff" name="comando" value="OFF" <%=offDisabled%>>OFF</button> 
                                            </form>
                                        </div>



                                    </div>

                                </div>




                        </fieldset>
                    </td>
                </tr>
            </table>
            <script>
                function pageRedirect() {

                    window.location.replace("ControlSonoff.jsp");
                }

                function cerrarSesion() {
                    window.location.replace("index.jsp");

                }
            </script> 

            <script>
                var lienzo = document.getElementById("estadoCalefaccion");
                if (lienzo && lienzo.getContext) {
                    var contexto = lienzo.getContext("2d");
                    if (contexto) {

                        var r = 10;
                        contexto.strokeStyle = "<%=colorSonoff%>";
                        contexto.fillStyle = "<%=colorSonoff%>";
                        contexto.lineWidth = 5;
                        contexto.arc(250, 100, r, 0, 2 * Math.PI);
                        contexto.fill();
                        contexto.stroke();
                    }
                }

                var miLienzo = document.getElementById("mipanel");
                if (miLienzo && miLienzo.getContext) {
                    var contexto = miLienzo.getContext("2d");
                    if (contexto) {

                        var r = 50;
                        contexto.strokeStyle = "#000000";
                        contexto.fillStyle = "#ffffff";

                        contexto.lineWidth = 1;
                        contexto.arc(140, 100, r, 0, 2 * Math.PI);
                        contexto.fill();
                        contexto.stroke();
                    }
                }


            </script>
    </body>
</html>
