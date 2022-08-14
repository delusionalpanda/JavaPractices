import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        double price = userInput.nextDouble();
        
        double taxRatio = (price >= 0 && price <= 1000) ? 0.18 : 0.08;
        double taxAmount = price * taxRatio;
        double priceAfterTax = price + taxAmount;
        
        System.out.println("Product Price: " + price +
                           "\nTax Ratio: " + taxRatio +
                           "\nPrice After Tax: " + priceAfterTax +
                           "\nTax Amount: " + taxAmount);
    }
}
