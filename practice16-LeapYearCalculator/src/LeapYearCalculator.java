import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {

        int year;
        Scanner i = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = i.nextInt();

        if (year % 4 != 0){
            System.out.println("Not a leap year.");
        } else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Not a leap year.");
            } else {
                System.out.println("Leap year!!!");
            }
        }
    }
}
