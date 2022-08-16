import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String defUserName = "admin", defPassword = "12345", userName, password ;
        int option;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Username: ");
        userName = userInput.next();
        System.out.print("Password: ");
        password = userInput.next();

        if ((userName.equals(defUserName)) && (password.equals(defPassword))) {
            System.out.println("Logged in successfully.");
        } else {
            System.out.println("Wrong credentials.");
            System.out.println("1-Reset username and password" +
                    "\n2-Exit");
            option = userInput.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter your new username: ");
                    userName = userInput.next();
                    if (!userName.equals(defUserName)) {
                        System.out.println("You have successfully changed your username.");
                        defUserName = userName;
                    } else {
                        System.out.println("Enter a new username!");
                        break;
                    }
                    System.out.print("Enter your new password: ");
                    password = userInput.next();
                    if (!password.equals(defPassword)) {
                        System.out.println("You have successfully changed your password.");
                        defPassword = password;
                    } else {
                        System.out.println("Enter a new password that you have not used before!");
                        break;
                    }

                    System.out.print("Username: ");
                    userName = userInput.next();
                    System.out.print("Password: ");
                    password = userInput.next();

                    if ((userName.equals(defUserName)) && (password.equals(defPassword))) {
                        System.out.println("Logged in successfully.");
                    } else {
                        System.out.println("Wrong credentials. Start again.");
                    }
                    break;
                case 2:
                    System.out.println("Successfully exited.");
                    break;
                default:
                    System.out.println("Choose a valid option!");
            }
        }
    }
}
