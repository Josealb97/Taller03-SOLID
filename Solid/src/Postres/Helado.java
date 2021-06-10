package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Helado extends Postre{
    
    public Helado(String sabor){
        super(sabor,7.85);
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    } 
}

