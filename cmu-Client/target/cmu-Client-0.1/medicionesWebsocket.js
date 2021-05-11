/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



var wsUri = "ws://" + document.location.host + "/cmu-Client/usuario";
var webSocket;
console.log("hola aaadadaffsfsdfdfdf");

var tablaUsuarios = document.getElementById("tablaUsuarios");


openSocket();

function openSocket() {
    console.log("openSocket js");
    // Ensures only one connection is open at a time
    if (webSocket !== undefined && webSocket.readyState !== WebSocket.CLOSED) {
        closeSocket();
    }


    // Create a new instance of the websocket
    webSocket = new WebSocket(wsUri);


    // eventos del websocket ====

    webSocket.onopen = function (event) {
        console.log("openlog");
        if (event.data === undefined)
            return;
    };


    webSocket.onmessage = function (event) {
        var txt = event.data;
        console.log("**********>" + txt);
        nuevoUsuario(txt);
        
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
    tablaUsuarios.innerHTML += text;
}

