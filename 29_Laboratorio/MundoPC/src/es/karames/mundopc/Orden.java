package es.karames.mundopc;

public class Orden {
    // Atributos
    private int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < maxComputadoras) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el máximo de productos: " + maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden + "#");
        System.out.println("Computadoras de la orden #" + idOrden + "#");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
