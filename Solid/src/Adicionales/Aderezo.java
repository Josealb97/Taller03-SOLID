package Adicionales;


public abstract class Aderezo {
    protected String nombre;

    public Aderezo(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void setNombre(String name);

    @Override
    public String toString() {
        return nombre.toUpperCase();
    }  
}
