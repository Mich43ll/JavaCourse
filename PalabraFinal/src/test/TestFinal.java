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
    }
}