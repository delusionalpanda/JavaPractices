import java.util.Scanner;

public class NumberSorter {

    public static void main(String[] args) {
        int a, b, c;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the numbers you want to sort: ");
        System.out.print("Number a: ");
        a = i.nextInt();
        System.out.print("Number b: ");
        b = i.nextInt();
        System.out.print("Number c: ");
        c = i.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("1) " + a + " \n2) " + b + " \n3) " + c);
            } else {
                System.out.println("1) " + a + " \n2) " + c + " \n3) " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("1) " + b + " \n2) " + a + " \n3) " + c);
            } else {
                System.out.println("1) " + b + " \n2) " + c + " \n3) " + a);
            }
          } else if (c < a && c < b){
            if (b < a) {
                System.out.println("1) " + c + " \n2) " + a + " \n3) " + b);
            } else {
                System.out.println("1) " + c + " \n2) " + b + " \n3) " + a);
            }
        } else {
            System.out.println("They are equal.");
        }
    }
}
