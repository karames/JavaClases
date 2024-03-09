public class ReturnTipoPrimitivo {
    public static void main(String[] args) throws Exception {
        int resultado = sumar(3, 6);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumar(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Los valores proporcionados son iguales a 0");
            return 0;
        }
        return a + b;
    }
}
