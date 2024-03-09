public class CajaTest {
    public static void main(String args[]) {
        // Variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        // Creación objeto con constructor vacío
        Caja caja1 = new Caja();
        int resultado1 = caja1.calcularVolumen(medidaAncho, medidaAlto, medidaProf);
        System.out.println("Resultado caja1: " + resultado1);

        // Creación objeto constructor con argumentos
        Caja caja2 = new Caja(medidaAncho, medidaAlto, medidaProf);
        int resultado2 = caja2.calcularVolumen();
        System.out.println("Resultado caja2: " + resultado2);
    }
}
