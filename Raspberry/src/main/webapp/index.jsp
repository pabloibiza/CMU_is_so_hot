<%-- 
    Document   : index
    Created on : 27-abr-2020, 17:06:04
    Author     : fsern
--%>

<%@page import="raspi.util.Time"%>
<%@page import="raspi.ejb.Raspberry"%>
<%@page import="raspi.ejb.Sonoff"%>

<%@page import="javax.naming.InitialContext"%>
 <%
    Sonoff sonoff = null;
    Raspberry rpi = null;
    InitialContext ic = new InitialContext();
    sonoff  = (Sonoff)ic.lookup("java:global/CMU_is_so_hot-Raspberry-1.0-SNAPSHOT/Sonoff");
    rpi     = (Raspberry)ic.lookup("java:global/CMU_is_so_hot-Raspberry-1.0-SNAPSHOT/Raspberry");
    
    String onDisabled   = "";
    String offDisabled  = "";
    String colorSonoff  = "";
    String estadoSonoff = "???";
    
    if (sonoff.getEstado()){
        onDisabled  = "DISABLED";
        offDisabled = "";
        colorSonoff       = "yellowgreen";
        estadoSonoff      = "ENCENDIDO";
    }else{
        onDisabled  = "";
        offDisabled = "DISABLED";
        colorSonoff       = "red";
        estadoSonoff      = "APAGADO";
    }
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
body {font-family: "Lato", sans-serif; font-size: 12px;}
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MQTT demo</title>
    </head>
    <body>
        <h1>MQTT demo 27/04/2020 - v0.4</h1>
        <hr>
        versión síncrona
        
        <br>
        <br>
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
                <td valign="top">
                    <fieldset>
                        <legend>Raspberry:</legend>
                        <b><div style="font-size: 18px;"><%=rpi.getFecha()%></div></b>
                        <table>
                            <tr>
                                <td colspan="2" align="center">
                                    
                                    <hr>
                                </td>
                            </tr>
                            <tr>
                                <td>Temperatura:</td>
                                <td align="center"><b><div style="font-size: 20px;"><%=rpi.getTemp()%> ºC</div></b></td>
                            </tr>
                            <tr>
                                <td>Presión:</td>
                                <td align="center"><b><div style="font-size: 18px;"><%=rpi.getPress()%> HPa</div></b></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Ultima lectura</a></td>
                            </tr>
                        </table>

                    </fieldset>
                </td>
            </tr>
        </table>
    </body>
</html>
