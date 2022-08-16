import java.util.Scanner;

public class ActivitySuggester {

    public static void main(String[] args) {

        int temperature;
        Scanner i = new Scanner(System.in);

        System.out.println("Enter temperature (in Celsius)");
        temperature = i.nextInt();

        if (temperature > 25 ) {
            System.out.println("How about swimming?");
        } else if (temperature >= 5 && temperature <= 25) {
            if (temperature <= 15) {
                System.out.println("You can catch a movie.");
            }
            if (temperature >= 10) {
                System.out.println("You can have a picnic. Maybe with loved ones?");
            }
        } else {
            System.out.println("Skiing could be nice experience.");
        }
    }
}
