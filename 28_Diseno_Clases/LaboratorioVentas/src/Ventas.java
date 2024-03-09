import es.karames.ventas.Orden;
import es.karames.ventas.Producto;

public class Ventas {
    public static void main(String[] args) throws Exception {
        // Crear productos
        Producto p1 = new Producto("Camisa", 50.00);
        Producto p2 = new Producto("Pantalón", 100.00);
        Producto p3 = new Producto("Corbata", 30.00);

        // Crear orden
        Orden orden1 = new Orden();

        // Agregar productos a la orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);

        // Imprimir la orden
        orden1.mostrarOrden();

        // Crear nueva orden
        Orden orden2 = new Orden();
        Producto p4 = new Producto("Zapatos", 200.00);
        Producto p5 = new Producto("Blusa", 90.00);

        // Agregar productos a la orden
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p3);

        // Imprimir orden
        System.out.println("");
        orden2.mostrarOrden();
    }
}
