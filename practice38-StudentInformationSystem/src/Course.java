public class Course {
    Teacher courseTeacher;

    String courseName;
    String courseCode;
    String coursePrefix;

    double totalGrade;
    int finalGrade;
    double finalGradeRatio;
    int popQuizGrade;
    double popQuizRatio;

    Course(String courseName, String courseCode, String coursePrefix, double finalGradeRatio, double popQuizRatio) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.finalGradeRatio = finalGradeRatio;
        this.popQuizRatio = popQuizRatio;
    }

    public void addTeacher(Teacher x) {
        if (this.coursePrefix.equals(x.branch)) {
            this.courseTeacher = x;
            System.out.println("The teacher has been successfully added to the course");
        } else {
            System.out.println(x.teacherName + " can not teach this course.");
        }
    }

    public void  printTeacher() {
        if (courseTeacher != null) System.out.println("Teacher: " + courseTeacher.teacherName);
        else System.out.println("Teacher: " + "No teacher has been assigned yet!");
    }
}
