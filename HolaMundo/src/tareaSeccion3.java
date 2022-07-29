/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Michaell
 */
public class tareaSeccion3 {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Envio Gratuito (true/false): ");
        var envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito:" + envioGratuito);
    }
}
