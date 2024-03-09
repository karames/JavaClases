package es.karames.ventas;

import java.util.Arrays;

/**
 * Clase orden
 *
 * @author Nono Karames
 */
public class Orden {
    // Atributos
    private final int idOrden;
    private final Producto productos[];
    private int contadorProductos;
    private static int contadorOrdenes;
    private static final int maxProductos = 10;

    // Constructor
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[maxProductos];
    }

    /**
     * Agrega producto a la orden
     * Se comprueba si no se supera el máximo de productos permitidos
     *
     * @return void
     */
    public void agregarProducto(Producto producto) {
        if (contadorProductos < maxProductos) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos: " + maxProductos);
        }
    }

    /**
     * Calcula el total de la orden
     *
     * @return double total calculado
     */
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    /**
     * Muestra el contenido de la orden
     *
     * @return void
     */
    public void mostrarOrden() {
        System.out.println("ORDEN #" + idOrden + "#");
        System.out.println("PRODUCTOS");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("TOTAL: " + calcularTotal());
    }

    @Override
    public String toString() {
        return "Orden [idOrden=" + idOrden + ", productos=" + Arrays.toString(productos) + ", contadorProductos="
                + contadorProductos + "]";
    }
}
