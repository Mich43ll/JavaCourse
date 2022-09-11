package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Mario");
        personas[1] = new Persona("Carla");
        System.out.println("persona [0]: "+personas[0]);
        System.out.println("persona [1]: "+personas[1]);

        for(int i = 0; i< personas.length ; i++){
            System.out.println(personas[i]);
        }

        //Sintaxis resumisa
        String fruta[] = {"Naranja", "Manzana", "Uva"}; //Inicializando arreglos desde el principio
        for(int i = 0; i< fruta.length ; i++){
            System.out.println("Fruta = "+fruta[i]);
        }

        
    }

}
