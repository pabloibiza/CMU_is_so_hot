/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author  Pablo
 */
@Stateless
public class Termostato {

    private Boolean estado = false;
    private Boolean primerEncendido = true;

    public Boolean getEstado() {
        return estado;
    }

    public Boolean esPrimerEncendido() {
        return primerEncendido;
    }

    public void setPrimerEncendido(Boolean estado) {
        primerEncendido = estado;
    }

    public void setEstado(Boolean _estado) {
        this.estado = _estado;
    }

}
