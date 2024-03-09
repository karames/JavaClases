/**
 * Ejemplo Matriz
 *
 * @author Nono Karames
 */
public class EjemploMatriz {
    public static void main(String[] args) throws Exception {
        // Declaración matriz tipo primitivo
        int edades[][];
        // Instanciación matriz tipo primitivo
        edades = new int[3][2];
        // Inicialización matriz tipo primitivo
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        // Imprimir valores matriz tipo primitivo
        System.out.println("Matriz 'enteros' indice 0-0: " + edades[0][0]);
        System.out.println("Matriz 'enteros' indice 0-1: " + edades[0][1]);
        System.out.println("Matriz 'enteros' indice 1-0: " + edades[1][0]);
        System.out.println("Matriz 'enteros' indice 1-1: " + edades[1][1]);
        System.out.println("Matriz 'enteros' indice 2-0: " + edades[2][0]);
        System.out.println("Matriz 'enteros' indice 2-1: " + edades[2][1]);

        // Declaración e instanciación matriz tipo object
        Persona personas[][] = new Persona[3][2];
        // Inicialización matriz tipo object
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Armando");
        personas[1][0] = new Persona("Karla");
        personas[1][1] = new Persona("Laura");
        personas[2][0] = new Persona("Pedro");
        personas[2][1] = new Persona("Javier");
        // Imprimir matriz tipo object
        System.out.println("");
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz 'personas' índice " + i + "-" + j + ": " + personas[i][j]);
            }
        }

        // Declaración, instanciación e inicialización tipo String
        String nombres[][] = { { "Teresa", "Cesar", "William" }, { "Yesenia", "Esteban", "Maria" } };
        System.out.println("");
        System.out.println("Matriz 'nombres' (filas) = " + nombres.length);
        System.out.println("Matriz 'nombres' (columnas) = " + nombres[0].length);
        // Imprimir matriz tipo String
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Matriz 'nombres' índice " + i + "-" + j + ": " + nombres[i][j]);
            }
        }
    }
}
