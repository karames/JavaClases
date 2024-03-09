public class PersonaTest {
    public static void main(String[] args) {
        // Creación del objeto
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        // Llamada al método para p1
        System.out.println("Valores por defecto del objeto p1");
        p1.mostrarNombre();

        // Llamada al método para p2
        System.out.println("\nValores por defecto del objeto p2");
        p2.mostrarNombre();

        // Asignar valores al objeto p1
        p1.nombre = "Nono";
        p1.apellidoPrimero = "Ortiz";
        p1.apellidoSegundo = "Karames";

        // Asignar valores al objeto p2
        p2.nombre = "Armando";
        p2.apellidoPrimero = "Bronca";
        p2.apellidoSegundo = "Segura";

        // Volvemos a llamar al método para p1
        System.out.println("\nNuevos valores del objeto p1");
        p1.mostrarNombre();

        // Volvemos a llamar al método para p2
        System.out.println("\nNuevos valores del objeto p2");
        p2.mostrarNombre();
    }
}
