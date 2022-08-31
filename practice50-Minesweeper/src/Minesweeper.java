import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    String[][] fieldHidden;
    String[][] fieldVisible;
    int width;
    int height;

    Minesweeper(int height, int width) {
        this.height = height;
        this.width = width;

        this.fieldHidden = new String[height + 2][width + 2];
        for (String[] i : fieldHidden) {
            Arrays.fill(i, ".");
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                fieldHidden[i][j] = "-";
            }
        }
        this.fieldVisible = new String[height + 2][width + 2];
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                fieldVisible[i][j] = "-";
            }
        }
    }

    public void play() {
        System.out.println("Welcome to Minesweeper !");
        placeMines();
        selectSquare();
    }

    public void placeMines() {
        Random rand = new Random();
        int randNum1, randNum2;
        int mines = (height * width) / 4;

        while (mines > 0) {
            randNum1 = 1 + rand.nextInt(this.height);
            randNum2 = 1 + rand.nextInt(this.width);
            if (this.fieldHidden[randNum1][randNum2].equals("*")) {
                continue;
            }
            mines--;
            this.fieldHidden[randNum1][randNum2] = "*";
        }
        viewField(this.fieldHidden);
    }

    public void selectSquare() {
        Scanner scan = new Scanner(System.in);
        int bombCount = 0, playerMoveCounter = 0;
        boolean flag = true;

        while (playerMoveCounter < (this.height * this.width - ((this.height * this.width) / 4))) {
            System.out.print("Enter row number: ");
            int rowNumber = scan.nextInt();
            System.out.print("Enter column number: ");
            int columNumber = scan.nextInt();

            if (this.fieldHidden[rowNumber][columNumber].equals("*")) {
                System.out.print("Oops! You stepped on a mine!");
                flag = false;
                break;
            } else {
                for (int i = rowNumber - 1; i <= rowNumber + 1; i++) {
                    for (int j = columNumber - 1; j <= columNumber + 1; j++) {
                        if (this.fieldHidden[i][j].equals("*")) {
                            bombCount++;
                        }
                    }
                }
                this.fieldVisible[rowNumber][columNumber] = Integer.toString(bombCount);
                bombCount = 0;
                viewField(this.fieldVisible);
                playerMoveCounter++;
            }
        }
        if (!flag) {
            System.out.println("GAME OVER! \nYou LOST! ");
        } else {
            System.out.println("GAME OVER! \nYou WON!");
        }
    }

    public void viewField(String[][] arr) {
        for (int i = 1; i <= arr.length - 2; i++) {
            for (int j = 1; j <= arr[i].length - 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
