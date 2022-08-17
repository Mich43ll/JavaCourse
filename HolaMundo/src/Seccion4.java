/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Michaell
 */
public class Seccion4 {

    public static void main(String args[]) {
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1;
        System.out.println("a = " + a);

        a += 3;
        System.out.println("a = " + a);

        a -= 3;
        System.out.println("a = " + a);
        // /= *= %=

        //OPERADORES UNARIOS
        var d = 3;
        var e = -d;
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //verdadero y falso
        var bool = true;
        var fal = !bool;
        System.out.println("bool = " + bool);
        System.out.println("fal = " + fal);

        System.out.println("Incremento");
        //Inremento
        //1. Preincremento (simbolo antes de la variable)
        var f = 3;
        var g = ++f;
        System.out.println("f = " + f); //primero se incrementa la variable y despues se usa su valor
        System.out.println("g = " + g);

        //2. Posincremento(simboolo despues de la variable)
        var h = 5;
        var i = h++; //primero se usa el valor y despues se incrementa
        System.out.println("h = " + h);
        System.out.println("i = " + i);

        System.out.println("Decremento");
        //decremento
        //1. Predecremento (simbolo antes de la variable)
        var j = 3;
        var k = --j;
        System.out.println("j = " + j); //primero se incrementa la variable y despues se usa su valor
        System.out.println("k = " + k);

        //2. Posdecremento(simboolo despues de la variable)
        var l = 5;
        var m = l--; //primero se usa el valor y despues se incrementa
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //OPERADORES DE IGUALDAD Y RELACIONALES
        var num1 = 3;
        var num2 = 2;
        var num3 = (num1 == num2);
        System.out.println("num3 = " + num3);
        var num4 = (num1 != num2);
        System.out.println("num4 = " + num4);

        //USO DE CADENAS
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var string1 = cadena1 == cadena2;//compara referencias de objetos
        System.out.println("string1 = " + string1);
        var string2 = cadena1.equals(cadena2);
        System.out.println("string2 = " + string2);

        //OPERADORES RELACIONALES
        System.out.println("OPERADORES RELACIONALES");
        var p = a >= b;
        System.out.println("p = " + p);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 15;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es un adulto");
        }else {
            System.out.println("Es menor de edad");
        }
        
    }
}
