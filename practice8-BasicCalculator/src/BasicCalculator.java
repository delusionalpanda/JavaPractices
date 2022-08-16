import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        double n1, n2;
        int option;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1 = userInput.nextDouble();
        System.out.print("Enter a second number: ");
        n2 = userInput.nextDouble();

        System.out.println("1-Add" +
                "\n2-Subtract" +
                "\n3-Multiply" +
                "\n4-Divide");
        System.out.print("Option: ");
        option = userInput.nextInt();

        switch (option) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println((n2 != 0) ? n1 + " / " + n2 + " = " + (n1 / n2)  : "Division by zero.");
                break;
            default:
                System.out.println("Choose between 1 and 4! (1 and 4 included)");
        }

    }
}
