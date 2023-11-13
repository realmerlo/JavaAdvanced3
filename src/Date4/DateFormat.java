package Date4;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormat {

    public OffsetDateTime parsing (String data) throws DateTimeException {
        if (data != null) {
            return OffsetDateTime.parse(data);
        } else {
            throw new NullPointerException("la data inserita è null");
        }

    }

    public String formatData (OffsetDateTime luca){
        return luca.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    public OffsetDateTime addYear (OffsetDateTime luca){
        return luca.plusYears(1);
    }
    public OffsetDateTime minusMonth (OffsetDateTime luca){
       return luca.minusMonths(1);
    }
    public OffsetDateTime plusWeek (OffsetDateTime luca){
        if (luca != null) {
            return luca.plusWeeks(1);
        } else {
            throw new NullPointerException("la data inserita è null");
        }
    }

    public String dataFormatItaly (OffsetDateTime luca){
        return luca.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }
}
