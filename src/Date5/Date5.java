package Date5;

import Date4.DateFormat;

import javax.xml.crypto.Data;
import java.time.OffsetDateTime;

public class Date5 {
    public static void main (String[] args){

        DataFormat data = new DataFormat();

        String emperorLuca = "2023-03-01T13:00:00Z";
        String bossLuca = "2024-03-01T13:00:00Z";

        data.parsing(emperorLuca);
        data.parsing(bossLuca);


        System.out.println("emperorLuca è dopo di bossLuca = " + data.verifyAfter(data.parsing(emperorLuca), data.parsing(bossLuca)));
        System.out.println("emperorLuca è prima bossLuca = " + data.verifyBefore(data.parsing(emperorLuca), data.parsing(bossLuca)));
        System.out.println("emperorLuca è uguale all'ora attuale = " + data.verifyNow(data.parsing(emperorLuca)));
        System.out.println("bossluca è uguale all'ora attuale = " + data.verifyNow(data.parsing(bossLuca)));
        System.out.println("bossluca è uguale a emperorLuca = " + data.verifyEquals(data.parsing(emperorLuca), data.parsing(bossLuca)));

    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato