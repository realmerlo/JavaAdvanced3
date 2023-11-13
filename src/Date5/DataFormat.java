package Date5;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

public class DataFormat {

    public OffsetDateTime parsing (String data) throws DateTimeException {
        if (data != null) {
            return OffsetDateTime.parse(data);
        } else {
            throw new NullPointerException("la data inserita è null");
        }

    }

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
