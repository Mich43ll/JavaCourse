package PracticaEncapsulamiento;

public class Persona {
    private String nombre;
    private int edad;
    private boolean matricula;

    public Persona(String nombre, int edad, boolean matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Persona [nombre: "+nombre+
                ", edad: "+edad+
                ", matricula: "+matricula+ "]";
    }


}
