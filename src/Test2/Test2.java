package Test2;

import Date1.DateFormat;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Test2 {
    public static void main(String[] args) {

        String luca = "2002-03-01T13:00:00Z";

        DateFormat date = new DateFormat();

        date.parsing(luca);
        System.out.println(date.parsing(luca));


        System.out.println(date.fullMedium(date.parsing(luca)));
        System.out.println(date.medMed(date.parsing(luca)));
        System.out.println(date.shortMed(date.parsing(luca)));

        try {
            date.fullMedium(date.parsing(luca));
        }catch (NullPointerException | DateTimeParseException e){
            System.out.println("Errore: " + e);
        }

    }

}
