public class PrimeNumbersUpTo100 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 1) continue;
            for (int j = 1; j <= 100; j++){
                if (i % j == 0){
                    counter ++;
                }
            }
            if (counter > 2) {
                counter = 0;
                continue;
            }
            System.out.println(i);
            counter = 0;
        }
    }
}
