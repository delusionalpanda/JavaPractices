public class Employee {

    String fullName;

    double salary;
    double workHours;

    int hireYear;

    public Employee(String fullName, double salary, double workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = (salary > 0) ? salary : 0;
        this.workHours = (workHours > 0) ? workHours : 0;
        this.hireYear = (hireYear >= 1921 && hireYear <= 2021) ? hireYear : 0;
        System.out.println(toString());
    }

    public double tax() {
        return (this.salary > 1000) ? this.salary * 0.03 : 0;
    }

    public double bonus() {
        double overtime = workHours - 40;
        return (overtime > 0) ? overtime * 30 : 0;
    }

    public double salaryRaise() {
        double raise = 0;
        if (hireYear == 0) {
            return raise;
        } else {
            int lengthOfService = 2021 - this.hireYear;
            if (lengthOfService < 10) {
                raise = this.salary * 0.05;
            } else if(lengthOfService < 20) {
                raise = this.salary * 0.10;
            } else {
                raise = this.salary * 0.15;
            }
        }
        return raise;
    }

    public void calculateSalary() {
        System.out.println("Tax: " + tax() +
                "\nBonus: " + bonus() +
                "\nRaise: " + salaryRaise());
        this.salary = this.salary + salaryRaise() + bonus() - tax();
        System.out.println("Net Salary: " + this.salary);
    }

    @Override
    public String toString() {
        return "Name: " + this.fullName + "\nSalary: " + this.salary + "\nworkHours: " + this.workHours + "\nStart Year: " + this.hireYear;
    }
}
