import java.util.Arrays;

public class DuplicateIntegerFinder {
    public static void main(String[] args) {
        int[] list = {2, 0, 16, 3, 2, 16, 2, 21, 1, 2, 0, 1,21};
        int[] duplicatedElements = new int[list.length/2];
        int index = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j++){
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    if (!hasFound(duplicatedElements, list[i])){
                        duplicatedElements[index] = list[i];
                        index++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicatedElements));
    }

    public static boolean hasFound(int[] arr, int value){
        for (int i : arr) {
            if (i == value) return true;
        }
        return false;
    }
}
