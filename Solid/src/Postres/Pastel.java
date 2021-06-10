package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre{

    
    public Pastel(String sabor){
        super (sabor,15.55);
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }


    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}
