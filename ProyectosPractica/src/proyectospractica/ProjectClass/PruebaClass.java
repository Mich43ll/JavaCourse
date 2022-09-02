package proyectospractica.ProjectClass;

import java.util.Scanner;

public class PruebaClass {

    //========= Calculadora con el uso de las clases =========
    public static void main(String[] args) {
        Class class1 = new Class(); //conexion a la clase
        var scaner = new Scanner(System.in); 

        System.out.println("Ingrese el valor de A: ");
        class1.a = Float.parseFloat(scaner.nextLine()); //Ingresamos el valor de A

        System.out.println("Ingrese el valor de B: ");
        class1.b = Float.parseFloat(scaner.nextLine()); //Ingresamos el valor de B

        if (class1.a == 0 || class1.b == 0){ //Validacion, si un numero es igual a 0 el programa termina
            System.out.println("Ninguno de los valores puede ser 0");
            System.exit(0);
        }
        

        System.out.println("1. Suma"); //Menu de opciones 
        System.out.println("2. Resta");
        System.out.println("3. Division");
        System.out.println("4. Multiplicacion");
        System.out.println("Ingrese una opción: ");
        class1.op = Integer.parseInt(scaner.nextLine()); //Ingresamos la opcion deseada
        
        
        class1.Menu(); //Llamamos la funcion de menu para realizar la operacion 
    }
    
}
