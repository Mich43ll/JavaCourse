package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Cuando tenemos mas de un constructor en una clase, esto se le conoce como Contructor sobrecargado
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo){
        //No podemos utilizar this y super en el mismo contructor
        //super(nombre); para traer los parametros de la clase padre
        this(); //con esto traemos al constructor vacio
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado(idEmpleado= ").append(this.idEmpleado);
        sb.append(", sueldo= ").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append(")");
        return sb.toString();
    }
}
