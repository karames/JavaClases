import java.util.Scanner;

public class BucleForV2 {
    public static void main(String[] args) throws Exception {
        // Declaración / inicialización variables
        int maxElementos;

        // Petición al usuario del número de veces a repetir el bucle
        System.out.print("Por favor, introduce el número de elementos a repetir: ");
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();

        // Bucle for
        for (int contador = 0; contador < maxElementos; contador++) {
            System.err.println("contador = " + contador);
        }

        // Cerrar conexión con el teclado
        entradaEscaner.close();
    }
}
