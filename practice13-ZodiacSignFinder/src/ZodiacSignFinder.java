import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        int birthDay;
        String birthMonth;
        Scanner i = new Scanner(System.in);

        System.out.print("Enter the day you were born: ");
        birthDay = i.nextInt();
        System.out.print("Enter the month you were born: ");
        birthMonth = i.next().toLowerCase();

        if (birthDay >= 1 && birthDay <= 31) {
            if (birthMonth.equals("march") && birthDay >= 21 || birthMonth.equals("april") && birthDay <= 20) {
                System.out.println("Aries");
            } else if (birthMonth.equals("april") || birthMonth.equals("may") && birthDay <= 20) {
                System.out.println("Taurus");
            } else if (birthMonth.equals("may") || birthMonth.equals("june") && birthDay <= 20) {
                System.out.println("Gemini");
            } else if (birthMonth.equals("june") || birthMonth.equals("july") && birthDay <= 22) {
                System.out.println("Cancer");
            } else if (birthMonth.equals("july") || birthMonth.equals("august") && birthDay <= 22) {
                System.out.println("Leo");
            } else if (birthMonth.equals("august") || birthMonth.equals("september") && birthDay <= 22) {
                System.out.println("Virgo");
            } else if (birthMonth.equals("september") || birthMonth.equals("october") && birthDay <= 22) {
                System.out.println("Libra");
            } else if (birthMonth.equals("october") || birthMonth.equals("november") && birthDay <= 22) {
                System.out.println("Scorpio");
            } else if (birthMonth.equals("november") || birthMonth.equals("december") && birthDay <= 21) {
                System.out.println("Sagittarius");
            } else if (birthMonth.equals("december") || birthMonth.equals("january") && birthDay <= 19) {
                System.out.println("Capricorn");
            } else if (birthMonth.equals("january") || birthMonth.equals("february") && birthDay <= 19) {
                System.out.println("Aquarius");
            } else if (birthMonth.equals("february") || birthMonth.equals("march") && birthDay <= 20) {
                System.out.println("Pisces");
            }
        } else {
            System.out.println("Invalid birth day or birth month! ");
        }
    }
}
