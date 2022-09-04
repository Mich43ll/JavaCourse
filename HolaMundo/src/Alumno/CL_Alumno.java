package Alumno;

import java.util.Scanner;

public class CL_Alumno {
    int nota;
    int acumulador = 0; 
    public String nombre; 
    public String apellido;

    public void notaTotal(){
        var scaner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = scaner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scaner.nextLine();
        System.out.println("");
        for(var i = 1; i < 4; i++){
            System.out.println("Ingrese la nota "+i+":");
            nota = Integer.parseInt(scaner.nextLine());
            acumulador = acumulador + nota;
        }
        System.out.println(nombre+" "+apellido);
        System.out.println("El promedio total es: "+acumulador/3);
    }
}
