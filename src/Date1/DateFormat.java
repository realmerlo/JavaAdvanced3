package Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormat {

    public void fullMedium (OffsetDateTime luca){
        String lucaString = luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM));
        System.out.println(lucaString);
    }
    public void medMed (OffsetDateTime luca){
        String lucaString = luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));
        System.out.println(lucaString);
    }
    public void shortMed (OffsetDateTime luca){
        String lucaString = luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM));
        System.out.println(lucaString);
    }
}
