package Date3;

import java.time.OffsetDateTime;

public class Date3 {
    public static void main (String[] args){

        String theKingLuca = "2023-03-01T13:00:00Z";

        DateFormat date = new DateFormat();

        date.parsing(theKingLuca);

        System.out.println(date.getYear(date.parsing(theKingLuca)));
        System.out.println(date.getMonth(date.parsing(theKingLuca)));
        System.out.println(date.getDayOfMonth(date.parsing(theKingLuca)));
        System.out.println(date.getDayOfWeek(date.parsing(theKingLuca)));
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
