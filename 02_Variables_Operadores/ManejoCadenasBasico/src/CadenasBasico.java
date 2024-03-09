public class CadenasBasico {
    public static void main(String[] args) throws Exception {
        System.out.println("Manejo básico de cadenas");
        System.out.println("---");

        String nombre = "Nono";
        String apellido = "Karames";

        System.out.println("Valor nombre: " + nombre);
        System.out.println("Valor apellido: " + apellido);
        System.out.println("Concatenación: " + nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre + " " + apellido);
        System.out.println("Tabulador: \t" + nombre + " " + apellido);
        System.out.println("Retroceso: \b" + nombre + " " + apellido);
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
    }
}
