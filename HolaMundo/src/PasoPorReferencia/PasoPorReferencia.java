package PasoPorReferencia;

import Alumno.CL_Alumno;

public class PasoPorReferencia {
    public static void main(String[] args) {
        CL_Alumno persona1 = new CL_Alumno();
        persona1.nombre = "Juan";
        System.out.println("Persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre: "+persona1.nombre);

    }

    public static CL_Alumno cambiarValor(CL_Alumno cl_alumno){
        cl_alumno.nombre = "Karla";
        return cl_alumno;
    }
}