import java.util.Scanner;

public class BucleDoWhileV2 {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de variables
        int maxElementos;
        int contador = 1;

        // Petición al usuario del número de veces a repetir el bucle
        System.out.print("Por favor, introduce el número de elementos a repetir: ");
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();

        // Bucle
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= maxElementos);

        // Cerrar conexión teclado
        entradaEscaner.close();
    }
}
