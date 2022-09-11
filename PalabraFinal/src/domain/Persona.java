package domain;
//La palabra final en una clase, significa que esta clase no puede tener hijas
public /*final*/ class Persona {
    public final static int CONSTANTE = 1;

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public /*final*/ void imprimir(){
        System.out.println("Metodo imprimir");
    }
    
}
