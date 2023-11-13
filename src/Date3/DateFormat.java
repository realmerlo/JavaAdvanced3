package Date3;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

public class DateFormat {

    public OffsetDateTime parsing (String data) throws DateTimeException {
        if (data != null) {
            return OffsetDateTime.parse(data);
        } else {
            throw new NullPointerException("la data inserita è null");
        }

    }

    public int getYear (OffsetDateTime luca){
        return luca.getYear();
    }
    public String getMonth (OffsetDateTime luca){
        return luca.getMonth().toString();
    }
    public int getDayOfMonth (OffsetDateTime luca){
        if (luca != null) {
            return luca.getDayOfMonth();
        } else {
            throw new NullPointerException("la data inserita è null");
        }
    }
    public String getDayOfWeek (OffsetDateTime luca){
        return luca.getDayOfWeek().toString();
    }
}
