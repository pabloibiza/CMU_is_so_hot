
package client.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMedicionHabitacion_QNAME = new QName("http://jaxws.servidor/", "getMedicionHabitacion");
    private final static QName _AddUsuario_QNAME = new QName("http://jaxws.servidor/", "addUsuario");
    private final static QName _RemoveUsuario_QNAME = new QName("http://jaxws.servidor/", "removeUsuario");
    private final static QName _AddMedicion_QNAME = new QName("http://jaxws.servidor/", "addMedicion");
    private final static QName _GetUsuario_QNAME = new QName("http://jaxws.servidor/", "getUsuario");
    private final static QName _GetUsuarios_QNAME = new QName("http://jaxws.servidor/", "getUsuarios");
    private final static QName _EditUsuario_QNAME = new QName("http://jaxws.servidor/", "editUsuario");
    private final static QName _RemoveUsuarioResponse_QNAME = new QName("http://jaxws.servidor/", "removeUsuarioResponse");
    private final static QName _GetMediciones_QNAME = new QName("http://jaxws.servidor/", "getMediciones");
    private final static QName _AddUsuarioResponse_QNAME = new QName("http://jaxws.servidor/", "addUsuarioResponse");
    private final static QName _GetUsuarioLogin_QNAME = new QName("http://jaxws.servidor/", "getUsuarioLogin");
    private final static QName _GetMedicionResponse_QNAME = new QName("http://jaxws.servidor/", "getMedicionResponse");
    private final static QName _GetUsuarioLoginResponse_QNAME = new QName("http://jaxws.servidor/", "getUsuarioLoginResponse");
    private final static QName _AddMedicionResponse_QNAME = new QName("http://jaxws.servidor/", "addMedicionResponse");
    private final static QName _GetHabitacionesResponse_QNAME = new QName("http://jaxws.servidor/", "getHabitacionesResponse");
    private final static QName _RemoveHabitacion_QNAME = new QName("http://jaxws.servidor/", "removeHabitacion");
    private final static QName _EditHabitacion_QNAME = new QName("http://jaxws.servidor/", "editHabitacion");
    private final static QName _GetHabitacionResponse_QNAME = new QName("http://jaxws.servidor/", "getHabitacionResponse");
    private final static QName _RemoveMedicion_QNAME = new QName("http://jaxws.servidor/", "removeMedicion");
    private final static QName _EditUsuarioResponse_QNAME = new QName("http://jaxws.servidor/", "editUsuarioResponse");
    private final static QName _AddHabitacionResponse_QNAME = new QName("http://jaxws.servidor/", "addHabitacionResponse");
    private final static QName _AddHabitacion_QNAME = new QName("http://jaxws.servidor/", "addHabitacion");
    private final static QName _GetNumUsuario_QNAME = new QName("http://jaxws.servidor/", "getNumUsuario");
    private final static QName _GetUsuariosResponse_QNAME = new QName("http://jaxws.servidor/", "getUsuariosResponse");
    private final static QName _Hello_QNAME = new QName("http://jaxws.servidor/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://jaxws.servidor/", "helloResponse");
    private final static QName _EditMedicion_QNAME = new QName("http://jaxws.servidor/", "editMedicion");
    private final static QName _GetNumUsuarioResponse_QNAME = new QName("http://jaxws.servidor/", "getNumUsuarioResponse");
    private final static QName _EditHabitacionResponse_QNAME = new QName("http://jaxws.servidor/", "editHabitacionResponse");
    private final static QName _EditMedicionResponse_QNAME = new QName("http://jaxws.servidor/", "editMedicionResponse");
    private final static QName _GetHabitacion_QNAME = new QName("http://jaxws.servidor/", "getHabitacion");
    private final static QName _GetMedicionHabitacionResponse_QNAME = new QName("http://jaxws.servidor/", "getMedicionHabitacionResponse");
    private final static QName _GetHabitaciones_QNAME = new QName("http://jaxws.servidor/", "getHabitaciones");
    private final static QName _GetMedicion_QNAME = new QName("http://jaxws.servidor/", "getMedicion");
    private final static QName _RemoveMedicionResponse_QNAME = new QName("http://jaxws.servidor/", "removeMedicionResponse");
    private final static QName _RemoveHabitacionResponse_QNAME = new QName("http://jaxws.servidor/", "removeHabitacionResponse");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://jaxws.servidor/", "getUsuarioResponse");
    private final static QName _GetMedicionesResponse_QNAME = new QName("http://jaxws.servidor/", "getMedicionesResponse");
    private final static QName _GetMedicionID_QNAME = new QName("http://jaxws.servidor/", "getMedicionID");
    private final static QName _GetMedicionIDResponse_QNAME = new QName("http://jaxws.servidor/", "getMedicionIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHabitacionResponse }
     * 
     */
    public GetHabitacionResponse createGetHabitacionResponse() {
        return new GetHabitacionResponse();
    }

    /**
     * Create an instance of {@link RemoveMedicion }
     * 
     */
    public RemoveMedicion createRemoveMedicion() {
        return new RemoveMedicion();
    }

    /**
     * Create an instance of {@link GetHabitacionesResponse }
     * 
     */
    public GetHabitacionesResponse createGetHabitacionesResponse() {
        return new GetHabitacionesResponse();
    }

    /**
     * Create an instance of {@link RemoveHabitacion }
     * 
     */
    public RemoveHabitacion createRemoveHabitacion() {
        return new RemoveHabitacion();
    }

    /**
     * Create an instance of {@link EditHabitacion }
     * 
     */
    public EditHabitacion createEditHabitacion() {
        return new EditHabitacion();
    }

    /**
     * Create an instance of {@link AddMedicionResponse }
     * 
     */
    public AddMedicionResponse createAddMedicionResponse() {
        return new AddMedicionResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioLogin }
     * 
     */
    public GetUsuarioLogin createGetUsuarioLogin() {
        return new GetUsuarioLogin();
    }

    /**
     * Create an instance of {@link GetMedicionResponse }
     * 
     */
    public GetMedicionResponse createGetMedicionResponse() {
        return new GetMedicionResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioLoginResponse }
     * 
     */
    public GetUsuarioLoginResponse createGetUsuarioLoginResponse() {
        return new GetUsuarioLoginResponse();
    }

    /**
     * Create an instance of {@link AddUsuarioResponse }
     * 
     */
    public AddUsuarioResponse createAddUsuarioResponse() {
        return new AddUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetMediciones }
     * 
     */
    public GetMediciones createGetMediciones() {
        return new GetMediciones();
    }

    /**
     * Create an instance of {@link RemoveUsuarioResponse }
     * 
     */
    public RemoveUsuarioResponse createRemoveUsuarioResponse() {
        return new RemoveUsuarioResponse();
    }

    /**
     * Create an instance of {@link EditUsuario }
     * 
     */
    public EditUsuario createEditUsuario() {
        return new EditUsuario();
    }

    /**
     * Create an instance of {@link GetUsuarios }
     * 
     */
    public GetUsuarios createGetUsuarios() {
        return new GetUsuarios();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link RemoveUsuario }
     * 
     */
    public RemoveUsuario createRemoveUsuario() {
        return new RemoveUsuario();
    }

    /**
     * Create an instance of {@link AddMedicion }
     * 
     */
    public AddMedicion createAddMedicion() {
        return new AddMedicion();
    }

    /**
     * Create an instance of {@link GetMedicionHabitacion }
     * 
     */
    public GetMedicionHabitacion createGetMedicionHabitacion() {
        return new GetMedicionHabitacion();
    }

    /**
     * Create an instance of {@link AddUsuario }
     * 
     */
    public AddUsuario createAddUsuario() {
        return new AddUsuario();
    }

    /**
     * Create an instance of {@link GetMedicionIDResponse }
     * 
     */
    public GetMedicionIDResponse createGetMedicionIDResponse() {
        return new GetMedicionIDResponse();
    }

    /**
     * Create an instance of {@link GetMedicionID }
     * 
     */
    public GetMedicionID createGetMedicionID() {
        return new GetMedicionID();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetMedicionesResponse }
     * 
     */
    public GetMedicionesResponse createGetMedicionesResponse() {
        return new GetMedicionesResponse();
    }

    /**
     * Create an instance of {@link RemoveHabitacionResponse }
     * 
     */
    public RemoveHabitacionResponse createRemoveHabitacionResponse() {
        return new RemoveHabitacionResponse();
    }

    /**
     * Create an instance of {@link GetHabitaciones }
     * 
     */
    public GetHabitaciones createGetHabitaciones() {
        return new GetHabitaciones();
    }

    /**
     * Create an instance of {@link GetMedicion }
     * 
     */
    public GetMedicion createGetMedicion() {
        return new GetMedicion();
    }

    /**
     * Create an instance of {@link RemoveMedicionResponse }
     * 
     */
    public RemoveMedicionResponse createRemoveMedicionResponse() {
        return new RemoveMedicionResponse();
    }

    /**
     * Create an instance of {@link EditMedicion }
     * 
     */
    public EditMedicion createEditMedicion() {
        return new EditMedicion();
    }

    /**
     * Create an instance of {@link GetNumUsuarioResponse }
     * 
     */
    public GetNumUsuarioResponse createGetNumUsuarioResponse() {
        return new GetNumUsuarioResponse();
    }

    /**
     * Create an instance of {@link EditHabitacionResponse }
     * 
     */
    public EditHabitacionResponse createEditHabitacionResponse() {
        return new EditHabitacionResponse();
    }

    /**
     * Create an instance of {@link EditMedicionResponse }
     * 
     */
    public EditMedicionResponse createEditMedicionResponse() {
        return new EditMedicionResponse();
    }

    /**
     * Create an instance of {@link GetHabitacion }
     * 
     */
    public GetHabitacion createGetHabitacion() {
        return new GetHabitacion();
    }

    /**
     * Create an instance of {@link GetMedicionHabitacionResponse }
     * 
     */
    public GetMedicionHabitacionResponse createGetMedicionHabitacionResponse() {
        return new GetMedicionHabitacionResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosResponse }
     * 
     */
    public GetUsuariosResponse createGetUsuariosResponse() {
        return new GetUsuariosResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddHabitacion }
     * 
     */
    public AddHabitacion createAddHabitacion() {
        return new AddHabitacion();
    }

    /**
     * Create an instance of {@link GetNumUsuario }
     * 
     */
    public GetNumUsuario createGetNumUsuario() {
        return new GetNumUsuario();
    }

    /**
     * Create an instance of {@link EditUsuarioResponse }
     * 
     */
    public EditUsuarioResponse createEditUsuarioResponse() {
        return new EditUsuarioResponse();
    }

    /**
     * Create an instance of {@link AddHabitacionResponse }
     * 
     */
    public AddHabitacionResponse createAddHabitacionResponse() {
        return new AddHabitacionResponse();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link Medicion }
     * 
     */
    public Medicion createMedicion() {
        return new Medicion();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionHabitacion")
    public JAXBElement<GetMedicionHabitacion> createGetMedicionHabitacion(GetMedicionHabitacion value) {
        return new JAXBElement<GetMedicionHabitacion>(_GetMedicionHabitacion_QNAME, GetMedicionHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addUsuario")
    public JAXBElement<AddUsuario> createAddUsuario(AddUsuario value) {
        return new JAXBElement<AddUsuario>(_AddUsuario_QNAME, AddUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeUsuario")
    public JAXBElement<RemoveUsuario> createRemoveUsuario(RemoveUsuario value) {
        return new JAXBElement<RemoveUsuario>(_RemoveUsuario_QNAME, RemoveUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMedicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addMedicion")
    public JAXBElement<AddMedicion> createAddMedicion(AddMedicion value) {
        return new JAXBElement<AddMedicion>(_AddMedicion_QNAME, AddMedicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuarios")
    public JAXBElement<GetUsuarios> createGetUsuarios(GetUsuarios value) {
        return new JAXBElement<GetUsuarios>(_GetUsuarios_QNAME, GetUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editUsuario")
    public JAXBElement<EditUsuario> createEditUsuario(EditUsuario value) {
        return new JAXBElement<EditUsuario>(_EditUsuario_QNAME, EditUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeUsuarioResponse")
    public JAXBElement<RemoveUsuarioResponse> createRemoveUsuarioResponse(RemoveUsuarioResponse value) {
        return new JAXBElement<RemoveUsuarioResponse>(_RemoveUsuarioResponse_QNAME, RemoveUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMediciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMediciones")
    public JAXBElement<GetMediciones> createGetMediciones(GetMediciones value) {
        return new JAXBElement<GetMediciones>(_GetMediciones_QNAME, GetMediciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addUsuarioResponse")
    public JAXBElement<AddUsuarioResponse> createAddUsuarioResponse(AddUsuarioResponse value) {
        return new JAXBElement<AddUsuarioResponse>(_AddUsuarioResponse_QNAME, AddUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuarioLogin")
    public JAXBElement<GetUsuarioLogin> createGetUsuarioLogin(GetUsuarioLogin value) {
        return new JAXBElement<GetUsuarioLogin>(_GetUsuarioLogin_QNAME, GetUsuarioLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionResponse")
    public JAXBElement<GetMedicionResponse> createGetMedicionResponse(GetMedicionResponse value) {
        return new JAXBElement<GetMedicionResponse>(_GetMedicionResponse_QNAME, GetMedicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuarioLoginResponse")
    public JAXBElement<GetUsuarioLoginResponse> createGetUsuarioLoginResponse(GetUsuarioLoginResponse value) {
        return new JAXBElement<GetUsuarioLoginResponse>(_GetUsuarioLoginResponse_QNAME, GetUsuarioLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMedicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addMedicionResponse")
    public JAXBElement<AddMedicionResponse> createAddMedicionResponse(AddMedicionResponse value) {
        return new JAXBElement<AddMedicionResponse>(_AddMedicionResponse_QNAME, AddMedicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHabitacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getHabitacionesResponse")
    public JAXBElement<GetHabitacionesResponse> createGetHabitacionesResponse(GetHabitacionesResponse value) {
        return new JAXBElement<GetHabitacionesResponse>(_GetHabitacionesResponse_QNAME, GetHabitacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeHabitacion")
    public JAXBElement<RemoveHabitacion> createRemoveHabitacion(RemoveHabitacion value) {
        return new JAXBElement<RemoveHabitacion>(_RemoveHabitacion_QNAME, RemoveHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editHabitacion")
    public JAXBElement<EditHabitacion> createEditHabitacion(EditHabitacion value) {
        return new JAXBElement<EditHabitacion>(_EditHabitacion_QNAME, EditHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getHabitacionResponse")
    public JAXBElement<GetHabitacionResponse> createGetHabitacionResponse(GetHabitacionResponse value) {
        return new JAXBElement<GetHabitacionResponse>(_GetHabitacionResponse_QNAME, GetHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMedicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeMedicion")
    public JAXBElement<RemoveMedicion> createRemoveMedicion(RemoveMedicion value) {
        return new JAXBElement<RemoveMedicion>(_RemoveMedicion_QNAME, RemoveMedicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editUsuarioResponse")
    public JAXBElement<EditUsuarioResponse> createEditUsuarioResponse(EditUsuarioResponse value) {
        return new JAXBElement<EditUsuarioResponse>(_EditUsuarioResponse_QNAME, EditUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addHabitacionResponse")
    public JAXBElement<AddHabitacionResponse> createAddHabitacionResponse(AddHabitacionResponse value) {
        return new JAXBElement<AddHabitacionResponse>(_AddHabitacionResponse_QNAME, AddHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "addHabitacion")
    public JAXBElement<AddHabitacion> createAddHabitacion(AddHabitacion value) {
        return new JAXBElement<AddHabitacion>(_AddHabitacion_QNAME, AddHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getNumUsuario")
    public JAXBElement<GetNumUsuario> createGetNumUsuario(GetNumUsuario value) {
        return new JAXBElement<GetNumUsuario>(_GetNumUsuario_QNAME, GetNumUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuariosResponse")
    public JAXBElement<GetUsuariosResponse> createGetUsuariosResponse(GetUsuariosResponse value) {
        return new JAXBElement<GetUsuariosResponse>(_GetUsuariosResponse_QNAME, GetUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMedicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editMedicion")
    public JAXBElement<EditMedicion> createEditMedicion(EditMedicion value) {
        return new JAXBElement<EditMedicion>(_EditMedicion_QNAME, EditMedicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getNumUsuarioResponse")
    public JAXBElement<GetNumUsuarioResponse> createGetNumUsuarioResponse(GetNumUsuarioResponse value) {
        return new JAXBElement<GetNumUsuarioResponse>(_GetNumUsuarioResponse_QNAME, GetNumUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editHabitacionResponse")
    public JAXBElement<EditHabitacionResponse> createEditHabitacionResponse(EditHabitacionResponse value) {
        return new JAXBElement<EditHabitacionResponse>(_EditHabitacionResponse_QNAME, EditHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMedicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "editMedicionResponse")
    public JAXBElement<EditMedicionResponse> createEditMedicionResponse(EditMedicionResponse value) {
        return new JAXBElement<EditMedicionResponse>(_EditMedicionResponse_QNAME, EditMedicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getHabitacion")
    public JAXBElement<GetHabitacion> createGetHabitacion(GetHabitacion value) {
        return new JAXBElement<GetHabitacion>(_GetHabitacion_QNAME, GetHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionHabitacionResponse")
    public JAXBElement<GetMedicionHabitacionResponse> createGetMedicionHabitacionResponse(GetMedicionHabitacionResponse value) {
        return new JAXBElement<GetMedicionHabitacionResponse>(_GetMedicionHabitacionResponse_QNAME, GetMedicionHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHabitaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getHabitaciones")
    public JAXBElement<GetHabitaciones> createGetHabitaciones(GetHabitaciones value) {
        return new JAXBElement<GetHabitaciones>(_GetHabitaciones_QNAME, GetHabitaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicion")
    public JAXBElement<GetMedicion> createGetMedicion(GetMedicion value) {
        return new JAXBElement<GetMedicion>(_GetMedicion_QNAME, GetMedicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMedicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeMedicionResponse")
    public JAXBElement<RemoveMedicionResponse> createRemoveMedicionResponse(RemoveMedicionResponse value) {
        return new JAXBElement<RemoveMedicionResponse>(_RemoveMedicionResponse_QNAME, RemoveMedicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "removeHabitacionResponse")
    public JAXBElement<RemoveHabitacionResponse> createRemoveHabitacionResponse(RemoveHabitacionResponse value) {
        return new JAXBElement<RemoveHabitacionResponse>(_RemoveHabitacionResponse_QNAME, RemoveHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionesResponse")
    public JAXBElement<GetMedicionesResponse> createGetMedicionesResponse(GetMedicionesResponse value) {
        return new JAXBElement<GetMedicionesResponse>(_GetMedicionesResponse_QNAME, GetMedicionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionID")
    public JAXBElement<GetMedicionID> createGetMedicionID(GetMedicionID value) {
        return new JAXBElement<GetMedicionID>(_GetMedicionID_QNAME, GetMedicionID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicionIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.servidor/", name = "getMedicionIDResponse")
    public JAXBElement<GetMedicionIDResponse> createGetMedicionIDResponse(GetMedicionIDResponse value) {
        return new JAXBElement<GetMedicionIDResponse>(_GetMedicionIDResponse_QNAME, GetMedicionIDResponse.class, null, value);
    }

}
