/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Michaell
 */
public class tareaSeccion4 {

    public static void main(String args[]) {
        int alto, ancho, area, perimetro;
        var scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        ancho = Integer.parseInt(scanner.nextLine());
        area = alto * ancho;
        System.out.println("Area: " + area);
        perimetro = (alto + ancho) * 2;
        System.out.println("Perimetro = " + perimetro);

        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es: \n" + (numero1 > numero2 ? numero1 : numero2));
    }
}
