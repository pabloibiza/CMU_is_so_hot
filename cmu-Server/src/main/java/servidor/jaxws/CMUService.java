/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import servidor.bd.Usuario;
import servidor.bd.UsuarioFacade;

/**
 *
 * @author karlo
 */
@WebService(serviceName = "CMUService")

public class CMUService {

    @EJB UsuarioFacade bd;
    
    @WebMethod(operationName = "addUsuario")
    public void addUsuario(@WebParam(name = "usuario") Usuario usuario) {
       bd.create(usuario);
    }

    @WebMethod(operationName = "getUsuario")
    public Usuario getUsuario(@WebParam(name = "id") Long _id) {
        Usuario p = null;
        p = bd.find(_id);
        return p;
    }
    
    @WebMethod(operationName = "editUsuario")
    public void editUsuario(@WebParam(name = "usuario") Usuario _usuario) {
        bd.edit(_usuario);
    }

    @WebMethod(operationName = "removeUsuario")
    public void removeUsuario(@WebParam(name = "usuario") Usuario _usuario) {
        bd.remove(_usuario);
    }
    
    @WebMethod(operationName = "getNumUsuario")
    public int getNumUsuario() {
        return bd.count();
    }
    
    @WebMethod(operationName = "getUsuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuario = bd.findAll();
        if (usuario==null){
            usuario = new ArrayList();
        }
        return usuario;
    }
    
    @WebMethod(operationName = "getUsuarioLogin")
    public Usuario getUsuarioLogin(@WebParam(name = "nombre") String _nombre) {
        Usuario p = null;
        p = bd.find(_nombre);
        return p;
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
