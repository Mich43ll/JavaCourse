package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 2;
        edades[1][1] = 4;
        edades[2][0] = 10;
        edades[2][1] = 11;

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades " + i + " " + j + ": " + edades[i][j]);
            }
        }

        String frutas[][] = { { "Naraja", "Limon" }, { "Fresa", "Zarzamora" } };
        imprmir(frutas);

        Persona personas[][] = new Persona[2][3];
        personas[0][0]=new Persona("Juan");
        personas[0][1]= new Persona("Carla");
        personas[0][2]= new Persona("Maria");
        personas[1][0]= new Persona("Carlos");
        personas[1][1]= new Persona("Pablo");
        personas[1][2]= new Persona("Marlon");
        imprmir(personas);
    }

    
    public static void imprmir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Frutas " + ren + " " + col + ": " + matriz[ren][col]);
            }
        }
    }

}
