import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class App {
    public static void main(String[] args) throws Exception {
        // Construir fechas y horas
        System.out.println("Fecha actual: " + LocalDate.now());
        System.out.println("Hora actual: " + LocalTime.now());
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
        System.out.println("Instante actual: " + Instant.now());
        System.out.println("Fecha y hora actual con zona horaria: " + ZonedDateTime.now());
        // Especificar fecha específica
        System.out.println("\nFecha específica: " + LocalDate.of(1967, 6, 14));
        System.out.println("Fecha específica: " + LocalDate.of(1967, Month.JUNE, 14));
        // Especificar hora específica
        System.out.println("Hora específica: " + LocalTime.of(12, 31, 25));
        // Especificar fechas y horas específicas
        System.out.println("Fecha y hora específica: " + LocalDateTime.of(1967, Month.JUNE, 14, 12, 31, 25));
        // Fecha incorrecta -> excepción
        // System.out.println("Día bisiesto de 2023: " + LocalDate.of(2023,
        // Month.FEBRUARY, 29));
        System.out.println("Día bisiesto de 2024: " + LocalDate.of(2024, Month.FEBRUARY, 29));

        // Partes de una fecha
        System.out.println("\nDía actual: " + LocalDate.now().getDayOfMonth());
        System.out.println("Día de la semana: " + LocalDate.now().getDayOfWeek());
        System.out.println("Mes actual: " + LocalDate.now().getMonthValue());
        System.out.println("Mes actual nº: " + LocalDate.now().getMonth());
        System.out.println("Año actual: " + LocalDate.now().getYear());

        // Partes de una hora
        System.out.println("\nHora actual: " + LocalTime.now().getHour());
        System.out.println("Minuto actual: " + LocalTime.now().getMinute());
        System.out.println("Segundo actual: " + LocalTime.now().getSecond());
        System.out.println("Nano actual: " + LocalTime.now().getNano());

        // Construir fechas a partir de otras
        System.out.println("Fecha actual: " + LocalDate.now());
        System.out.println("\nFecha +10 días: " + LocalDate.now().plusDays(10));
        System.out.println("Fecha +10 semanas: " + LocalDate.now().plusWeeks(10));
        System.out.println("Fecha +10 meses: " + LocalDate.now().plusMonths(10));
        System.out.println("Fecha +10 años: " + LocalDate.now().plusYears(10));
        System.out.println("Fecha -10 días: " + LocalDate.now().minusDays(10));
        System.out.println("Fecha -10 semanas: " + LocalDate.now().minusWeeks(10));
        System.out.println("Fecha -10 meses: " + LocalDate.now().minusMonths(10));
        System.out.println("Fecha -10 años: " + LocalDate.now().minusYears(10));

        // Construir horas a partir de otras
        System.out.println("\nHora actual: " + LocalTime.now());
        System.out.println("Hora +10 horas: " + LocalTime.now().plusHours(10));
        System.out.println("Hora +10 minutos: " + LocalTime.now().plusMinutes(10));
        System.out.println("Hora +10 segundos: " + LocalTime.now().plusSeconds(10));
        System.out.println("Hora +10 nanos: " + LocalTime.now().plusNanos(10));

        System.out.println("\nFecha y hora actual: " + LocalDateTime.now());
        System.out.println("Fecha y hora +48 horas: " + LocalDateTime.now().plusHours(48));

        // Ajustadores temporales
        System.out.println("\nEl primer día del próximo mes es: " +
                LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
        System.out.println("El último día de este mes es: " +
                LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));

        // Tiempo transcurrido entre la fecha de tu nacimiento y el día de hoy
        LocalDate fNacimiento = LocalDate.of(1967, Month.JUNE, 14);
        System.out.println("\nTu edad es de " +
                ChronoUnit.YEARS.between(fNacimiento, LocalDate.now())
                + " años.");

        // Tiempo que falta para llegar fin de año
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinDeAnio = hoy.until(finDeAnio);
        // Period hastaFinDeAnio = Period.between(hoy, finDeAnio);
        int meses = hastaFinDeAnio.getMonths();
        int dias = hastaFinDeAnio.getDays();
        System.out.println("Faltan " + meses + " meses y " + dias + " días hasta final de año.");
    }
}
