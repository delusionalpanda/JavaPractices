import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String creditCardNumber, pin;
        int attempt = 3, option;
        double balance = 0, amount;
        Scanner input = new Scanner(System.in);

        while (attempt > 0) {
            System.out.print("Enter your credit card number: ");
            creditCardNumber = input.next();
            System.out.print("Enter your password: ");
            pin = input.next();


            if (creditCardNumber.equals("5728212") && pin.equals("7689")) {
                System.out.println("Welcome!");
                do {
                    System.out.println("1 -> Deposit" +
                            "\n2 -> Withdrawal" +
                            "\n3 -> Check Balance" +
                            "\n4 -> Exit");
                    option = input.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Current balance: " + balance);
                            System.out.print("Enter the amount you want to deposit: ");
                            amount = input.nextDouble();
                            balance += amount;
                            System.out.println("New balance: " + balance);
                            continue;
                        case 2:
                            System.out.println("Current balance: " + balance);
                            System.out.print("Enter the amount you want to withdraw: ");
                            amount = input.nextDouble();
                            if (amount <= balance) {
                                balance -= amount;
                                System.out.println("New balance: " + balance);
                            } else {
                                System.out.println("Insufficient funds.");
                            }
                            continue;
                        case 3:
                            System.out.println("Current balance: " + balance);
                            continue;
                        case 4:
                            System.out.println("Have a good day!");
                            break;
                        default:
                            System.out.println("Incorrect selection");
                    }
                } while (option != 4);
                break;
            } else {
                if (attempt == 0) {
                    System.out.println("Account blocked. Contact with the bank or customer services.");
                } else {
                    attempt--;
                    System.out.println("Access denied. Try again" +
                            "\nRemaining attempt: " + attempt);
                }
            }
        }
    }
}
