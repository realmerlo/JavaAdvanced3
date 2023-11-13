package Date2;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    public OffsetDateTime parsing (String data) throws DateTimeException {
        if (data != null) {
            return OffsetDateTime.parse(data);
        } else {
            throw new NullPointerException("la data inserita è null");
        }

    }
    public String formatData (OffsetDateTime savini){
        return savini.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }
}
