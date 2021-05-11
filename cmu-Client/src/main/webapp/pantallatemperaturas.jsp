<%-- 
    Document   : pantallatemperaturas
    Created on : 03-may-2021, 15:21:59
    Author     : oscar
--%>

<%@page import="client.jaxws.Medicion"%>
<%@page import="client.ListarMediciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ListarMediciones mediciones = (ListarMediciones)session.getAttribute("listamediciones");
    if (mediciones==null){
        mediciones = new ListarMediciones();
        response.sendRedirect(response.encodeURL("getMediciones"));
    }else{
        session.setAttribute("listamediciones", null);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pantalla Temperaturas - <div id="numHabitacion"></div> </title>
    </head>
    <body>
        <fieldset>

                <table>
                    <tr><legend> Lista: </legend></tr>
                    <tr style="background-color: blue; color:white"><td>Id</td><td>Temperatura</td><td>Fecha</td></tr>

                    <% for (Medicion m : mediciones.getLista()) {%>
                    <tr>
                        <td><%=m.getId()%></td>
                        <td><%=m.getTemperatura()%></td>
                        

                        <td></td><td><a href="<%=response.encodeURL("eliminarMedicion?id=" + m.getId())%>">Eliminar</a></td>
                    </tr>
                    <% }%>
                </table>

            </fieldset>
    </body>
</html>
