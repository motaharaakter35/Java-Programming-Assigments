class Student {
    String name;
    int id;

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class studentc {
    public static void main(String[] args) {

        Student s1 = new Student("motahara", 267881);

        s1.display();
    }
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    double bonus;

    FullTimeEmployee(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return monthlySalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double hourlyRate;

    PartTimeEmployee(String name, int hours, double hourlyRate) {
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class Employeetypes {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahim", 30000, 5000);
        Employee e2 = new PartTimeEmployee("Karim", 80, 200);

        System.out.println("Full Time Employee");
        e1.display();

        System.out.println("Part Time Employee");
        e2.display();
    }
}

}
