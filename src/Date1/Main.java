package Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime luca = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        DateFormat date = new DateFormat();

        date.fullMedium(luca);
        date.medMed(luca);
        date.shortMed(luca);

    }
}
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni