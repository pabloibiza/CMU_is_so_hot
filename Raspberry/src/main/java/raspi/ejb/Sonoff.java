/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspi.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author fsern
 */
@Stateless
public class Sonoff {
    private Boolean estado = false;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean _estado) {
        this.estado = _estado;
    }
    
}
