package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre{
   
     public Pastel(String sabor){
        super(sabor,15.55);
    }
    
    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    
}
