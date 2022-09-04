package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1: " + persona1);
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1 nombre " + persona1.getNombre());
        System.out.println("persona sueldo " + persona1.getSueldo());
        System.out.println("persona1 eliminado " + persona1.isEliminado());

        Persona persona2 = new Persona("Michaell", 6000.00, true);
        /*
         * System.out.println("persona2 nombre = " + persona2.getNombre());
         * System.out.println("persona2 sueldo = " + persona2.getSueldo());
         * System.out.println("persona eliminado = " + persona2.isEliminado());
         * 
         * persona2.setNombre("Laura");
         * persona2.setSueldo(8000.00);
         * persona2.setEliminado(false);
         * System.out.println("persona2 nombre modificado: " + persona2.getNombre());
         * System.out.println("persona2 sueldo modificado: " + persona2.getSueldo());
         * System.out.println("persona2 eliminado modificado: " +
         * persona2.isEliminado());
         */
        System.out.println("persona1: " + persona1.toString());
    }
}
