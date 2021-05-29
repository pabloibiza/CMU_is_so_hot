/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Autor: Oscar
 */

var wsUri = "ws://" + document.location.host + "/cmu-Client-0.1/usuario";
var webSocket;


var tablaUsuarios = document.getElementById("tablaUsuarios");

openSocket();

function openSocket() {
    console.log("openSocket js");
    
    if (webSocket !== undefined && webSocket.readyState !== WebSocket.CLOSED) {
        closeSocket();
    }


  
    webSocket = new WebSocket(wsUri);


    

    webSocket.onopen = function (event) {
        if (event.data === undefined)
            return;
    };


    webSocket.onmessage = function (event) {
        var txt = event.data;
        nuevoUsuario(txt);
        
    };

    webSocket.onclose = function (event) {
       

    };

    webSocket.onerror = function (event) {
       
    };
}

function closeSocket() {
    webSocket.close();
}


function nuevoUsuario(text) {
    tablaUsuarios.innerHTML += text;
}

