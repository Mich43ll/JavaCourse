package PracticaMatrices.Cine.test;

import java.util.Scanner;

public class TestCine {
    public static void main(String[] args) {
        String clientes[][] = { { "X", "X", "X" }, { "X", "X", "X" }, { "X", "X", "X" } };
        int fila;
        int columna;
        int op;
        var exit = 0;
        Scanner scaner = new Scanner(System.in);

        while (exit == 0) {
            System.out.println("Ingrese en que fila desea estar: ");
            fila = Integer.parseInt(scaner.nextLine());
            System.out.println("Ingrese la columna en la que desea estar: ");
            columna = Integer.parseInt(scaner.nextLine());
            if (clientes[fila][columna] == "O") {
                System.out.println("Este asiento esta ocupado");
            } else {
                clientes[fila][columna] = "O";
                imprimir(clientes);
            }
            System.out.println("Desea reservar un nuevo asiento? 1. Si 2.No");
            op = Integer.parseInt(scaner.nextLine());
            if(op==1)
            exit=0;
            else
            exit = 1;
        }
    }

    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println(matriz[ren][col]);
            }
        }
    }
}
