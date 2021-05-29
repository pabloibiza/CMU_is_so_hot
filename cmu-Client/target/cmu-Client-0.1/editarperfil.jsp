<%-- 
    Document   : editarPerfil
     Created on : 13-abr-2021, 17:27:13
    Author     : Oscar
--%>

<%@page import="client.jaxws.Usuario"%>
<%@page import="client.ListarUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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

    ListarUsuarios lu = (ListarUsuarios) session.getAttribute("listaPerfil");
    if (lu == null) {
        lu = new ListarUsuarios();
        Long id = Long.valueOf(request.getParameter("id"));
        response.sendRedirect(response.encodeURL("getUsuario?id=" + id));
    } else {
        session.setAttribute("listaPerfil", null);
    }


%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Perfil</title>
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
            <table class="tableEditar">
                <tr>
                    <td>
                <legend><b>Editar: </b></legend>


                <% for (Usuario u : lu.getLista()) {%>
                <form method="POST" action="<%=response.encodeURL("editUsuario?id=" + u.getId())%>">
                    <table>
                        <tr>
                            <td>Nombre:</td>
                            <td><input name="nombre" value="<%=u.getNombre()%>"></td>
                        </tr>
                        <tr>
                            <td>Contraseña:</td>
                            <td><input type = "password" name="contrasena" value="<%=u.getContrasena()%>"></td>
                        </tr>
                        <tr>
                            <td>Planta:</td>
                            <td><select name="planta" value="<%=u.getPlanta()%>">
                                    <option value="1">Primera</option> 
                                    <option value="2">Segunda</option> 
                                    <option value="3">Tercera</option>
                                    <option value="4">Administracion</option>  
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Tipo Usuario:</td>
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
                            <td><input type="submit" value="Editar"></td>

                        </tr>
                    </table>
                    <%}%>
                </form>
                <hr>

                </td>
                </tr>
            </table>

            <script>
                function pageRedirect() {

                    window.location.replace("pantallaregistrousuarios.jsp");
                }

                function cerrarSesion() {
                    window.location.replace("index.jsp");

                }
            </script> 
    </body>
</html>
