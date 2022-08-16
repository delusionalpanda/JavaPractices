import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        int math, physics, chem, bio, geo, history, art, courseNumber = 0, total =0;
        double average = 0;
        Scanner i = new Scanner(System.in);

        System.out.print("Mathematics Grade: ");
        math = i.nextInt();
        if(math >= 0 && math <=100) {
            courseNumber++;
            total += math;
        }

        System.out.print("Physics Grade: ");
        physics = i.nextInt();
        if(physics >= 0 && physics <=100) {
            courseNumber++;
            total += physics;
        }

        System.out.print("Chemistry Grade: ");
        chem = i.nextInt();
        if(chem >= 0 && chem <=100) {
            courseNumber++;
            total += chem;
        }

        System.out.print("Biology Grade: ");
        bio = i.nextInt();
        if(bio >= 0 && bio <=100) {
            courseNumber++;
            total += bio;
        }

        System.out.print("Geography Grade: ");
        geo = i.nextInt();
        if(geo >= 0 && geo <=100) {
            courseNumber++;
            total += geo;
        }

        System.out.print("History Grade: ");
        history = i.nextInt();
        if(history >= 0 && history <=100) {
            courseNumber++;
            total += history;
        }

        System.out.print("Art Grade: ");
        art = i.nextInt();
        if(art >= 0 && art <=100) {
            courseNumber++;
            total += art;
        }

        average = (double)total / courseNumber;
        if (average >= 55) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
        System.out.println("Semester Average: " + average);
    }
}
