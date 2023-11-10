package Date3;

import java.time.OffsetDateTime;

public class DateFormat {

    public void getYear (OffsetDateTime luca){
        System.out.println(luca.getYear());
    }
    public void getMonth (OffsetDateTime luca){
        System.out.println(luca.getMonth());
    }
    public void getDayOfMonth (OffsetDateTime luca){
        System.out.println(luca.getDayOfMonth());
    }
    public void getDayOfWeek (OffsetDateTime luca){
        System.out.println(luca.getDayOfWeek());
    }
}
