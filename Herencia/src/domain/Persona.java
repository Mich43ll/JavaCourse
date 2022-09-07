package domain;

public class Persona {
    protected String nombre; //con protected las clases hijas pueden acceder
    protected char genero;
    protected int edad; 
    protected String direccion;

    public Persona(){

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }
     
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getEdad() {
        return this.edad;
    }

    public char getGenero() {
        return this.genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre= ").append(nombre);
        sb.append(", edad= ").append(edad);
        sb.append(", genero= ").append(genero);
        sb.append(", direccion= ").append(direccion);
        return sb.toString();
    }
    
    
}
