package test;

import domain.Persona;

public class TestFinal{
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println(miVariable);
        //La palabra final en una variable la convierte en 
        //estatica y no se puede modificar su varible 
        //miVariable = 5;

        //Persona.CONSTANTE= 5;
        System.out.println(Persona.CONSTANTE);

        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //al marcarse el objeto como final 
        //no se puede volver a hacer referencia a otra clase

        persona1.setNombre("Michaell");
        System.out.println(persona1.getNombre());
        //Pero si podemos modificar el valor de sus atributos
    }
}