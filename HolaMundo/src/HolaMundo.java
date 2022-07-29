
import java.util.Scanner;

//Mi Clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamoselvalor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "no se";
        System.out.println(miVariableCadena);

        //var -inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Adios";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //CONCATENACION JAVA
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//Se realizar una suma
        System.out.println(i + j + usuario); //Evaluacion izq der, realiza la suma
        System.out.println(usuario + i + j); //Contexto de cadena: todo lo toma como una cadena
        System.out.println(usuario + (i + j)); // uso de parentesis modifican la prioridad en la evaluacion

        //CARACTERES ESPECIALES EN JAVA
        var nombre = "karla";
        System.out.println("Nueva linea: \n" + nombre); //Salto de linea
        System.out.println("Tabulador: \t" + nombre); //tabulacion
        System.out.println("Retroceso: \b" + nombre); //corre un caracter atras la impresion de la salida
        System.out.println("Comilla simple: \'" + nombre + "\'"); //comilla simple
        System.out.println("Comilla doble \"" + nombre + "\""); //comilla doble

        //CLASE SCANNER
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario2 = consola.nextLine();
        System.out.println(usuario2);
        System.out.println("Escribe el titulo");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
        
        //EJERCICIO PRACTICO
        System.out.println("Proporciona el titulo:");
        Scanner guardar = new Scanner(System.in);
        var libro = guardar.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = guardar.nextLine();
        System.out.println(libro+" fue escrito por "+autor);
    }
}
