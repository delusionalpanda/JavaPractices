import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        int taximeterStartPrice = 10;
        double farePerKM = 2.20;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the distance(in kilometer) you have travelled: ");
        double distance = userInput.nextDouble();

        double fare = taximeterStartPrice + distance * farePerKM;
        double totalFare = (fare <= 20) ? 20.0 : fare;
        System.out.println("Total Fare: " + totalFare);
    }
}
