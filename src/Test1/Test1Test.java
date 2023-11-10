package Test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    public void testArea() {
        Rettangolo rettangolo = new Rettangolo(5.0, 10.0);
        assertEquals(50.0, rettangolo.calcolaArea(), "l'area del rettangolo deve essere 50");
    }

}