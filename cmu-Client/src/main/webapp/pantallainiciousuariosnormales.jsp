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

            @import url('https://fonts.googleapis.com/css?family=Poppins');

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
            <img class="card-img-left"  src="images/logo.png" align="left" alt="Card image cap">
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



        <div class="umedicion" align="center">

            <div>  <a class="nav-link" href="<%=response.encodeRedirectURL("ultimamedicion.jsp")%>"> Última Medición </a></div>
            <div><img src="images/umedicion.png"> </div> 

        </div>
        <br>

        <div class="editProfile" align="center">
            <div><a class="nav-link" href="<%=response.encodeRedirectURL("editarperfil.jsp")%>"> Editar Perfil </a>  </div>
            <div> <img src="images/editProfile.png"> </div>

        </div>
    </body>
</html> 

