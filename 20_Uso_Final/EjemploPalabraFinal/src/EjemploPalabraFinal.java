public class EjemploPalabraFinal {
    public static void main(String[] args) throws Exception {
        // Error, no se puede modificar el valor de una variable final
        // ClaseFinal.varPrimitiva = 10;

        // Es posible acceder al valor
        // System.out.println("varPrimitiva: " + ClaseFinal.getVarPrimitiva());
        System.out.println("varPrimitiva: " + ClaseFinal.varPrimitiva);

        // No es posible cambiar la referencia de la variable persona
        // ClaseFinal.persona = new Persona();

        // Es posible acceder al estado del objeto
        System.out.println("Nombre persona: " + ClaseFinal.persona.getNombre());

        // Es posible cambiar el estado del objeto
        ClaseFinal.persona.setNombre("Nono");
        System.out.println("Nombre persona: " + ClaseFinal.persona.getNombre());
    }
}
