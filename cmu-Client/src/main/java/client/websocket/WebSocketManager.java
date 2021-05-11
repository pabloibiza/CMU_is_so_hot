/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author oscar
 */
@ServerEndpoint("/usuario")
public class WebSocketManager {

    private static Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());
    private static WebSocketManager moiMeme = null;

    public WebSocketManager() {
    }

    public static WebSocketManager getInstance() {
        if (moiMeme == null) {
            moiMeme = new WebSocketManager();
        }
        return moiMeme;
    }

    /**
     * @OnOpen allows us to intercept the creation of a new session. The session
     * class allows us to send data to the user. In the method onOpen, we'll let
     * the user know that the handshake was successful.
     */
    @OnOpen
    public void onOpen(Session _session) {
        System.out.println("On open" + sessions.size());
        sessions.add(_session);
    }

    @OnMessage
    public String onMessage(String message) {
        // broadcast del mensaje recibido
        for (Session s : sessions) {

            s.getAsyncRemote().sendText(message);

        }
        return null;
    }

    /**
     * The user closes the connection.
     *
     * Note: you can't send messages to the client from this method
     */
    @OnClose
    public void onClose(Session _session) {
        System.out.println("On close " + sessions.size() );
        sessions.remove(_session);
    }

    public void sendMensaje(String msj) {
        for (Session session : sessions) {
            session.getAsyncRemote().sendText(msj);
        }
    }

}
