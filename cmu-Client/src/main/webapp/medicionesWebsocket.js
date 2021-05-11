/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var webSocket;

var wsUri = "ws://" + document.location.host + "/cmu-Client/usuarios";
var tablaUsuarios = document.getElementById("tablaUsuarios");

openSocket();


function openSocket() {
    // Ensures only one connection is open at a time
    if (webSocket !== undefined && webSocket.readyState !== WebSocket.CLOSED) {
        closeSocket();
    }
    
    // Create a new instance of the websocket
    webSocket = new WebSocket(wsUri);
    console.log("creado");

    webSocket.onopen = function (event) {
        if (event.data === undefined)
            return;
    };

    webSocket.onmessage = function (event) {
        var txt = event.data;

        if (txt.indexOf("&") > -1) {
            nuevoUsuario(txt.substr(2));
        }

    };

    webSocket.onclose = function (event) {
        //writeMessage("Connection Closed");

    };

    webSocket.onerror = function (event) {
        // writeMessage("ERROR: "+event.toString());
    };
}



function closeSocket() {
    webSocket.close();
}

function nuevoUsuario(text) {
    console.log(text);
    tablaUsuarios.innerHTML += text;
}

function borrar() {
    messages.innerHTML = "";
}


