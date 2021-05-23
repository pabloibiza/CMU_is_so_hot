<%-- 
    Document   : editarPerfil
     Created on : 13-abr-2021, 17:27:13
    Author     : oscar
--%>

<%@page import="client.jaxws.Usuario"%>
<%@page import="client.ListarUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
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
        <title>Agenda IU</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!--        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link rel="stylesheet" href="https://fonts.xz.style/serve/inter.css">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@exampledev/new.css@1.1.2/new.min.css"> 
        -->
    </head>
    <body>
        <h1>CMU CLIENTE</h1>
        <h3>AddCLIENTE</h3>
        <hr>
        <br>
        <table>
            <tr>
                <td>
                    <fieldset>
                        <legend>Editar: </legend>
                        <% for (Usuario u : lu.getLista()) {%>
                        <form method="POST" action="<%=response.encodeURL("editUsuario?id=" + u.getId())%>">
                            <table>
                                <tr>
                                    <td>Nombre:</td>
                                    <td><input name="nombre" value="<%=u.getNombre()%>"></td>
                                </tr>
                                <tr>
                                    <td>Contraseña:</td>
                                    <td><input type = "text" name="contrasena" value="<%=u.getContrasena()%>"></td>
                                </tr>
                                <tr>
                                    <td>Planta:</td>
                                    <td><select name="planta" value="<%=u.getPlanta()%>">
                                            <option value="1">Primera</option> 
                                            <option value="2">Segunda</option> 
                                            <option value="3">Tercera</option>
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
                                            <label for="usuarionormal">Usuario Normal</label>
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
                    </fieldset>
                </td>
            </tr>
        </table>

        <script type="text/javascript" src="medicionesWebsocket.js"></script>
    </body>
</html>
