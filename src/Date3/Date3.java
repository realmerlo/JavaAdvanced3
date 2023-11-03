package Date3;

import java.time.OffsetDateTime;

public class Date3 {
    public static void main (String[] args){
        OffsetDateTime theKingLuca = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(theKingLuca.getYear());
        System.out.println(theKingLuca.getMonth());
        System.out.println(theKingLuca.getDayOfMonth());
        System.out.println(theKingLuca.getDayOfWeek());
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
