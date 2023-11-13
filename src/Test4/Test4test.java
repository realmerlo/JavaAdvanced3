package Test4;

import Date3.DateFormat;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test4test {
    String testString = "2023-03-01T13:00:00Z";

    DateFormat date = new DateFormat();


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
    @Test
    public void getYear() {
        int actual = date.getYear(date.parsing(testString));
        int output = 2023;
        assertEquals(output, actual);
    }
    @Test
    public void getMonth() {
        String actual = date.getMonth(date.parsing(testString));
        String output = "MARCH";
        assertEquals(output, actual);
    }

    @Test
    public void getDayOfMonth() {
        int actual = date.getDayOfMonth(date.parsing(testString));
        int output = 1;
        assertEquals(output, actual);
    }

    @Test
    public void getDayOfWeek() {
        String actual = date.getDayOfWeek(date.parsing(testString));
        String output = "WEDNESDAY";
        assertEquals(output, actual);
    }

    @Test
    void getDayOfMonthNUll () {
        Exception e =assertThrows(NullPointerException.class,() -> date.getDayOfMonth(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("la data inserita è null", e.getMessage());
    }
}
