public class Aritmetica {
    // Atributos de la clase
    int a, b;

    // Constructor vacío
    // Este constructor no se crea si creamos otro distinto del vacío
    // Es necesario crearlo si lo necesitamos
    Aritmetica() {
        // Código opcional
    }

    // Constructor con 2 argumentos
    Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }

    // Método sumar
    // Toma los atributos de la clase
    int sumar() {
        return a + b;
    }

    // Toma nuevos valores y no los atributos de la clase
    int sumar(int a, int b) {
        return a + b;
    }
}
