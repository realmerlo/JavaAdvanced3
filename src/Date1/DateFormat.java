package Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormat {

    public OffsetDateTime parsing (String data){
        return OffsetDateTime.parse(data);
    }

    public String fullMedium (OffsetDateTime luca) {
        if (luca != null) {
            return luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM));
        } else {
            throw new NullPointerException("la data inserita è null");
        }
    }
    public String medMed (OffsetDateTime luca){
        return luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));

    }
    public String shortMed (OffsetDateTime luca){
        return luca.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM));
    }
}
