package Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date4 {
    public static void main (String[] args){
        OffsetDateTime lucaSavini = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String luca = lucaSavini.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(luca);

        OffsetDateTime saviniLuca = lucaSavini.plusYears(1).minusMonths(1).plusWeeks(1);

        String finalLuca = saviniLuca.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(finalLuca);
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
