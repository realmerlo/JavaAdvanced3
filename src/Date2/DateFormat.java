package Date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    public void formatData (OffsetDateTime savini){
        String saviniDate = savini.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        System.out.println(saviniDate);
    }
}
