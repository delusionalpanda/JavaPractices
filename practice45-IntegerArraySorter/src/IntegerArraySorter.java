
import java.util.Arrays;
import java.util.Scanner;

public class IntegerArraySorter {
    public static void main(String[] args) {


        printArray(sortArray(createArray()));
    }

    public static int[] createArray() {
        int[] list;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();
        list = new int[size];
        for (int i =0; i < list.length; i++){
            System.out.print("Element " + (i + 1)+ ": ");
            list[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list));
        return list;
    }

    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


}
