import java.util.Arrays;
import java.util.Scanner;

public class FindNearestGreaterAndSmallerElement {

    public static void main(String[] args) {

        //Homework
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value you want to check: ");
        int value = scan.nextInt();

        if (value == nearestSmaller(arr,value) ) {
            System.out.println("There is no smaller number");
        } else {
            System.out.println(nearestSmaller(arr,value));
        }

        if (value == nearestGreater(arr,value) ) {
            System.out.println("There is no greater number");
        } else {
            System.out.println(nearestGreater(arr,value));
        }



        // Practice
//        int[] list = {-1000, 56, 500,-909, 1, 8, 101, -2, -33, -101};
//        System.out.println("Smallest: " + smallest(list));
//        System.out.println("Greatest: " + greatest(list));


    }
        //Homework
        public static int nearestSmaller(int[] array, int value) {
            // Consider the value as the nearest smaller.
            int nearestSmaller = value;

            /* Since we sorted our array in ascending order at the beginning of our program,
               this for loop will break once it finds an element that is greater than the entered value.
               It starts checking from the first index because the array is sorted in ascending order.
            */
            for (int i = 0; i < array.length; i++) {
                if (value <= array[i]) {
                    break;
                }
                nearestSmaller = array[i];
            }
            return nearestSmaller;
        }

    public static int nearestGreater(int[] array, int value) {
        // Consider the value as the nearest greater.
        int nearestGreater = value;

        /* Since we sorted our array in ascending order at the beginning of our program,
           this for loop will break once it finds an element that is smaller than the entered value.
           It starts checking from the last index because the array is sorted in ascending order.
         */

        for (int i = array.length - 1; i >= 0; i--) {
            if (value >= array[i]) {
                break;
            }
            nearestGreater = array[i];
        }
        return nearestGreater;
    }

        // Practice
//    public static int smallest(int[] array) {
//        int smallest = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (smallest > array[i]) smallest = array[i];
//        }
//        return smallest;
//    }
//
//    public static int greatest(int[] array) {
//        int greatest = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (greatest < array[i]) greatest = array[i];
//        }
//        return greatest;
//    }

}
