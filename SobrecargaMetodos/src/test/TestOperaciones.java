package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10, 5);
        System.out.println(resultado);

        var resultado1 = Operaciones.sumar(2D, 3);
        System.out.println(resultado1);

        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println(resultado3);
    }
}
