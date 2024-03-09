public class OperadoresPrecedencia {
    public static void main(String[] args) throws Exception {
        int x = 5;
        int y = 10;
        int z = ++x * y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\nEjemplo Evaluación");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));

        System.out.println("\nOtro Ejemplo Evaluación");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));

        System.out.println("\nOtro ejemplo");
        // Si detecta una cadena, lo demás lo convierte en cadena
        System.out.println("1 + 2 = " + 1 + 2);
        // Los paréntesis rompen esta regla, ya que tiene la mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));

        System.out.println("\nOtro ejemplo");
        // El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc"); // Detecta una operación primero
        System.out.println("abc" + 1 + 2); // Detecta una cadena primero
    }
}
