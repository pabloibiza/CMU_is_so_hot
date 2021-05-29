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
 * @author Oscar
 */
public class ListarMediciones {

    List<Medicion> mediciones = new ArrayList();

    public ListarMediciones() {

    }

    public ListarMediciones(List<Medicion> _lista) {
        this.mediciones = _lista;
    }

    public void setLista(List<Medicion> _lista) {
        this.mediciones = _lista;
    }

    public List<Medicion> getLista() {
        return mediciones;
    }

   

}
