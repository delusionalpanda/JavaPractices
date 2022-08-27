public class PrintingLetterBUsingArrays {
    public static void main(String[] args) {

        int[][] letterB = new int[7][4];
        for (int row = 0; row < letterB.length; row++){
            for (int column = 0; column < letterB[row].length; column++){
                if (row == 0 || row == 3 || row == 6) {
                    if (column == 3) continue;
                    System.out.print("* ");
                } else if (column == 0 || column == 3){
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
