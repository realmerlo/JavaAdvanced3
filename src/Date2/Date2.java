package Date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date2 {
    public static void main (String[] args){
        OffsetDateTime savini = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateFormat date = new DateFormat();

        date.formatData(savini);

    }
}
//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
