<%-- 
    Document   : contacto.jsp
    Created on : 25-may-2021, 17:50:41
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contacto</title>
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

            .boton_personalizado{
                width:80px;
                height:45px;
                text-decoration: none;
                padding: 1px;
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

            textarea{
                background: silver;
                border: 1px solid #393939;
                border-radius: 5px 5px 5px 5px;
                color: #393939;
                font-size: 15px;
                padding: 5px; 
                margin-left:300px;
                align-content: center;
                text-align : justify;
            }

            .tituloInstruccion{
                margin-left:300px; 
                font-size: 30px;
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
                    <h1 class="card-title">Información</h1>
                </div>
                <br>
                <br>
            </div>


            <hr>
            <br>
            <div>
                <div class="tituloInstruccion"><b>Información:</b></div>
                <br>

                <textarea name="textarea" rows="10" cols="100" disabled="disabled">A continuación se mostrarán una serie de normas que tiene que tener en cuenta el usuario:

1º - El usuario no puede eliminar temperaturas.

2º - Cualquier cambio que desee realizar el usuario con respecto a su nombre o su contraseña deberá contactar con el administrador.
           
3º - El usuario normal solo podrá ver el estado de la calefacción, no podrá ni apagarla ni encenderla.           </textarea> 
            </div>
            <br>
            <br>


            <script>
                function pageRedirect() {

                    window.location.replace("pantallainicioadministrador.jsp");
                }

                function cerrarSesion() {
                    window.location.replace("index.jsp");

                }
            </script> 

    </body>
</html>
