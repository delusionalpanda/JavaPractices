import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {

        double opposite, adjacent, hypotenuse;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length of opposite side: ");
        opposite = userInput.nextDouble();
        System.out.print("Enter the length pf adjacent side: ");
        adjacent = userInput.nextDouble();

        hypotenuse = Math.sqrt(opposite * opposite + adjacent * adjacent );
        System.out.println("Length of Hypotenuse = " + hypotenuse);

        // Triangle Area Calculator Using Heron's Formula
        // Heron's Formula: S = sqrt(s(s-a)*(s-b)*(s-c)), s = (a+b+c)/2

        System.out.print("Enter the length of side a: ");
        double a = userInput.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = userInput.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = userInput.nextDouble();

        double s = (a + b + c)/2;
        double S = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle given the three sides: " + S);

    }
}
