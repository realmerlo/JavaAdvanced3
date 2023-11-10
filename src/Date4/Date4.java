package Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date4 {
    public static void main (String[] args){
        OffsetDateTime lucaSavini = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateFormat date = new DateFormat();

        date.formatData(lucaSavini);
        
        date.addYear(lucaSavini);
        date.minusMonth(lucaSavini);
        date.plusWeek(lucaSavini);

        date.dataFormatItaly(lucaSavini);
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
