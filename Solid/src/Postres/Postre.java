/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor, double precioParcial){
        aderezos= new ArrayList<>();
        this.sabor=sabor;   
        this.precioParcial=precioParcial;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

}
