package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        convertTime("3:05 PM");
    }

    private static void convertTime(String pTime) throws ParseException {
        SimpleDateFormat inputTime = new SimpleDateFormat("h:mm aa");
        SimpleDateFormat outputTime = new SimpleDateFormat("HH:mm");
        Date date = inputTime.parse(pTime);
        System.out.println(inputTime.format(date) + " = " + outputTime.format(date));
    }
}
