
package client.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editMedicion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editMedicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicion" type="{http://jaxws.servidor/}medicion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editMedicion", propOrder = {
    "medicion"
})
public class EditMedicion {

    protected Medicion medicion;

    /**
     * Obtiene el valor de la propiedad medicion.
     * 
     * @return
     *     possible object is
     *     {@link Medicion }
     *     
     */
    public Medicion getMedicion() {
        return medicion;
    }

    /**
     * Define el valor de la propiedad medicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicion }
     *     
     */
    public void setMedicion(Medicion value) {
        this.medicion = value;
    }

}
