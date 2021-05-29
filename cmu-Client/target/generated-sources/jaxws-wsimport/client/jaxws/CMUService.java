
package client.jaxws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CMUService", targetNamespace = "http://jaxws.servidor/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMUService {


    /**
     * 
     * @param medicion
     */
    @WebMethod
    @RequestWrapper(localName = "addMedicion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddMedicion")
    @ResponseWrapper(localName = "addMedicionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddMedicionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/addMedicionRequest", output = "http://jaxws.servidor/CMUService/addMedicionResponse")
    public void addMedicion(
        @WebParam(name = "medicion", targetNamespace = "")
        Medicion medicion);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNumUsuario", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetNumUsuario")
    @ResponseWrapper(localName = "getNumUsuarioResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetNumUsuarioResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getNumUsuarioRequest", output = "http://jaxws.servidor/CMUService/getNumUsuarioResponse")
    public int getNumUsuario();

    /**
     * 
     * @param nombre
     * @return
     *     returns client.jaxws.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuarioLogin", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuarioLogin")
    @ResponseWrapper(localName = "getUsuarioLoginResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuarioLoginResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getUsuarioLoginRequest", output = "http://jaxws.servidor/CMUService/getUsuarioLoginResponse")
    public Usuario getUsuarioLogin(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

    /**
     * 
     * @param medicion
     */
    @WebMethod
    @RequestWrapper(localName = "removeMedicion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveMedicion")
    @ResponseWrapper(localName = "removeMedicionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveMedicionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/removeMedicionRequest", output = "http://jaxws.servidor/CMUService/removeMedicionResponse")
    public void removeMedicion(
        @WebParam(name = "medicion", targetNamespace = "")
        Medicion medicion);

    /**
     * 
     * @return
     *     returns java.util.List<client.jaxws.Medicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMediciones", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMediciones")
    @ResponseWrapper(localName = "getMedicionesResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionesResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getMedicionesRequest", output = "http://jaxws.servidor/CMUService/getMedicionesResponse")
    public List<Medicion> getMediciones();

    /**
     * 
     * @param medicion
     */
    @WebMethod
    @RequestWrapper(localName = "editMedicion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditMedicion")
    @ResponseWrapper(localName = "editMedicionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditMedicionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/editMedicionRequest", output = "http://jaxws.servidor/CMUService/editMedicionResponse")
    public void editMedicion(
        @WebParam(name = "medicion", targetNamespace = "")
        Medicion medicion);

    /**
     * 
     * @param usuario
     */
    @WebMethod
    @RequestWrapper(localName = "editUsuario", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditUsuario")
    @ResponseWrapper(localName = "editUsuarioResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditUsuarioResponse")
    @Action(input = "http://jaxws.servidor/CMUService/editUsuarioRequest", output = "http://jaxws.servidor/CMUService/editUsuarioResponse")
    public void editUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param usuario
     */
    @WebMethod
    @RequestWrapper(localName = "removeUsuario", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveUsuario")
    @ResponseWrapper(localName = "removeUsuarioResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveUsuarioResponse")
    @Action(input = "http://jaxws.servidor/CMUService/removeUsuarioRequest", output = "http://jaxws.servidor/CMUService/removeUsuarioResponse")
    public void removeUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param id
     * @return
     *     returns client.jaxws.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuario", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuario")
    @ResponseWrapper(localName = "getUsuarioResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuarioResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getUsuarioRequest", output = "http://jaxws.servidor/CMUService/getUsuarioResponse")
    public Usuario getUsuario(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.HelloResponse")
    @Action(input = "http://jaxws.servidor/CMUService/helloRequest", output = "http://jaxws.servidor/CMUService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param usuario
     */
    @WebMethod
    @RequestWrapper(localName = "addUsuario", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddUsuario")
    @ResponseWrapper(localName = "addUsuarioResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddUsuarioResponse")
    @Action(input = "http://jaxws.servidor/CMUService/addUsuarioRequest", output = "http://jaxws.servidor/CMUService/addUsuarioResponse")
    public void addUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @return
     *     returns java.util.List<client.jaxws.Usuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuarios", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuarios")
    @ResponseWrapper(localName = "getUsuariosResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetUsuariosResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getUsuariosRequest", output = "http://jaxws.servidor/CMUService/getUsuariosResponse")
    public List<Usuario> getUsuarios();

    /**
     * 
     * @param habitacion
     * @return
     *     returns client.jaxws.Medicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedicionHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionHabitacion")
    @ResponseWrapper(localName = "getMedicionHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getMedicionHabitacionRequest", output = "http://jaxws.servidor/CMUService/getMedicionHabitacionResponse")
    public Medicion getMedicionHabitacion(
        @WebParam(name = "habitacion", targetNamespace = "")
        String habitacion);

    /**
     * 
     * @param id
     * @return
     *     returns client.jaxws.Medicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedicionID", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionID")
    @ResponseWrapper(localName = "getMedicionIDResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionIDResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getMedicionIDRequest", output = "http://jaxws.servidor/CMUService/getMedicionIDResponse")
    public Medicion getMedicionID(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param planta
     * @return
     *     returns java.util.List<client.jaxws.Medicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedicionesPlanta", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionesPlanta")
    @ResponseWrapper(localName = "getMedicionesPlantaResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionesPlantaResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getMedicionesPlantaRequest", output = "http://jaxws.servidor/CMUService/getMedicionesPlantaResponse")
    public List<Medicion> getMedicionesPlanta(
        @WebParam(name = "planta", targetNamespace = "")
        String planta);

    /**
     * 
     * @param habitacion
     */
    @WebMethod
    @RequestWrapper(localName = "addHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddHabitacion")
    @ResponseWrapper(localName = "addHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.AddHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/addHabitacionRequest", output = "http://jaxws.servidor/CMUService/addHabitacionResponse")
    public void addHabitacion(
        @WebParam(name = "habitacion", targetNamespace = "")
        Habitacion habitacion);

    /**
     * 
     * @return
     *     returns java.util.List<client.jaxws.Habitacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHabitaciones", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetHabitaciones")
    @ResponseWrapper(localName = "getHabitacionesResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetHabitacionesResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getHabitacionesRequest", output = "http://jaxws.servidor/CMUService/getHabitacionesResponse")
    public List<Habitacion> getHabitaciones();

    /**
     * 
     * @param habitacion
     * @return
     *     returns java.util.List<client.jaxws.Medicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedicionesHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionesHabitacion")
    @ResponseWrapper(localName = "getMedicionesHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetMedicionesHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getMedicionesHabitacionRequest", output = "http://jaxws.servidor/CMUService/getMedicionesHabitacionResponse")
    public List<Medicion> getMedicionesHabitacion(
        @WebParam(name = "habitacion", targetNamespace = "")
        String habitacion);

    /**
     * 
     * @param habitacion
     */
    @WebMethod
    @RequestWrapper(localName = "removeHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveHabitacion")
    @ResponseWrapper(localName = "removeHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.RemoveHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/removeHabitacionRequest", output = "http://jaxws.servidor/CMUService/removeHabitacionResponse")
    public void removeHabitacion(
        @WebParam(name = "habitacion", targetNamespace = "")
        Habitacion habitacion);

    /**
     * 
     * @param id
     * @return
     *     returns client.jaxws.Habitacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetHabitacion")
    @ResponseWrapper(localName = "getHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.GetHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/getHabitacionRequest", output = "http://jaxws.servidor/CMUService/getHabitacionResponse")
    public Habitacion getHabitacion(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param habitacion
     */
    @WebMethod
    @RequestWrapper(localName = "editHabitacion", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditHabitacion")
    @ResponseWrapper(localName = "editHabitacionResponse", targetNamespace = "http://jaxws.servidor/", className = "client.jaxws.EditHabitacionResponse")
    @Action(input = "http://jaxws.servidor/CMUService/editHabitacionRequest", output = "http://jaxws.servidor/CMUService/editHabitacionResponse")
    public void editHabitacion(
        @WebParam(name = "habitacion", targetNamespace = "")
        Habitacion habitacion);

}