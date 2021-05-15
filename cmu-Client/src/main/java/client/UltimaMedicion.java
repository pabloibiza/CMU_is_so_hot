/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.jaxws.Medicion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class UltimaMedicion {
    
      List<Medicion> mediciones = new ArrayList();

    public UltimaMedicion() {

    }

    public UltimaMedicion(Medicion _medicion) {
        this.mediciones.add(_medicion);
    }

  

    public List<Medicion> getLista() {
        return mediciones;
    }
    
}
