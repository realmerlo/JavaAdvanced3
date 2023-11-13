package Test5;

import Date4.DateFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test5test {
    String testString = "2023-03-01T13:00:00Z";

    DateFormat date = new DateFormat();

    @Test
    void dataAddYear() {
        String test = String.valueOf(date.addYear(date.parsing(testString)));
        String result = "2024-03-01T13:00Z";
        assertEquals(result, test, "mi aspetto che gli anni corrispondano");

    }

    @Test
    void dataMinusMonth() {
        String test = String.valueOf(date.minusMonth(date.parsing(testString)));
        String result = "2023-02-01T13:00Z";
        assertEquals(result, test, "mi aspetto che i mesi corrispondano");
    }


    @Test
    void dataPlusWeek() {
        Exception e = assertThrows(NullPointerException.class,() -> date.plusWeek(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("la data inserita è null", e.getMessage());
    }
}
