import java.util.Scanner;

public class FlightCostCalculator {
    public static void main(String[] args) {

        double distance, farePerKM = 0.10, total;
        int age, way;
        Scanner i = new Scanner(System.in);

        System.out.print("Enter the distance you will travel in KMs: ");
        distance = i.nextDouble();
        System.out.print("Enter your age: ");
        age = i.nextInt();
        System.out.print("1 => One-way, 2 => Round-trip : ");
        way = i.nextInt();


        if (age < 0 || distance < 0 || !(way == 1 || way == 2)) {
            System.out.println("Check the information you given. One or more might be wrong,");
        } else {
            total = distance * farePerKM;
            System.out.println("Initial price: " + total);
            if (way == 2) {
                total *= 2;
                System.out.println("Round-trip price: " + total);
                System.out.println("Round-trip discount (20% off): " + "-" + (total * 0.20));
                total = total - (total * 0.20);

            }
            if (age > 65) {
                System.out.println("Senior discount (30% off): " + "-" + (total * 0.30));
                total = total - total * 0.30;

            } else if (age >= 12 && age <= 24) {
                System.out.println("Young Adult discount (10% off): " + "-" + (total * 0.10));
                total = total - total * 0.10;

            } else if (age < 12) {
                System.out.println("Child discount (50% off): " + "-" + (total * 0.50));
                total = total - total * 0.50;

            }
            System.out.println("Total: " + total);
        }
    }
}
