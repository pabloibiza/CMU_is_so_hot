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
import servidor.bd.Medicion;
import servidor.bd.MedicionFacade;
import servidor.bd.Usuario;
import servidor.bd.UsuarioFacade;

/**
 *
 * @author Carlos
 */
@WebService(serviceName = "CMUService")

public class CMUService {

    @EJB UsuarioFacade us;
    @EJB MedicionFacade med;
    
    @WebMethod(operationName = "addUsuario")
    public void addUsuario(@WebParam(name = "usuario") Usuario usuario) {
       us.create(usuario);
    }

    @WebMethod(operationName = "getUsuario")
    public Usuario getUsuario(@WebParam(name = "id") Long id) {
        Usuario u = null;
        u = us.find(id);
        return u;
    }
    
    @WebMethod(operationName = "editUsuario")
    public void editUsuario(@WebParam(name = "usuario") Usuario usuario) {
        us.edit(usuario);
    }

    @WebMethod(operationName = "removeUsuario")
    public void removeUsuario(@WebParam(name = "usuario") Usuario usuario) {
        us.remove(usuario);
    }
    
    @WebMethod(operationName = "getNumUsuario")
    public int getNumUsuario() {
        return us.count();
    }
    
    @WebMethod(operationName = "getUsuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuario = us.findAll();
        if (usuario==null){
            usuario = new ArrayList();
        }
        return usuario;
    }
    
    @WebMethod(operationName = "getUsuarioLogin")
    public Usuario getUsuarioLogin(@WebParam(name = "nombre") String nombre) {
        Usuario u = null;
        u = us.find(nombre);
        return u;
    }
    
    @WebMethod(operationName = "addMedicion")
    public void addMedicion(@WebParam(name = "medicion") Medicion medicion) {
       med.create(medicion);
    }
    
    @WebMethod(operationName = "getMedicionID")
    public Medicion getMedicionID(@WebParam(name = "id") Long id) {
        Medicion medi = null;
        medi = med.find(id);
        return medi;
    }
    
    @WebMethod(operationName = "getMedicionesHabitacion")
    public List<Medicion> getMedicionesHabitacion(@WebParam(name = "habitacion") String habitacion) {
        List<Medicion> mediciones = med.findMediciones(habitacion);
        if (mediciones==null){
            mediciones = new ArrayList();
        }
        return mediciones;
    }
    
    @WebMethod(operationName = "getMedicionesPlanta")
    public List<Medicion> getMedicionesPlanta(@WebParam(name = "planta") String planta) {
        List<Medicion> mediciones = med.findMedicionesPlanta(planta);
        if (mediciones==null){
            mediciones = new ArrayList();
        }
        return mediciones;
    }
    
    @WebMethod(operationName = "getMedicionHabitacion")
    public Medicion getMedicionHabitacion(@WebParam(name = "habitacion") String habitacion) {
        Medicion m = null;
        m = med.find(habitacion);
        return m;
    }
    
    @WebMethod(operationName = "editMedicion")
    public void editMedicion(@WebParam(name = "medicion") Medicion medicion) {
        med.edit(medicion);
    }
    
    @WebMethod(operationName = "removeMedicion")
    public void removeMedicion(@WebParam(name = "medicion") Medicion medicion) {
        med.remove(medicion);
    }
        
    @WebMethod(operationName = "getMediciones")
    public List<Medicion> getMediciones() {
        List<Medicion> mediciones = med.findAll();
        if (mediciones==null){
            mediciones = new ArrayList();
        }
        return mediciones;
    }
        
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
