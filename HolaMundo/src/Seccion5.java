import java.util.Scanner;

public class Seccion5 {
    public static void main(String[] args) {
        //SENTENCIA IF ELSE
        System.out.println("Sentencia IF-ELSE");
        var condicion = false;

        if(condicion == true)
            System.out.println("Condicion verdadera");
        else
            System.out.println("Condicion falsa");
        
        var numero =5;
        var numeroTexto ="Numero desconocido";

        if(numero==1){
            numeroTexto = "Numero uno";
        }
        else if (numero==2){
            numeroTexto = "Numero dos";
        }
        else if (numero==3){
            numeroTexto = "Numero tres";
        }
        else if (numero==4){
            numeroTexto = "Numero cuatro";
        }
        else {
            System.out.println(numeroTexto);
        }

        System.out.println("INGRESE UN MES:");
        var escaner = new Scanner(System.in);
        var mes = Integer.parseInt(escaner.nextLine());
        var estacion = "Estacion desconocida";

        if(mes == 1||mes==2 || mes == 12)
        estacion= "Invierno";
        else if(mes == 6 || mes==7 || mes == 8)
        estacion = "Primavera";
        else if (mes==9||mes==10||mes==11)
        estacion = "Verano";
        else if (mes==3||mes==4||mes==5)
        estacion = "Otoño";

        System.out.println(estacion);

        System.out.println("SENTENCIA SWITCH");
        
    }
}
