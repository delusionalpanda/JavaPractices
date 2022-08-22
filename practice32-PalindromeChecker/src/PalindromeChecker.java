import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int number) {

        int temp = number, reversedNumber = 0, lastDigit;

        while (temp != 0) {
           lastDigit = temp % 10;
           reversedNumber = (reversedNumber * 10) + lastDigit;
           temp = temp / 10;
       }
        return number == reversedNumber;
    }

//    public static boolean isPalindrome(int number) {
//
//        int temp = number, lastDigit;
//
//        lastDigit = temp % 10;
//        String reversedNumber = Integer.toString(lastDigit);
//        temp = temp / 10;
//        while (temp != 0) {
//            lastDigit = temp % 10;
//            reversedNumber = reversedNumber.concat(Integer.toString(lastDigit));
//            temp = temp / 10;
//        }
//        return Integer.toString(number).equals(reversedNumber) ;
//    }

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        number = input.nextInt();
        System.out.println(isPalindrome(number) ? "It's a palindrome!" : "It's not a palindrome.");

    }

}
