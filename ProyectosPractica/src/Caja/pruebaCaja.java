package Caja;

public class pruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        caja1.calcularVolumen();

        Caja caja2 = new Caja(4, 3, 8);
        caja2.calcularVolumen();

        
    }
}
