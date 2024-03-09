package es.karames.mundopc;

public class Monitor {
    // Atributos
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    // Constructor vacío
    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    // Constructor
    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    // Métodos
    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + "]";
    }
}
