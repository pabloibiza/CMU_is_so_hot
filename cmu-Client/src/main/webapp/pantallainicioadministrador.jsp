<%-- 
    Document   : pantallaadministrador
    Created on : 13-may-2021, 23:02:53
    Author     : Carlos
--%>
<!DOCTYPE html>
<html lang="es">
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
        

    %>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
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




        </style>
    </head>

    <body >       

        <div class="boton_cerrarSesion" >
            <div><button onclick="cerrarSesion()">Logout</button></div>
        </div>

        <div  style="width:50rem;" align="center">
            <img width="110px" height="110px" class="card-img-left"  src="images/logo.png" align="left" alt="Card image cap">
            <div class="card-body" align="right">
                <h2 class="card-title">Menú Opciones</h2>
            </div>
        </div>

        <br>
        <hr>
        <br>
        <div class="msgBienvenida" align="left">
            <h4> &nbsp; Bienvenid@  <%=session.getAttribute("login")%> </h4>
        </div>
        <br>
        <br>


        <div class="row">
            <div class="col-lg-3">
                <legend>
                    <a class="nav-link" href="<%=response.encodeRedirectURL("ultimamedicion.jsp")%>"/>
                    <center>
                        Consultar Temperatura
                        <br><hr><br>
                        <img width="180px" height="180px" src="images/umedicion.png"> 

                    </center>
                    </a> 
                </legend>

            </div>


            <div class="col-lg-3">
                <legend>
                    <a class="nav-link" href="<%=response.encodeRedirectURL("ControlSonoff.jsp")%>"/>
                    <center>
                        Calefacción
                        <br><hr><br>
                        <img width="180px" height="180px" src="images/calefaccion.png"> 

                    </center>
                    </a> 
                </legend>

            </div>

            <div class="col-lg-3">
                <legend>
                    <a class="nav-link" href="<%=response.encodeRedirectURL("pantallaregistrousuarios.jsp")%>"/>
                    <center>
                        Usuarios
                        <br><hr><br>
                        <img width="180px" height="180px" src="images/usuarios.png"> 

                    </center>
                    </a> 
                </legend>

            </div>

            <div class="col-lg-3">
                <legend>
                    <a class="nav-link" href="<%=response.encodeRedirectURL("pantallatemperaturas.jsp")%>"/>
                    <center>
                        Temperaturas
                        <br><hr><br>
                        <img width="340px" height="180px" src="images/temperaturas.png">
                    </center>
                    </a> 
                </legend>

            </div>

            <div class="col-lg-3">
                <legend>
                    <a class="nav-link" href="<%=response.encodeRedirectURL("pantalltemfiltradas.jsp")%>"/>
                    <center>
                        Temperatura Habitación
                        <br><hr><br>
                        <img width="200px" height="200px" src="images/temperaturahabitacion.png">
                    </center>
                    </a> 
                </legend>

            </div>
        </div>
        <script>
            function cerrarSesion() {
                window.location.replace("index.jsp");
            }
        </script>
    </body>
</html> 

