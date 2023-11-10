package Date3;

import java.time.OffsetDateTime;

public class Date3 {
    public static void main (String[] args){
        OffsetDateTime theKingLuca = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateFormat date = new DateFormat();

        date.getYear(theKingLuca);
        date.getMonth(theKingLuca);
        date.getDayOfMonth(theKingLuca);
        date.getDayOfWeek(theKingLuca);
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
