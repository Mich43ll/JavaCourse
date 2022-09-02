package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    //Contructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
        
    }

    public Aritmetica(int a, int b){
        this.a= a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    // Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    // Metodo que recibe un valor entero
    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    // Metodo con Argumetos
    public int sumarConArgumentos(int a, int b) {
        this.a = a;// El operador "this" se puede usar dentro de la clase que estamos utilizando en
                   // ese momento
        this.b = b;// El argumento b se asigna al atributo this.b
        // return a + b;
        return this.sumarConRetorno();
    }

}
