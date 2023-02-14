import java.time.LocalDate;
import java.time.Period;

public class Calculator {

    private static int day;
    private static int month;
    private static int year;


    public Calculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public static int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String timeUntilSelectedDate(int year, int month, int day){

        LocalDate currentDate = LocalDate.now();
        LocalDate selectedDate = LocalDate.of(year, month, day);

        Period difference = Period.between(currentDate, selectedDate);

        int years = difference.getYears();
        int months = difference.getMonths();
        int days = difference.getDays();

        System.out.println("The difference between " + currentDate + " and " + selectedDate + " is:");
        System.out.println(years + " years, " + months + " months, and " + days + " days");


        return "";
    }



}
