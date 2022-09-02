package proyectospractica.ProjectClass;

public class Class { 
    int op;
    float a;
    float b;

    
    public void Menu(){

        switch(op){
            case 1:
            System.out.println("La suma es "+(a+b));
            break;
            case 2:
            System.out.println("La resta es "+(a-b));
            break;
            case 3:
            System.out.println("La division es "+String.format("%.2f",a/b));
            break; //String format sirve para limitar las cifras que se imprimen despues del punto
            case 4:
            System.out.println("La multiplicacion es "+(a*b));
            break;
            default:
            System.out.println("Opcion invalida");
            break;
        }

    
    }
}
