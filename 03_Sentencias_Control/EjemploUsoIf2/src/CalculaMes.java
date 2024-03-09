public class CalculaMes {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de variables
        int mes = 2;
        String estacion;

        // Cálculo del mes
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "INVIERNO";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "PRIMAVERA";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "VERANO";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "OTOÑO";
        } else {
            estacion = "INCORRECTO";
        }

        // Salida resultados
        System.out.println("La estación para el mes " + mes + " es \'" + estacion + "\'");
    }
}
