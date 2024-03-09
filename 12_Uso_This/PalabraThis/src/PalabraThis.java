public class PalabraThis {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona("Nono");
    }
}

class Persona {
    // Atributo de la clase
    String nombre;

    // Constructor
    Persona(String nombre) {
        this.nombre = nombre; // this es el objeto Persona (actual)
        // Imprimimos el objeto persona
        Imprimir i = new Imprimir();
        i.imprimir(this); // this es el objeto Persona (actual)
    }
}

class Imprimir {
    public void imprimir(Object o) {
        System.out.println("Imprimir parámetro: " + o);// el parámetro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this); // this es el objeto imprimir (actual)
    }
}
