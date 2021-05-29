<%-- 
    Document   : index
    Created on : 13-abr-2021, 17:27:13
    Author     : Oscar
--%>


<%@page import="client.jaxws.Usuario"%>
<%@page import="client.ListarUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        ListarUsuarios lu = (ListarUsuarios) session.getAttribute("listausuarios");
        if (lu == null) {
            lu = new ListarUsuarios();
            response.sendRedirect(response.encodeURL("getUsuarios"));
        } else {
            session.setAttribute("listausuarios", null);
        }


    %>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Usuarios</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!--        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link rel="stylesheet" href="https://fonts.xz.style/serve/inter.css">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@exampledev/new.css@1.1.2/new.min.css"> 
        -->

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

            .listarUsuarios{
                background-color: white;
                text-align: left;
                border-collapse: collapse;
                width:50%;




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
                margin-top:32px;
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
                    <h2 class="card-title">Gestionar Usuarios</h2>

                </div>
                <br>
                <br>
            </div>


            <hr>
            <br>
            <table class="tableAgregar">
                <tr>
                    <td>

                <legend><b>Añadir:<b></legend>
                            <form method="POST" action="<%=response.encodeURL("addUsuario")%>">
                                <table>
                                    <tr>
                                        <td><b>Nombre:</b></td>
                                        <td><input name="nombre"></td>
                                    </tr>

                                    <tr>
                                        <td><b>Contraseña:</b></td>
                                        <td><input type = "password" name="contrasena"></td>
                                    </tr>
                                    <tr>
                                        <td><b>Planta:</b></td>
                                        <td><select name="planta">
                                                <option value="1">Primera</option> 
                                                <option value="2">Segunda</option> 
                                                <option value="3">Tercera</option>
                                                <option value="4">Administracion</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <br>
                                    <tr>
                                        <td><b>Tipo Usuario:</b></td>
                                        <td>
                                            <div>
                                                <input type="radio" id="opcion1" name="tipoUsuario" value="administrador">
                                                <label for="admin">Administrador</label>
                                            </div>

                                            <div>
                                                <input type="radio" id="opcion2" name="tipoUsuario" value="normal"
                                                       checked>
                                                <label for="usuarionormal">Normal</label>
                                            </div>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td></td>
                                        <td><input type="submit" value="Añadir"></td>

                                    </tr>
                                </table>
                            </form>
                            <hr>



                            </td>
                            </tr>
                            </table>

                            <table id="tablaUsuarios" class="listarUsuarios">
                                <div class ="cabeceraListado">
                                    <legend> <b>Lista:</b> </legend> 
                                </div>
                                <tr style="background-color: blue; color:white"><td>Nombre</td><td></td><td>Planta</td><td></td><td>Tipo Usuario</td><td></td><td>Editar</td><td></td><td>Eliminar</td></tr>

                                <% for (Usuario u : lu.getLista()) {%>
                                <tr>


                                    <td><%=u.getNombre()%></td>
                                    <td></td>

                                    <% if (u.getPlanta().equals("4")) { %>
                                    <td> Administración</td>

                                    <%} else { %>
                                    <td> <%=u.getPlanta()%></td>
                                    <% }%>
                                    
                                    <td></td>
                                    
                                    <% if (u.isAdministrador()) {%>
                                    <td>Administrador</td>
                                    <%} else {%>
                                    <td>Normal</td>
                                    <%}%>


                                    <td></td><td><a href="<%=response.encodeURL("editarPerfil.jsp?id=" + u.getId())%>">Editar</a></td> 
                                    <td></td><td><a href="<%=response.encodeURL("eliminarUsuario?id=" + u.getId())%>">Eliminar</a></td>

                                </tr>
                                <% }%>
                            </table>



                            <script>
                                function pageRedirect() {

                                    window.location.replace("pantallainicioadministrador.jsp");
                                }

                                function cerrarSesion() {
                                    window.location.replace("index.jsp");
                                }
                            </script>
                            <script type="text/javascript" src="websocket.js"></script>
                            </body>
                            </html>
