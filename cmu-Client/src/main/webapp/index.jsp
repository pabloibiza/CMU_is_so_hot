<%-- 
    Document   : index
    Created on : 13-abr-2021, 17:27:13
    Author     : Usuario
--%>

<%@page import="client.ws.Usuario"%>
<%@page import="client.ListarUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
                        <legend>Añadir:</legend>
                        <form method="POST" action="<%=response.encodeURL("addUsuario")%>">
                            <table>
                                <tr>
                                    <td>Nombre:</td>
                                    <td><input name="nombre"></td>
                                </tr>
                                <tr>
                                    <td>Contraseña:</td>
                                    <td><input type = "password" name="contrasena"></td>
                                </tr>
                                <tr>
                                    <td>Planta:</td>
                                    <td><select name="planta">
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
                                    <td><input type="submit" value="Añadir"></td>
                                </tr>
                            </table>
                        </form>
                            <hr>
                    </fieldset>
                </td>
                     

            <tr>
            <fieldset>
                
                <table>
                    <tr><legend> Lista: </legend></tr>
                    <tr style="background-color: blue; color:white"><td>Id</td><td>Nombre</td><td>Planta</td><td>Tipo Usuario</td></tr>
                   
                   
                </table>
            </fieldset>
        </tr>
    </tr>
</table>

</body>
</html>
