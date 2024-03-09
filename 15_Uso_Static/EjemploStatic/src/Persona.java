public class Persona {
    // Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int id;
    private static int contadorPersonas;

    // Constructor vacío
    public Persona() {
        contadorPersonas++;
        this.id = contadorPersonas;
    }

    // Constructor con argumentos
    public Persona(String nombre, String apellido1, String apellido2) {
        // Cada que creamos un objeto persona incrementamos el contador
        // para obtener un nuevo id
        contadorPersonas++;
        // asignamos el nuevo valor a id
        this.id = contadorPersonas;
        // Asignamos el nombre recibido
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", id=" + id
                + "]";
    }
}
