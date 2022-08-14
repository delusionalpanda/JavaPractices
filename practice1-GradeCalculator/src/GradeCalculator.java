import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Grade range: [0,100]");

        System.out.print("Enter your Physics grade: ");
        int physicsGrade = input.nextInt();


        System.out.print("Enter your Mathematics grade: ");
        int mathsGrade = input.nextInt();


        System.out.print("Enter your Chemistry grade: ");
        int chemGrade = input.nextInt();


        System.out.print("Enter your German grade: ");
        int germanGrade = input.nextInt();


        System.out.print("Enter your History grade: ");
        int historyGrade = input.nextInt();


        System.out.print("Enter your Music grade: ");
        int musicGrade = input.nextInt();

        int courseNumber = 6;

        double average = (double)(physicsGrade + mathsGrade + chemGrade + germanGrade + historyGrade + musicGrade) / courseNumber;
        System.out.println("Average: " + average);

        String semesterResult = (average > 60.0) ? "Passed" : "Failed";
        System.out.println(semesterResult);
    }
}