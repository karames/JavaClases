package es.karames.ventas;

/**
 * Clase Producto
 *
 * @author Nono Karames
 */
public class Producto {
    // Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    // Constructor vacío
    private Producto() {
        this.idProducto = ++contadorProductos; // Asignar id único por cada objeto creado
    }

    // Constructor sobrecargado con dos argumentos
    public Producto(String nombre, double precio) {
        this(); // Llamada al constructor vacío para asignar id único
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
