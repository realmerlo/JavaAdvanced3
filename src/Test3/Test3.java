package Test3;

import Date2.DateFormat;

import java.time.format.DateTimeParseException;

public class Test3 {
    public static void main (String[] args){
        String savini = "2023-03-01T13:00:00Z";

        DateFormat date = new DateFormat();

        date.parsing(savini);

        date.formatData(date.parsing(savini));

    }
}

