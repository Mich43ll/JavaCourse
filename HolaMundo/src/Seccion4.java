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
    public static void main (String args[]){
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado = " + resultado);
        resultado = a - b;
        System.out.println("resultado = " + resultado);
        resultado = a * b;
        System.out.println("resultado = " + resultado);
        var resultado2 = 3.0/b;
        System.out.println("resultado = " + resultado2);
        resultado=a%b;
        System.out.println("resultado = " + resultado);
        
       if (a % 2 ==0)
            System.out.println("Es numero par");
       else
            System.out.println("Es numero impar");
    }
}
