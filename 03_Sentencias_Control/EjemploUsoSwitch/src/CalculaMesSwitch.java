public class CalculaMesSwitch {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de variables
        int mes = 2;
        String estacion;

        // Cálculo de la estación
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "INVIERNO";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "PRIMAVERA";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "VERANO";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "OTOÑO";
                break;
            default:
                estacion = "INCORRECTO";
        }

        // Salida resultados
        System.out.println("La estación para el mes " + mes + " es \'" + estacion + "\'");
    }
}
