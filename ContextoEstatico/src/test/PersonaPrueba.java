package test;

import domain.Persona;

public class PersonaPrueba {
    

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel");
        imprimir(persona1);

        Persona persona2 = new Persona("Juan");
        //no podemos usar la palabra "this" dentro de un contexto estatico
        imprimir(persona2);
    }

    //los metodos deben ser estaticos si los vamos a llamar dentro de otro
    //metodo estatico
    public static void imprimir(Persona persona){
        System.out.println(persona);
    } 
    
}
