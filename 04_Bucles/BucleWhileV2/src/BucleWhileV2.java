import java.util.Scanner;

public class BucleWhileV2 {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int maxElementos;
        int contador = 0;

        // Petición al usuario del número de veces a repetir el bucle
        System.out.print("Por favor, introduce el número de elementos a repetir: ");
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();

        // Bucle
        while (contador < maxElementos) {
            System.out.println("contador = " + contador);
            contador++;
        }

        // Cerrar conexión con el teclado
        entradaEscaner.close();
    }
}
