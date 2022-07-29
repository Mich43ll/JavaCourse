
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Michaell
 */
public class Seccion3 {

    public static void main(String args[]) {
        /*
        TIPOS PRIMITIVOS ENTEROS: BYTE, SHORT, INT, LONG
         */
        System.out.println("\nTIPOS PRIMITIVOS ENTEROS");
        System.out.println("BYTE");
        byte numeroByte = 10; //solo acepta valores entre -128 y 127
        byte numeroByte2 = (byte) 129; //Conversion de datos
        System.out.println("numeroByte2 = " + numeroByte2);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byete: " + Byte.MAX_VALUE);

        short numeroshort = 10;
        System.out.println("\nSHORT");
        System.out.println("numeroshort = " + numeroshort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);
        
        int numeroInt = 10;
        System.out.println("\nINT");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: "+Integer.MIN_VALUE);
        System.out.println("Valor maximo: "+Integer.MAX_VALUE);
        
        long numeroLong = 10;
        System.out.println("\nLONG");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo: "+Long.MIN_VALUE);
        System.out.println("Valor maximo: "+Long.MAX_VALUE);
        
        
        //TIPOS PRIMITIVOS FLOTANTE: FLOAT, DOUBLE
        System.out.println("\nTIPOS PRIMITIVOS FLOTANTES");
        System.out.println("FLOAT");
    }
}
