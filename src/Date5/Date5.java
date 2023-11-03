package Date5;

import java.time.OffsetDateTime;

public class Date5 {
    public static void main (String[] args){
        OffsetDateTime emperorLuca = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime bossLuca = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean verifyBefore = emperorLuca.isBefore(bossLuca);
        boolean verifyAfter = bossLuca.isAfter(emperorLuca);
        boolean verifyEquals = emperorLuca.isEqual(OffsetDateTime.now());
        boolean verifyEquals2 = bossLuca.isEqual(OffsetDateTime.now());
        boolean verifyEquals3 = bossLuca.isEqual(emperorLuca);
        System.out.println("emperorLuca è prima di bossLuca = " + verifyBefore);
        System.out.println("bossLuca è dopo emperorLuca = " + verifyAfter);
        System.out.println("emperorLuca è uguale all'ora attuale = " + verifyEquals);
        System.out.println("bossluca è uguale all'ora attuale = " + verifyEquals2);
        System.out.println("bossluca è uguale a emperorLuca = " + verifyEquals3);

    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato