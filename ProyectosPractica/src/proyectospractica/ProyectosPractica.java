/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectospractica;

import java.util.Scanner;

public class ProyectosPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var escaner = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Desea solicitar un prestamos? 1.SI/2.NO");
        var select = Integer.parseInt(escaner.nextLine());
        if (select == 1) {
            System.out.println("Ingrese su nombre: ");
            var nombre = escaner.nextLine();
            System.out.println("Ingrese su edad: ");
            var edad = Integer.parseInt(escaner.nextLine());
            System.out.println("Ingrese su sueldo mensual: ");
            var sueldo = Double.parseDouble(escaner.nextLine());
            System.out.println("Su nombre es " + nombre);
            if (edad >= 18 && sueldo >= 6000) {
                System.out.println("Prestamo aceptado");
                if (select == 1) {
                    System.out.println("Desea adquirir el prestamo? 1.SI/2.NO");
                    select = Integer.parseInt(escaner.nextLine());
                    System.out.println("Prestamo Otorgado");
                    System.out.println("GRACIAS POR VISITARNOS");
                } else {
                    System.out.println("GRACIAS POR VISITARNOS");
                }
            } else {
                System.out.println("Prestamo rechazado");
                System.out.println("GRACIAS POR VISITARNOS");
            }

        } else {
            System.out.println("GRACIAS POR VISITARNOS");
        }

    }

}
