public class AritmeticaTest {
    public static void main(String[] args) {
        // Creación del objeto con el constructor vacío
        Aritmetica obj1 = new Aritmetica();

        // Llamamos al método sumar y recibimos el valor devuelto
        int suma1 = obj1.sumar(5, 4);
        System.out.println("Resultado suma directa obj1: " + suma1);
        System.out.println("Resultado suma atributos obj1: " + obj1.sumar());

        // Creación objeto con el constructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(2, 1);

        // Llamamos al método sumar y recibimos el valor devuelto
        int suma2 = obj2.sumar();
        System.out.println("Resultado suma atributos obj2: " + suma2);

    }
}
