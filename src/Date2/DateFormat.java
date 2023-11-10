package Date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    public String formatData (OffsetDateTime savini){
        return savini.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }
}
