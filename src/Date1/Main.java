package Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String luca = "2002-03-01T13:00:00Z";

        DateFormat date = new DateFormat();

        date.parsing(luca);

        date.fullMedium(OffsetDateTime.parse(luca));
        date.medMed(OffsetDateTime.parse(luca));
        date.shortMed(OffsetDateTime.parse(luca));

    }
}
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni