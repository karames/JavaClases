public class PalabraNull {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Nono");
        System.out.println("Nombre p1: " + p1.obtenerNombre());

        Persona p2 = p1; // p2 apunta al mismo objeto que p1
        System.out.println("Nombre p2: " + p2.obtenerNombre());

        // Hacemos que p1 ya no apunte al objeto p1
        p1 = null;
        // La siguiente linea marca error de tipo NullPointerException
        // System.out.println("Nombre p1:" + p1.obtenerNombre());
        // Solo en caso de que no sea nulo podemos utilizar este método en esta
        // variable
        if (p1 != null) {
            System.out.println("Nombre p1: " + p1.obtenerNombre());
        }

        // Comprobamos que p2 sigue accediendo al objeto
        System.out.println("Nombre p2: " + p2.obtenerNombre());
    }
}

class Persona {
    String nombre; // valor por default es null

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre; // Uso opcional de this
    }
}
