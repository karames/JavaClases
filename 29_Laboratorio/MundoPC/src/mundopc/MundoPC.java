package mundopc;

import es.karames.mundopc.Computadora;
import es.karames.mundopc.Monitor;
import es.karames.mundopc.Orden;
import es.karames.mundopc.Raton;
import es.karames.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) throws Exception {
        // Crear computadora Toshiba
        Monitor monitorToshiba = new Monitor("Toshiba", 13);
        Teclado tecladoToshiba = new Teclado("Bluetooth", "Toshiba");
        Raton ratonToshiba = new Raton("Bluetooth", "Toshiba");
        Computadora computadoraToshiba = new Computadora(
                "Computadora Toshiba", monitorToshiba, tecladoToshiba, ratonToshiba);

        // Crear computadora Dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Usb", "Dell");
        Raton ratonDell = new Raton("Usb", "Dell");
        Computadora computadoraDell = new Computadora(
                "Computadora Dell", monitorDell, tecladoDell, ratonDell);

        // Crear computadora Personalizada
        Computadora computadoraPersonalizada = new Computadora(
                "Computadora Personalizada", monitorDell, tecladoToshiba, ratonToshiba);

        // Crear orden 1
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraPersonalizada);
        // Imprimir orden 1
        orden1.mostrarOrden();

        // Crear orden 2
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraPersonalizada);
        orden2.agregarComputadora(computadoraDell);
        // Imprimir orden 2
        System.out.println("");
        orden2.mostrarOrden();
    }
}
