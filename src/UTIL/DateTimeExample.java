package UTIL;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        // getCurrentDate();
        // getDetailDate();
        // handleSpecilDate();
        // cycleDate();
        // getCurrentTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");

        String date = "16-08-2016";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
        int a = 5;
        int b = -10;
        int m = 4;
        int n = 2;
        int z = a++ - --b * n / m;
        System.out.println(z);
    }

    public static void getCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);

        // This is for comparison
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDetailDate() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.printf("Year : %d  Month : %d  day : %d t %n", year, month, day);
    }

    public static void handleSpecilDate() {
        LocalDate dateOfBirth = LocalDate.of(2018, 01, 21);
        System.out.println("The specil date is : " + dateOfBirth);
    }

    // Processing recurring dates
    public static void cycleDate() {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(2018, 11, 20);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(birthday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }
    }

    // Get current time
    public static void getCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
    }
}
