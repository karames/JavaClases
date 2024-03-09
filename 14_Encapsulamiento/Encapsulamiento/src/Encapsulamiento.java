public class Encapsulamiento {
    public static void main(String[] args) throws Exception {
        // Crear objeto p1 / Acceso atributo nombre / Acceso estado completo
        Persona p1 = new Persona("Nono", "Karames", false);
        System.out.println("Nombre objeto p1: " + p1.getNombre());
        System.out.println("Estado objeto p1: " + p1);

        // Crear objeto p2 / Acceso estado completo
        Persona p2 = new Persona("Cristina", "Cruz", false);
        System.out.println("Estado objeto p2: " + p2);

        // Marcamos como eliminada a la persona p2 / Acceso estado completo
        p2.setBorrado(true);
        System.out.println("Estado objeto p2: " + p2);

        // Crear objeto p3 / Acceso estado completo
        Persona p3 = new Persona();
        System.out.println("Estado objeto p3: " + p3);
    }
}
