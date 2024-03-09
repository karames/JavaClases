public class SobrecargaConstructores {
    public static void main(String[] args) throws Exception {
        // Persona p1
        Persona p1 = new Persona("Nono", 56);
        System.out.println("Objeto p1");
        System.out.println(p1);

        // Persona p2
        Persona p2 = new Persona("Mario", 19);
        System.out.println("\nObjeto p2");
        System.out.println(p2);

        // Empleado e1
        Empleado e1 = new Empleado("Armando", 50, 18000);
        System.out.println("\nObjeto e1");
        System.out.println(e1);

        // Totales
        System.out.println("\nTotal personas: " + Persona.getContadorPersonas());
    }
}
