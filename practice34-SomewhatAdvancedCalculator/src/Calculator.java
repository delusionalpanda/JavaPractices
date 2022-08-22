import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void add() {
        System.out.print("Number1: ");
        int num1 = scan.nextInt();
        System.out.print("Number2: ");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println(result);
    }

    public static void subtract() {
        System.out.print("Number1: ");
        int num1 = scan.nextInt();
        System.out.print("Number2: ");
        int num2 = scan.nextInt();

        int result = num1 - num2;
        System.out.println(result);
    }

    public static void multiply() {
        System.out.print("Number1: ");
        int num1 = scan.nextInt();
        System.out.print("Number2: ");
        int num2 = scan.nextInt();

        int result = num1 * num2;
        System.out.println(result);
    }

    public static void divide() {
        System.out.print("Number1: ");
        int num1 = scan.nextInt();
        System.out.print("Number2: ");
        int num2 = scan.nextInt();

        if (num2 == 0) {
            System.out.println("Division by 0: undefined");
        } else {
            double result = (num1 * 1.0) / num2;
            System.out.println(result);
        }
    }

    public static void power() {
        System.out.print("Base: ");
        int base = scan.nextInt();
        System.out.print("Exponent: ");
        int exponent = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(result);

        // This is unnecessary since it won't be able to go into loop. (i = 1; i <= 0) -> false.
//        if (exponent == 0) {
//            System.out.println(result);
//        }
//        else {
//            for (int i = 1; i <= exponent; i++) {
//                result *= base;
//            }
//            System.out.println(result);
//        }
    }

    public static void mod() {
        System.out.print("Number1: ");
        int num1 = scan.nextInt();
        System.out.print("Number2: ");
        int num2 = scan.nextInt();

        int result = num1 % num2;
        System.out.println(result);
    }

    public static int areaRectangle(int sideA, int sideB) {
        return sideA * sideB;
    }

    public static int perimeterRectangle(int sideA, int sideB) {
        return (sideA + sideB) * 2;
    }


    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int option;

        String menu = """
                1 -> Addition
                2 -> Subtraction
                3 -> Multiplication
                4 -> Division
                5 -> Exponential
                6 -> Remainder
                7 -> Area and Perimeter of a Rectangle
                0 -> Exit""";
        System.out.println(menu);

        do {
            System.out.print("Select an option: ");
            option = i.nextInt();

            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    System.out.print("Side a: ");
                    int num1 = scan.nextInt();
                    System.out.print("Side b: ");
                    int num2 = scan.nextInt();
                    System.out.println("Area: " + areaRectangle(num1,num2));
                    System.out.println("Perimeter: " + perimeterRectangle(num1,num2));
                    break;
                case 0:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Incorrect selection!");
            }
        }
         while (option != 0);
        System.out.println("Have a good day!");
    }
}
