package Date5;

import java.time.OffsetDateTime;

public class DataFormat {

    public boolean verifyBefore (OffsetDateTime luca, OffsetDateTime boss){
        return luca.isBefore(boss);
    }
    public boolean verifyAfter (OffsetDateTime luca, OffsetDateTime boss){
        return luca.isAfter(boss);
    }
    public boolean verifyNow (OffsetDateTime luca){
        return luca.equals(OffsetDateTime.now());
    }
    public boolean verifyEquals (OffsetDateTime luca, OffsetDateTime boss) {
        return luca.isEqual(boss);
    }

}
