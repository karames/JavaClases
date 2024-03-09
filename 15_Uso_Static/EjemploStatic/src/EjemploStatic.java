public class EjemploStatic {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona();
        p1.setNombre("Nono");
        p1.setApellido1("Ortiz");
        p1.setApellido2("Karames");
        System.out.println("Persona1: " + p1);
        System.out.println("Persona1 id: " + p1.getId());
        System.out.println("Persona1 Nombre: " + p1.getNombre());
        System.out.println("Persona1 Apellido1: " + p1.getApellido1());
        System.out.println("Persona1 Apellido2: " + p1.getApellido2());

        Persona p2 = new Persona("Cristina", "Cruz", "Moriana");
        System.out.println("Persona2: " + p2);

        System.out.println("Total Personas: " + Persona.getContadorPersonas());
    }
}
