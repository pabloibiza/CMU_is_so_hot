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

    public List<String> getLista(String habitacion) {
        List<String> medicionesPorHabitacion = null;
        
        for (Medicion m:  mediciones){
            if (m.getHabitacion().equals(habitacion)){
                 medicionesPorHabitacion.add(m.toString());
            }
           
        }
        return medicionesPorHabitacion;
    }

}
