
package Leche;

import Postres.Pastel;
import Postres.Postre;


public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarPostre(Postre postre){
        // Lanzar error No se puede usar en pastel
        if(postre.getClass() == Pastel.class){
            throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
        }
        System.out.println("Usando leche deslactosada");
    }
        
}
