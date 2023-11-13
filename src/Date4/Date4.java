package Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date4 {
    public static void main (String[] args){

        DateFormat date = new DateFormat();

        String lucaSavini = "2023-03-01T13:00:00Z";

        date.parsing(lucaSavini);

        System.out.println(date.formatData(date.parsing(lucaSavini)));

        System.out.println(date.addYear(date.parsing(lucaSavini)));
        System.out.println(date.minusMonth(date.parsing(lucaSavini)));
        System.out.println(date.plusWeek(date.parsing(lucaSavini)));

        System.out.println(date.dataFormatItaly(date.parsing(lucaSavini)));
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
