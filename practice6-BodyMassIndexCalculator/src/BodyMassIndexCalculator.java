import java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Height (in meters): ");
        double height = userInput.nextDouble();
        System.out.print("Weight (in kilograms): ");
        double weight = userInput.nextDouble();

        double BMI = weight / (height * height);
        System.out.print("Body Mass Index (BMI) = " + BMI);
    }
}
