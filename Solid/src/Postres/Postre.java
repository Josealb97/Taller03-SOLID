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

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public void anadirAderezoPostre(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezoPostre(Aderezo aderezo){
        aderezos.remove(aderezo);
    }



}
