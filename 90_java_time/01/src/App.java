import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // Sin formato
        LocalDate myObjLocalDate = LocalDate.now();
        LocalTime myObjLocalTime = LocalTime.now();
        LocalDateTime myObjDateTime = LocalDateTime.now();

        // Salida
        System.out.println("ANTES DEL FORMATO");
        System.out.println("LocalDate: " + myObjLocalDate);
        System.out.println("LocalTime: " + myObjLocalTime);
        System.out.println("DateTime: " + myObjDateTime);

        // Formato
        DateTimeFormatter myObjFormatLocalDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedLocalDate = myObjLocalDate.format(myObjFormatLocalDate);

        DateTimeFormatter myObjFormatLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedLocalTime = myObjLocalTime.format(myObjFormatLocalTime);

        DateTimeFormatter myObjFormatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = myObjDateTime.format(myObjFormatDateTime);

        System.out.println("DESPUÉS DEL FORMATO");
        System.out.println("LocalDate: " + formattedLocalDate);
        System.out.println("LocalTime: " + formattedLocalTime);
        System.out.println("DateTime: " + formattedDateTime);
    }
}
