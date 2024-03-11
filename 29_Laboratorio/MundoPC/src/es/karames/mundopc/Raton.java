package es.karames.mundopc;

public class Raton extends DispositivoEntrada {
    // Atributos
    private int idRaton;
    private static int contadorRatones;

    // Constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    // Métodos
    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + "]" + " " + super.toString();
    }
}
