public class Main {
    public static void main(String[] args) {

        Course maths = new Course("Mathematics", "C101", "CAL", 0.70, 0.30);
        Course physics= new Course("Physics", "PHY101", "PHY", 0.80, 0.20);
        Course chem = new Course("Chemistry", "CHEM101", "CHEM", 0.65, 0.35);

        Teacher t1 = new Teacher("Prof. Nadir, Abed", "90550000000", "CAL");
        Teacher t2 = new Teacher("Prof. Mosby, Ted", "90550000001", "PHY");
        Teacher t3 = new Teacher("Prof. Dunphy, Phill ", "90550000002", "CHEM");

        maths.addTeacher(t1);
        physics.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("laire", "140144015", 3, maths, physics, chem);
        s1.addBulkExamNote(50, 40, 70, 30,20,40);
        s1.hasPassed();


        System.out.println("-------------");

        Student s2 = new Student("Jeff", "2211133", 3, maths, physics, chem);
        s2.addBulkExamNote(70, 60, 60, 90,50,30);
        s2.hasPassed();

        System.out.println("-------------");
        s1.printNote();
        System.out.println("-------------");
//
//        Student s3 = new Student("Barney", "221121312", 3, maths, physics, chem);
//        s3.addBulkExamNote(60, 50, 60, 90,80,70);
//        s3.hasPassed();


    }
}
