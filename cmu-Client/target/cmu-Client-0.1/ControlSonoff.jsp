<%-- 
    Document   : ControlSonoff
    Created on : 14-may-2021, 10:14:32
    Author     : Pablo
--%>


<%@page import="javax.naming.InitialContext"%>
<%@page import="client.ejb.Termostato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%session.setAttribute("planta", ""); %>
<!DOCTYPE html>
<html>
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

            table{
                margin-left: 20px;
                margin-bottom: 20px;
                align-content: center
            }



            legend{
                margin-left: 20px;
            }


            select {
                display: block;
                font-size: 16px;
                font-family: 'Verdana', sans-serif;
                font-weight: 400;
                color: #444;
                line-height: 1.3;
                padding: .4em 1.4em .3em .8em;
                width: 400px;
                max-width: 100%; 
                box-sizing: border-box;
                margin: 20px auto;
                border: 1px solid #aaa;
                box-shadow: 0 1px 0 1px rgba(0,0,0,.03);
                border-radius: .3em;
                -moz-appearance: none;
                -webkit-appearance: none;
                appearance: none;
                background-color: #fff;
                background-image: url('data:image/svg+xml;charset=US-ASCII,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%22292.4%22%20height%3D%22292.4%22%3E%3Cpath%20fill%3D%22%23007CB2%22%20d%3D%22M287%2069.4a17.6%2017.6%200%200%200-13-5.4H18.4c-5%200-9.3%201.8-12.9%205.4A17.6%2017.6%200%200%200%200%2082.2c0%205%201.8%209.3%205.4%2012.9l128%20127.9c3.6%203.6%207.8%205.4%2012.8%205.4s9.2-1.8%2012.8-5.4L287%2095c3.5-3.5%205.4-7.8%205.4-12.8%200-5-1.9-9.2-5.5-12.8z%22%2F%3E%3C%2Fsvg%3E'),
                    linear-gradient(to bottom, #ffffff 0%,#f7f7f7 100%);
                background-repeat: no-repeat, repeat;
                background-position: right .7em top 50%, 0 0;
                background-size: .65em auto, 100%;
            }

            select::-ms-expand {
                display: none;
            }
            select:hover {
                border-color: #888;
            }
            select:focus {
                border-color: #aaa;
                box-shadow: 0 0 1px 3px rgba(59, 153, 252, .7);
                box-shadow: 0 0 0 3px -moz-mac-focusring;
                color: #222; 
                outline: none;
            }
            select option {
                font-weight:normal;
            }

            form{
                width:350px;
                padding:16px;
                border-radius:10px;
                margin:auto;
                background-color:#ccc;
            }

            form label{
                width:50px;
                font-weight:bold;
                display:inline-block;
            }


            form input[type="submit"]{
                width:100%;
                padding:8px 16px;
                margin-top:10px;
                border:1px solid #000;
                border-radius:5px;
                display:block;
                color:#fff;
                background-color:#009999;
            } 

            form input[type="submit"]:hover{
                cursor:pointer;

            }

            input{
                padding: 1px 2px;
                margin: 8px 0;
                box-sizing: border-box;    
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
                    <h1 class="card-title">Controla la Calefacción</h1>
                </div>
                <br>
                <br>
            </div>


            <hr>
            <br>
            <div>
                <div class="tituloInstruccion"><b>Instrucciones:</b></div>
                <br>

                <textarea name="comentarios" rows="8" cols="70" disabled="disabled" readonly="readonly">La calefacción estará enchufada 12 horas al día. 

Contacta con los administradores para más información. 

Para ver el estado de la calefacción de tu planta, seleccione la planta y pulse el botón que estará situado justamente debajo y allí podras encenderla o apagarla.

¡¡IMPORTANTE - ACTUALMENTE SOLO SE ENCUENTRA OPERATIVA LA PLANTA 2, YA QUE SOLO SE DISPONE DE UN SONOFF!!
                </textarea>
            </div>
            <br>
            <br>

            <form method="POST" action="<%=response.encodeRedirectURL("pantallaControlCalefaccion.jsp")%>">
                <div class="seleccion">
                    <legend>Elige tu Planta</legend>
                    <br>
                    <select name="planta">
                         
                        <option selected value="1">Primera</option> 
                        <option value="2">Segunda</option>
                        <option value="3">Tercera</option>
                    </select>
                </div>
                <div class="seleccionar"> <input type="submit" value="Ver Estado Calefaccion"></div>

            </form>
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
