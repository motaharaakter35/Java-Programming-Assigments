class Employee {
    double salary() {
        return 0;
    }
}

class Manager extends Employee {
    double salary() {
        return 50000;
    }
}

class Developer extends Employee {
    double salary() {
        return 40000;
    }
}

public class employeesystem {
    public static void main(String[] args) {

        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Manager Salary = " + e1.salary());
        System.out.println("Developer Salary = " + e2.salary());
    }
}