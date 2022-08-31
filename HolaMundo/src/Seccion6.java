public class Seccion6 {

    public static void main(String[] args) {
        System.out.println("CICLO WHILE");
        var contador = 0;
        // CICLO WHILE
        while (contador < 3) {
            System.out.println(contador);
            contador++;
        }

        // CICLO DO WHILE
        System.out.println("CICLO DO WHILE");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 3);

        // CICLO FOR
        System.out.println("CICLO FOR");
        inicio: //esto es una etiqueta 
        for (contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio; // ir a la siguiente iteracion, con la etiqueta se puede ir directamente a la linea de codigo
            }
            System.out.println(contador);
        }

        /*
         * System.out.println("CICLO FOR");
         * for(contador=0;contador<3;contador++){
         * if (contador%2==0){
         * System.out.println(contador);
         * //break;
         * }
         * 
         * }
         */
    }

}
