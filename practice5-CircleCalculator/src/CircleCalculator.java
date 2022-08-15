import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = userInput.nextDouble();

        double area = Math.PI*r*r;
        double circumference = 2*Math.PI*r;

        System.out.println("Area of the circle given r: " + area +
                           "\nCircumference of the circle given r: " + circumference);

        // Calculating Sector Area Given r and central angle in degrees:
        // Sector Area = r * r * (central angle in degrees) * pi / 360

        System.out.print("Enter the radius: ");
        r = userInput.nextDouble();
        System.out.print("Enter the central angle in degrees: ");
        double theta = userInput.nextDouble();
        System.out.println("Sector Area = " + (r * r * theta *Math.PI) / 360);
    }
}
