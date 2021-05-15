<%-- 
    Document   : pantallaadministrador
    Created on : 13-may-2021, 23:02:53
    Author     : oscar
--%>

<%-- 
    Document   : pantallainicio
    Created on : 05-may-2021, 13:41:07
    Author     : oscar
--%>

<!DOCTYPE html>
<html lang="es">
    <head>
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



        </style>
    </head>

    <body >       

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
                        Última Medicion
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
                    <a class="nav-link" href="<%=response.encodeRedirectURL("editarperfil.jsp")%>"/>
                    <center>
                        Editar Perfil
                        <br><hr><br>
                        <img width="180px" height="180px" src="images/editProfile.png">
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
        </div>

    </body>
</html> 

