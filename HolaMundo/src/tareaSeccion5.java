import java.util.Scanner;

public class tareaSeccion5 {

    public static void main (String args[]){
        var escaner = new Scanner(System.in);
        
        String mensaje= "Valor desconocido";
        System.out.println("Ingrese la nota del alumno:");
        int nota = Integer.parseInt(escaner.nextLine()); 
        if (nota >= 9 && nota <= 10)
        mensaje= "A";
        else if (nota >=7 && nota<=8)
        mensaje = "B";
        else if (nota >=6 && nota<=7)
        mensaje = "C";
        else if (nota >=0&&nota<=6)
        mensaje = "F";
        

        System.out.println(mensaje);

    }
    
}
