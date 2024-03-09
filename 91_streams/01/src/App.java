import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        var categorizedAnimals = new HashSet<List<String>>();
        categorizedAnimals.add(List.of("Avestruz", "Aguila", "Condor"));
        categorizedAnimals.add(List.of("Elefante", "Leon", "Caballo"));
        categorizedAnimals.add(List.of("Tiburon", "Ballena", "Delfin"));
        categorizedAnimals
                .stream()
                .flatMap(animal -> animal.stream())
                .forEach(System.out::println);
    }
}
