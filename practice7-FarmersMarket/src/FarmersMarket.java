import java.util.Scanner;
public class FarmersMarket {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double apple, aubergine, banana, tomato, pear, total, weight;
        total = 0;
        apple = 2.67;
        aubergine = 7.00;
        banana = 17.95;
        tomato = 1.11;
        pear = 3.14;

        System.out.print("How much does the apple weigh? : " );
        weight = userInput.nextDouble();
        total += weight * apple;

        System.out.print("How much does the aubergine weigh? : " );
        weight = userInput.nextDouble();
        total += weight * aubergine;

        System.out.print("How much does the banana weigh? : " );
        weight = userInput.nextDouble();
        total += weight * banana;

        System.out.print("How much does the tomato weigh? : " );
        weight = userInput.nextDouble();
        total += weight * tomato;

        System.out.print("How much does the pear weigh? : " );
        weight = userInput.nextDouble();
        total += weight * pear;

        System.out.println("Total: " + total);







    }
}
