
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michaell
 */
public class EjerciciosSeccion3 {
    public static void main(String args[]){
        var numeroEntero =10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat=10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        
        //Tipos de datos CHAR
        char miCaracter = 'a';
        System.out.println("\nmiCaracter = " + miCaracter);
        
        char varChar = '\u0021'; //caracter unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; //caracter con numero decimal
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021'; //caracter unicode
        System.out.println("varChar = " + varChar1);
        
        var varCharDecimal2 = 33; //caracter con numero decimal
        System.out.println("varCharDecimal = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo3);
        
        int EnteraSimbolo = '!';
        System.out.println("EnteraSimbolo = " + EnteraSimbolo);
        
        
        //VARIABLES DE TIPO BOOLEAN
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }
        else
        {
            System.out.println("La bandera es falsa");
        }
        
        var edad=15;
        //var adulto= edad >=18; Comparacion dentro de una variable
        
        if (edad >=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
             
        
        //CONVERSIONES DE TIPOS 
        //Convertir tipo String a un tipo Int
        var edad2 = Integer.parseInt("20");
        System.out.println("edad2 = " + (edad2+1));
        
        var ValorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + ValorPI);
        
//        //PEDIR UN VALOR   
      var consola=new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println(edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
