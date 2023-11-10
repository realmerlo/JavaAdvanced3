package Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormat {

    public void formatData (OffsetDateTime luca){
        String saviniLuca = luca.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    public void addYear (OffsetDateTime luca){
        luca.plusYears(1);
    }
    public void minusMonth (OffsetDateTime luca){
        luca.minusMonths(1);
    }
    public void plusWeek (OffsetDateTime luca){
        luca.plusWeeks(1);
    }

    public void dataFormatItaly (OffsetDateTime luca){
        String finalLuca = luca.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(finalLuca);
    }
}
