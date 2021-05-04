/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import client.ws.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ListarUsuarios {
    List<Usuario> usuarios = new ArrayList();
    
    
    public ListarUsuarios(){
        
    }
    
    public ListarUsuarios(List<Usuario> _lista){
        this.usuarios = _lista;
    }
    
    public void setLista (List<Usuario> _lista){
        this.usuarios = _lista;
    }
    
    public List<Usuario> getLista(){
        return usuarios;
    }
    
}
