import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        // Parseando fechas - interpretarlas a partir de una cadena
        LocalDate fecha1 = LocalDate.parse("2024-02-20");
        LocalDate fecha2 = LocalDate.parse("6/11/2024", DateTimeFormatter.ofPattern("d/M/yyyy"));
        System.out.println(fecha1);
        System.out.println(fecha2);

        // Formato personalizado -> convertir clase en cadena
        LocalDateTime fechaConHora = LocalDateTime.now();
        System.out.println("\nFormato por defecto: " + fechaConHora);
        System.out.println("Formato ISO 8601 (explícito): " + fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME));
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println("Formato español (manual): " + fechaConHora.format(esDateFormat));

        @SuppressWarnings("deprecation")
        DateTimeFormatter esDateFormatLargo = DateTimeFormatter
                .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
                .withLocale(new Locale("es", "ES"));
        System.out.println("Formato español (largo, localizado): " + fechaConHora.format(esDateFormatLargo));
    }
}
