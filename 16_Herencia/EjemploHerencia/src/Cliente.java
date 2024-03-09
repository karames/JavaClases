import java.time.LocalDate;

public class Cliente extends Persona {
    // Atributos
    private int idCliente;
    private LocalDate fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    // Constructor
    public Cliente(LocalDate fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Métodos
    public int getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente[idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip="
                + vip + "]";
    }
}
