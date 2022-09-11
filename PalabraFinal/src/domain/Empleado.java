package domain;

public class Empleado extends Persona {
    //Final en un metodo evita que se pueda sobreescribir el metodo
    //definido en la clase padre
    @Override
    public void imprimir(){
        System.out.println("Metodo nuevo");
    }

}
