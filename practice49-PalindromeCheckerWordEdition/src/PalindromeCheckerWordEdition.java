import java.util.Scanner;

public class PalindromeCheckerWordEdition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word: ");
        word = scan.next();
        isPalindrome(word);
    }

    public static void isPalindrome(String str) {
        String reversedWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord += str.charAt(i);
        }

        if (str.equals(reversedWord)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
