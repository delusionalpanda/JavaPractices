import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        int birthDay;
        String birthMonth, zodiacSign = "";
        Scanner i = new Scanner(System.in);

        System.out.print("Enter the day you were born: ");
        birthDay = i.nextInt();
        System.out.print("Enter the month you were born: ");
        birthMonth = i.next().toLowerCase();

        if (birthDay >= 1 && birthDay <= 31) {
            if (birthMonth.equals("march") && birthDay >= 21 || birthMonth.equals("april") && birthDay <= 20) {
                zodiacSign = "Aries";
            } else if (birthMonth.equals("april") || birthMonth.equals("may") && birthDay <= 20) {
                zodiacSign = "Taurus";
            } else if (birthMonth.equals("may") || birthMonth.equals("june") && birthDay <= 20) {
                zodiacSign = "Gemini";
            } else if (birthMonth.equals("june") || birthMonth.equals("july") && birthDay <= 22) {
               zodiacSign = "Cancer";
            } else if (birthMonth.equals("july") || birthMonth.equals("august") && birthDay <= 22) {
                zodiacSign = "Leo";
            } else if (birthMonth.equals("august") || birthMonth.equals("september") && birthDay <= 22) {
                zodiacSign = "Virgo";
            } else if (birthMonth.equals("september") || birthMonth.equals("october") && birthDay <= 22) {
                zodiacSign = "Libra";
            } else if (birthMonth.equals("october") || birthMonth.equals("november") && birthDay <= 22) {
                zodiacSign = "Scorpio";
            } else if (birthMonth.equals("november") || birthMonth.equals("december") && birthDay <= 21) {
                zodiacSign = "Sagittarius";
            } else if (birthMonth.equals("december") || birthMonth.equals("january") && birthDay <= 19) {
                zodiacSign = "Capricorn";
            } else if (birthMonth.equals("january") || birthMonth.equals("february") && birthDay <= 19) {
                zodiacSign = "Aquarius";
            } else if (birthMonth.equals("february") || birthMonth.equals("march") && birthDay <= 20) {
                zodiacSign = "Pisces";
            }
        } else {
            System.out.println("Invalid birth day or birth month! ");
        }
        System.out.println("Zodiac Sign: " + zodiacSign);
    }
}
