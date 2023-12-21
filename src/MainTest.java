import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void modificaData() {
        ZonedDateTime dataTime = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        OffsetDateTime dataOggi= dataTime.plusYears(1).minusMonths(1).plusDays(7).toOffsetDateTime();
        String dateStringOggio = dataOggi.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals("08 febbraio 2024",dateStringOggio);
    }
}