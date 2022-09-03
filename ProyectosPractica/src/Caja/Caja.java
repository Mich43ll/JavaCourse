package Caja;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Este es el constructor vacio");
    }

    public Caja(int arg1, int arg2, int arg3) {
        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
    }

    public void calcularVolumen() {
        int resultado = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es de: " + resultado);
    }
}
