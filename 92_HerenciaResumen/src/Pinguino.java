public class Pinguino extends Ave {
    // Constructores
    public Pinguino() {
        super();
    }

    public Pinguino(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void volar() {
        System.out.println("No puedo volar");
    }
}
