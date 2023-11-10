package Date5;

import Date4.DateFormat;

import javax.xml.crypto.Data;
import java.time.OffsetDateTime;

public class Date5 {
    public static void main (String[] args){
        OffsetDateTime emperorLuca = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime bossLuca = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        DataFormat data = new DataFormat();


        System.out.println("emperorLuca è dopo di bossLuca = " + data.verifyAfter(emperorLuca, bossLuca));
        System.out.println("emperorLuca è prima bossLuca = " + data.verifyBefore(emperorLuca, bossLuca));
        System.out.println("emperorLuca è uguale all'ora attuale = " + data.verifyNow(emperorLuca));
        System.out.println("bossluca è uguale all'ora attuale = " + data.verifyNow(bossLuca));
        System.out.println("bossluca è uguale a emperorLuca = " + data.verifyEquals(emperorLuca, bossLuca));

    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato