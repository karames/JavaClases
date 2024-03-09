public class HerenciaResumenTest {
    public static void main(String[] args) throws Exception {
        Gato minina = new Gato();
        Gato garfield = new Gato(Sexo.MACHO, "romano");
        Gato tom = new Gato(Sexo.MACHO);
        Gato lisa = new Gato("birmano");

        System.out.println(minina);
        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);

        Ave miLoro = new Ave();
        miLoro.asear();
        miLoro.volar();

        Pinguino tux = new Pinguino(Sexo.HEMBRA);
        tux.asear();
        tux.volar();
    }
}
