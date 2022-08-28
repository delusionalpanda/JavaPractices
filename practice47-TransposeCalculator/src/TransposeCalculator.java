import java.util.Scanner;

public class TransposeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Matrix dimension: ");
        System.out.print("Row: ");
        int row = scan.nextInt();
        System.out.print("Column: ");
        int column = scan.nextInt();

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original: ");
        printMatrix(matrix);
        transposeMatrix(matrix, row, column);
        System.out.println("Transpose: ");
        printMatrix(transposeMatrix(matrix,row,column));


    }

    public static int[][] transposeMatrix(int[][] matrix, int row, int column) {
        int[][] transposedMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
