<%-- 
    Document   : ControlSonoff
    Created on : 14-may-2021, 10:14:32
    Author     : oscar
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="client.ejb.Raspberry"%>
<%@page import="client.ejb.Sonoff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Sonoff sonoff = null;
    Raspberry rpi = null;
    InitialContext ic = new InitialContext();
    sonoff = (Sonoff) ic.lookup("java:global/cmu-Client-0.1/Sonoff");
   

    String onDisabled = "";
    String offDisabled = "";
    String colorSonoff = "";
    String estadoSonoff = "???";

    if (sonoff.getEstado()) {
        onDisabled = "DISABLED";
        offDisabled = "";
        colorSonoff = "yellowgreen";
        estadoSonoff = "ENCENDIDO";
    } else {
        onDisabled = "";
        offDisabled = "DISABLED";
        colorSonoff = "red";
        estadoSonoff = "APAGADO";
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <table>
            <tr>
                <td valign="top">
                    <fieldset>
                        <legend>Sonoff:</legend>
                        <table>
                            <tr>
                                <td>
                                    <fieldset>
                                        <form method="POST" id="sonoff" action="switchSonoff">
                                            <button type="submit" form="sonoff" name="comando" value="ON" <%=onDisabled%>>ON</button> 
                                            <button type="submit" form="sonoff" name="comando" value="OFF" <%=offDisabled%>>OFF</button> 
                                        </form>
                                    </fieldset>
                                </td>

                                <td>
                                    <canvas style="background-color: <%=colorSonoff%>"  width="50" height="50"></canvas>
                                </td>        

                                <td valign="middle">
                                    Estado: <%=estadoSonoff%> 
                                </td>    
                            </tr>
                        </table>
                        Ojo, recargar la página después de pulsar un botón...<br>
                        <br>
                        <small>¿Por qué?, porque la app refresca el estado del <br>
                            sonoff tras haber recibido el topic ".../stat/POWER", y <br>
                            cuando se recarga "index.jsp" todavía no nos ha dado tiempo<br> 
                            a recibirlo.<br>
                            Una implementación asíncrona resolverá este inconveniente.</small>
                    </fieldset>
                </td>
            </tr>
      </table>
    </body>
</html>
