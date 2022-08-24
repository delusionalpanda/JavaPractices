public class Student {

    String name;
    String studentNo;

    Course maths;
    Course physics;
    Course chem;

    int classes;

    double average;

    boolean hasPassed;

    Student(String name, String studentNo, int classes, Course maths, Course physics, Course chem) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.maths = maths;
        this.physics = physics;
        this.chem = chem;
        this.hasPassed = false;
    }

    public void  addBulkExamNote(int mathFinalGrade, int mathQuizGrade, int physicsFinalGrade, int physicsQuizGrade, int chemFinalGrade, int chemQuizGrade) {
        if (mathFinalGrade >= 0 && mathFinalGrade <= 100 && mathQuizGrade >= 0 && mathQuizGrade <= 100) {
            this.maths.finalGrade = mathFinalGrade;
            this.maths.popQuizGrade = mathQuizGrade;
            this.maths.totalGrade = this.maths.finalGrade * this.maths.finalGradeRatio + this.maths.popQuizGrade * this.maths.popQuizRatio;
        }
        if (physicsFinalGrade >= 0 && physicsFinalGrade <= 100 && physicsQuizGrade >= 0 && physicsQuizGrade <= 100) {
            this.physics.finalGrade = physicsFinalGrade;
            this.physics.popQuizGrade = physicsQuizGrade;
            this.physics.totalGrade = this.physics.finalGrade * this.physics.finalGradeRatio + this.physics.popQuizGrade * this.physics.popQuizRatio;
        }
        if (chemFinalGrade >= 0 && chemFinalGrade <= 100 && chemQuizGrade >= 0 && chemQuizGrade <= 100) {
            this.chem.finalGrade = chemFinalGrade;
            this.chem.popQuizGrade = chemQuizGrade;
            this.chem.totalGrade = this.chem.finalGrade * this.chem.finalGradeRatio + this.chem.popQuizGrade * this.chem.popQuizRatio;
        }
    }

    public void hasPassed() {
        this.hasPassed = checkPass();
        printNote();
        System.out.println("Semester Average: " + this.average);
        if (this.hasPassed) System.out.println("Passed!");
        else System.out.println("Failed");
    }

    public void calcAverage() {
        this.average = (this.maths.totalGrade + this.physics.totalGrade + this.chem.totalGrade) / 3.0;
    }

    public boolean checkPass() {
        calcAverage();
        return this.average >= 55;
    }

    public void printNote() {
        System.out.println("Student Name: " + this.name +
                "\nMathematics Grade: " + this.maths.totalGrade +
                "\nPhysics Grade: " + this.physics.totalGrade +
                "\nChemistry Grade: " + this.chem.totalGrade);
    }
}
