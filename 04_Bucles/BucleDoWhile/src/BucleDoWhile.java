public class BucleDoWhile {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de variables
        int contador = 1;
        int limite = 10;

        // Bucle do...while
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= limite);
    }
}
