package Test3;

import Date4.DateFormat;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test3test {

    DateFormat date = new DateFormat();

    String testString = "2023-03-01T13:00:00Z";

    @Test
    public void dataString() {
        assertEquals("2023-03-01T13:00Z",date.parsing(testString).toString(), "mi aspetto che siano uguali");
    }

    @Test
    void dataParse() {
        OffsetDateTime expected = OffsetDateTime.parse(testString);
        OffsetDateTime output = date.parsing(testString);
        assertEquals(expected, output);
    }

}
