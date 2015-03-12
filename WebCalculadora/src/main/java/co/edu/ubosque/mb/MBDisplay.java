/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.ubosque.mb;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author F210
 */
@ManagedBean
public class MBDisplay {
    
    private String resultado="0";

    public MBDisplay() {
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
        
    
}
