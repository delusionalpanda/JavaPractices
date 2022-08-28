
import java.util.Arrays;

public class DuplicateCounter {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);

        int[] list = {10,20,20,10,10,20,5,20,-2};
        int frequency = 1;

        // This value should be determined according to the list.
        // It should be different from the first element of the sorted array.
        int previous = -1;
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (list[i] == previous) {
                continue;
            }
            for (int j  = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    frequency ++;
                }
            }
            previous = list[i];
            System.out.println("Frequency of number " + list[i] + ": " + frequency);
            frequency = 1;
        }
    }
}


