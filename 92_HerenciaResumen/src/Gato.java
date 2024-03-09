public class Gato extends Animal {
    // Atributos
    private String raza;

    // Constructores
    public Gato() {
        super(Sexo.HEMBRA);
        raza = "siamés";
    }

    public Gato(Sexo sexo, String raza) {
        super(sexo);
        this.raza = raza;
    }

    public Gato(Sexo sexo) {
        super(sexo);
        raza = "siamés";
    }

    public Gato(String raza) {
        super(Sexo.HEMBRA);
        this.raza = raza;
    }

    // Métodos
    public void maullar() {
        System.out.println("Miauuuuuu");
    }

    public void ronronear() {
        System.out.println("Mrrrrrr");
    }

    public void comer(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, sólo como pescado");
        }
    }

    public void pelearContra(Gato gatoContricante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("Soy una gata y no me gusta pelear");
        } else {
            if (gatoContricante.getSexo() == Sexo.HEMBRA) {
                System.out.println("No peleo contra gatas");
            } else {
                System.out.println("Vamos a empezar la pelea");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Gato [raza=" + raza + "]";
    }
}
