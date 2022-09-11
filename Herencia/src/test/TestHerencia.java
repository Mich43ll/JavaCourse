package test;

import java.util.Date;

import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println(empleado1);

        //Cliente cliente1 = new Cliente(new Date() , true, "Michaell", 'M', 22, "Bo. La reforma");
        //System.out.println(cliente1);
        
    }
}
