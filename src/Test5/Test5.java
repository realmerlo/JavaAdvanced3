package Test5;

import Date4.DateFormat;

public class Test5 {
    public static void main (String[] args){

        DateFormat date = new DateFormat();

        String lucaSavini = "2023-03-01T13:00:00Z";

        date.parsing(lucaSavini);

        System.out.println(date.formatData(date.parsing(lucaSavini)));

        System.out.println(date.addYear(date.parsing(lucaSavini)));
        System.out.println(date.minusMonth(date.parsing(lucaSavini)));
        System.out.println(date.plusWeek(date.parsing(lucaSavini)));

        System.out.println(date.dataFormatItaly(date.parsing(lucaSavini)));
    }
}
