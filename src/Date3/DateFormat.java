package Date3;

import java.time.OffsetDateTime;

public class DateFormat {

    public int getYear (OffsetDateTime luca){
        return luca.getYear();
    }
    public String getMonth (OffsetDateTime luca){
        return luca.getMonth().toString();
    }
    public int getDayOfMonth (OffsetDateTime luca){
        return luca.getDayOfMonth();
    }
    public String getDayOfWeek (OffsetDateTime luca){
        return luca.getDayOfWeek().toString();
    }
}
