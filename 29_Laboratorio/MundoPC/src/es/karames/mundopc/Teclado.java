package es.karames.mundopc;

public class Teclado extends DispositivoEntrada {
    // Atributos
    private int idTeclado;
    private static int contadorTeclados;

    // Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    // Métodos
    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + "]" + " " + super.toString();
    }
}
