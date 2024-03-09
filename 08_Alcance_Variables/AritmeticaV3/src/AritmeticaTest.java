public class AritmeticaTest {
    public static void main(String[] args) {
        // Variables locales
        int operandoA = 6;
        int operandoB = 2;

        // Creación objeto de la clase con argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);

        // Imprimir operandos
        System.out.println("Operando A: " + operandoA);
        System.out.println("Operando B: " + operandoB);

        // Resultados
        System.out.println("\n Resultado suma.............: " + obj1.sumar());
        System.out.println("\n Resultado resta............: " + obj1.restar());
        System.out.println("\n Resultado multiplicación...: " + obj1.multiplicar());
        System.out.println("\n Resultado división.........: " + obj1.dividir());
    }
}
