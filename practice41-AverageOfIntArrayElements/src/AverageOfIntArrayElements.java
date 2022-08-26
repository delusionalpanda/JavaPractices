public class AverageOfIntArrayElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,0};
        double sum = 0.0;
        for (int i : arr) {
            sum += i;
        }
        double average = sum / arr.length;
        System.out.println(average);

        System.out.println("Harmonic Mean: " + harmonicMean(arr));
    }

    public static double harmonicMean(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                return 0;
            }
            sum = sum + (1.0 / arr[i]);
        }
        return arr.length / sum;
    }

}
