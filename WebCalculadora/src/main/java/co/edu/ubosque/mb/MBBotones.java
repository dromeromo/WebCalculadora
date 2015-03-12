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
public class MBBotones {

    public String accionBotton(String cadena) {
        MBDisplay mbd = new MBDisplay();
        mbd.setResultado(cadena);
        return null;
    }

}
