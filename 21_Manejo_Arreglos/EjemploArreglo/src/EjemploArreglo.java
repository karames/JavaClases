/**
 * Ejemplo Arreglo 1 dimensión
 *
 * @author Nono Karames
 */
public class EjemploArreglo {
    public static void main(String[] args) throws Exception {
        // Declaración arreglo tipo primitivo
        int edades[];
        // int[] edades;
        // Instanciación arreglo tipo primitivo
        edades = new int[3];
        // Inicialización arreglo tipo primitivo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        // Imprimir valores arreglo tipo primitivo
        System.out.println("Arreglo 'enteros' índice 0: " + edades[0]);
        System.out.println("Arreglo 'enteros' índice 1: " + edades[1]);
        System.out.println("Arreglo 'enteros' índice 2: " + edades[2]);

        // Declaración arreglo tipo object
        Persona personas[];
        // Persona[] personas;
        // Instanciación arreglo tipo object
        personas = new Persona[4];
        // Inicialización arreglo tipo object
        personas[0] = new Persona("Mario");
        personas[1] = new Persona("Gonzalo");
        personas[2] = new Persona("Nono");
        personas[3] = new Persona("Armando");
        // Imprimir valores arreglo tipo object
        System.out.println("");
        System.out.println("Arreglo 'personas' índice 0: " + personas[0]);
        System.out.println("Arreglo 'personas' índice 1: " + personas[1]);
        System.out.println("Arreglo 'personas' índice 2: " + personas[2]);
        System.out.println("Arreglo 'personas' índice 3: " + personas[3]);

        // Declaración, instanciación e inicialización arreglo tipo String
        String nombres[] = { "Cristina", "Rocío", "Macarena", "Eva" };
        // String[] nombres = { "Cristina", "Rocío", "Macarena", "Eva" };
        // Imprimir valores arreglo tipo String
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo 'nombres' índice " + i + ": " + nombres[i]);
        }
    }
}
