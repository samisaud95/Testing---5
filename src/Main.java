import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataOggi= data1.plusYears(1).minusMonths(1).plusDays(7);
        String dateStringOggio = dataOggi.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        System.out.println("Data1 " + dateStringOggio);
    }
    public static String modificaData(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy ",Locale.ITALY));
    }
}