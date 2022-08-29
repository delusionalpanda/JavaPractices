import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int attempt = 5;
        int userGuess;
        System.out.println(randomNumber);


        System.out.println("I can hear you asking how many attempts I have. You have " + attempt + " total attempts.");
        while (attempt > 0) {
            System.out.println("Remaining attempts: " + attempt + ". Guess wisely!");
            System.out.print("Your guess: ");
            userGuess = scan.nextInt();
            if (userGuess < 0 || userGuess > 99) {
                attempt--;
                System.out.println("Guess a number between 0 and 99 (0 and 99 are included.)!");

            } else {
                if (userGuess == randomNumber) {
                    System.out.println("Wow! You guessed it right." + "\nYour guess was " + userGuess + ", and the random number was " + randomNumber + ". Congrats buddy!");
                    break;
                } else {
                    attempt--;
                    if (userGuess > randomNumber) {
                        System.out.println("Wah-wah! Try guessing a lower number.");
                    } else {
                        System.out.println("Wah-wah! Try guessing a higher number.");
                    }
                }
                if (attempt == 0) {
                    System.out.println("Not your lucky day, I guess.");
                    System.out.println("Play again -> 1" + "\nExit -> 2");
                    int option = scan.nextInt();
                    switch (option) {
                        case 1:
                            attempt = 5;
                            break;
                        case 2:
                            System.out.println("See you next time. ");
                            break;
                        default:
                            System.out.println("Not a viable option. Forcing to quit.");
                    }
                }
            }
        }
    }
}
