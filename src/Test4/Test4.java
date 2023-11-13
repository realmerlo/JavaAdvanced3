package Test4;

import Date3.DateFormat;

public class Test4 {
    public static void main (String[] args){

        String theKingLuca = "2023-03-01T13:00:00Z";

        DateFormat date = new DateFormat();

        date.parsing(theKingLuca);

        System.out.println(date.getYear(date.parsing(theKingLuca)));
        System.out.println(date.getMonth(date.parsing(theKingLuca)));
        System.out.println(date.getDayOfMonth(date.parsing(theKingLuca)));
        System.out.println(date.getDayOfWeek(date.parsing(theKingLuca)));
    }

}
