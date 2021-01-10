package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    private static ArrayList<String> sparePartList = new ArrayList<>();
    public static void main(String[] args){
        printArray();
    }

    public static void addSparePartToArray(){
        sparePartList.add("pedal34");
        sparePartList.add("headlight987");
        sparePartList.add("fender2112");
        sparePartList.add("steeringwheel901");
        sparePartList.add("brake211");
        sparePartList.add("saddle51");
        sparePartList.add("wheel55");
        sparePartList.add("chain9090");
    }

    public static String sparesNameToUpperCase(String pSparePart){
        pSparePart = pSparePart.toUpperCase();
        return pSparePart;
    }

    public static String seperateNumber(String pSparePart){
        pSparePart = pSparePart.replaceAll("[0-9]", "");
        return pSparePart;
    }

    public static String reverseSparePart(String pSparePart){
        StringBuilder part = new StringBuilder(pSparePart);
        part.reverse();
        return part.toString();
    }

    public static String addNametoFront(String pSparePart){
        pSparePart = "ASLIAG_" + pSparePart;
        return pSparePart;
    }

    public static String addDateToEnd(String pSparePart){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String strDate = dateFormat.format(date);
        pSparePart = pSparePart + strDate;
        return pSparePart;
    }

    public static void printArray(){
        addSparePartToArray();
        for (String sparePart : sparePartList){
            System.out.println(addDateToEnd(addNametoFront(reverseSparePart(seperateNumber(sparesNameToUpperCase(sparePart))))));
        }
    }
}
