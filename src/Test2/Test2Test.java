package Test2;

import Date1.DateFormat;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    String testString = "2002-03-01T13:00:00Z";

    DateFormat date = new DateFormat();

    @Test
    public void dataString() {
        assertEquals("2002-03-01T13:00:00Z", testString, "mi aspetto che la stringa della data sia uguale a testString");
    }
    @Test
    public void parsing() {
        assertEquals("2002-03-01T13:00Z", date.parsing(testString).toString());
    }

    @Test
    public void FullInputNull() {
        Exception e = assertThrows(NullPointerException.class, () -> date.fullMedium(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("la data inserita è null", e.getMessage());
    }

    @Test
    public void fullMediumOutput() {
        String actual = date.fullMedium(date.parsing(testString));
        String output = "venerdì 1 marzo 2002, 13:00:00";
        assertEquals(output, actual);
    }
    @Test
    public void dataMedium() {
        String actual = date.medMed(date.parsing(testString));
        String output = "1 mar 2002, 13:00:00";
        assertEquals(output, actual);
    }

    @Test
    public void dataShort() {
        String actual = date.shortMed(date.parsing(testString));
        String output = "01/03/02, 13:00:00";
        assertEquals(output, actual);
    }
    @Test
    void dataParse() {
        OffsetDateTime expected = OffsetDateTime.parse(testString);
        OffsetDateTime output = date.parsing(testString);
        assertEquals(expected, output);
    }
}
