package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3]; //para crear un arreglo de 3 espacios
        //Los arreglos no pueden aumentar su tamaño de forma dinamica
        System.out.println(edades);

        edades[0]= 3;
        System.out.println("edades[0]= "+edades[0]);

        edades[1]= 50;
        System.out.println("edades[1]= "+edades[1]);

        edades[2]= 320;
        System.out.println("edades[2]= "+edades[2]);

        for(int i = 0; i< edades.length; i++){
            System.out.println("edades elemento "+i+": "+edades[i]);
        }
    }
}