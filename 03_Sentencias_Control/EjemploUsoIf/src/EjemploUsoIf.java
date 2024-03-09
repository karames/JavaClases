public class EjemploUsoIf {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de variables
        int nota = 4;
        int codigo = 3;

        // Ejemplo if
        if (nota < 5) {
            System.out.println("\'nota\' es menor que 5");
        }

        // Ejemplo if/else
        if (nota < 5) {
            System.out.println("\'nota\' es suspenso: " + nota);
        } else {
            System.out.println("\\'nota\\' es aprobado: " + nota);
        }

        // Ejemplo if/else anidado
        if (codigo == 1) {
            System.out.println("\'codigo\' es igual a 1");
        } else if (codigo == 2) {
            System.out.println("\'codigo\' es igual a 2");
        } else if (codigo == 3) {
            System.out.println("\'codigo\' es igual a 3");
        } else {
            System.out.println("\'codigo\' es distinto a 1, 2, 3");
        }
    }
}
