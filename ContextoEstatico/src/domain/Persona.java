package domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    //de no ser static el valor de la variable se reiniciaria 
    //con cada uso que hagamos de la clase 

    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "[IdPeronsa: "+idPersona+
                ", Nombre: "+nombre+
                ", Contador Persona: "+ idPersona+"]";
    }

}
