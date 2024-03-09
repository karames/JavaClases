public class SobrecargaMetodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Resultado 1: " + Operaciones.sumar(1, 2));
        System.out.println("Resultado 2: " + Operaciones.sumar(1.1, 2.1));
        System.out.println("Resultado 3: " + Operaciones.sumar(1, 2.1));
        System.out.println("Resultado 4: " + Operaciones.sumar(1.1, 2));

        // ¿Cuál es el método llamado?
        System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L));

        // ¿Cuál es el método llamado?
        System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A'));
    }
}
