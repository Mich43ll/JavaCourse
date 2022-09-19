package sistemaVenta.mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private int contadorOrdenes;
    private int contadorProducto;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden += contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public boolean agregarProducto(Producto producto) {
        if (this.contadorProducto < MAX_PRODUCTOS) {
            this.productos[this.contadorProducto++] = producto;
        }else{
            System.out.println("Se ha excedido el limite de productos");
        }
        return true;
    }

    public double calcularTotal(){
        double total =0;
        for(int i = 0; i < this.contadorProducto;i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #"+(idOrden+1));
        double totalOrden = this.calcularTotal();
        System.out.println("Total a pagar: "+totalOrden);
        for(int i = 0; i < this.contadorProducto; i++){
            System.out.println(this.productos[i]);
        }
    }
}
