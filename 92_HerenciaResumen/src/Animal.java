public abstract class Animal {
    // Atributos
    private Sexo sexo;

    // Constructores
    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }

    // Métodos
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void dormir() {
        System.out.println("Zzzzzz");
    }

    @Override
    public String toString() {
        return "Animal [sexo=" + sexo + "]";
    }
}
