package sistemaVenta.mx.com.gm.ventas.test;

import sistemaVenta.mx.com.gm.ventas.*;

public class TestVenta {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Rabano", 50.00);
        Producto producto2 = new Producto("Platano", 60.00);


        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
