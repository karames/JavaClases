public class PasoPorReferencia {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona();
        p.cambiarNombre("Nono");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }

    public static void modificarPersona(Persona arg) {
        arg.cambiarNombre("Mario");
    }

    public static void imprimirNombre(Persona p) {
        System.out.println("Valor recibido: " + p.obtenerNombre());
    }
}
