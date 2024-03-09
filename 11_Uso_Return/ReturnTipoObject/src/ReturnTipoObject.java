public class ReturnTipoObject {
    public static void main(String[] args) throws Exception {
        Suma s = creaObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("Resultado: " + resultado);
    }

    public static Suma creaObjetoSuma() {
        Suma s = new Suma(3, 4);
        return s;
    }
}

class Suma {
    int a;
    int b;

    Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
