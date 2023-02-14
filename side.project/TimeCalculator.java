import java.util.Scanner;

public class TimeCalculator {


private Calculator dates;

    public TimeCalculator(Calculator dates) {
        this.dates = dates;
    }

    public static void main(String[] args) {

        Calculator dates = new Calculator(Calculator.getDay(), Calculator.getMonth(), Calculator.getYear());
        TimeCalculator timeCalculator = new TimeCalculator(dates);
        timeCalculator.run();





    }

    public static void run(){
        Calculator dates = new Calculator(Calculator.getDay(), Calculator.getMonth(), Calculator.getYear());
        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your favorite number");
//        String number = scanner.nextLine();
//        System.out.println("now what number would uou like me to multiply by 2?");
//        String numberToMultiply = scanner.nextLine();
//        System.out.println(numberToMultiply + " x 2 is " + Integer.parseInt(numberToMultiply) * 2);


        try (scanner){
            System.out.println();
            System.out.println("Welcome to Time Calculator! Find the difference in time between today and any date of your choice!");
            System.out.println("Select any date in the future or past to calculate! First enter the year.");
            String year = scanner.nextLine();
            System.out.println("Now enter the month");
            String month = scanner.nextLine();
            System.out.println("Now enter the day of the month");
            String day = scanner.nextLine();



            String output = dates.timeUntilSelectedDate(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
            System.out.println(output);
        } catch (Exception e){
            System.out.println("Invalid entry");
        }



    }


}
