package com.cts.collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatter {
    public static void main(String[] args) {
       
        String string = "2020-01-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}