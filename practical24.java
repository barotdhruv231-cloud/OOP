class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Department    : " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size     : " + teamSize);
        System.out.println("Project Name  : " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", "Human Resources");
        Manager mgr = new Manager("Bob Smith", "Engineering", 8, "Smart Inventory System");

        System.out.println("=== Employee Details ===");
        emp.displayDetails();

        System.out.println();

        System.out.println("=== Manager Details ===");
        mgr.displayDetails();

        System.out.println();

        System.out.println("=== Runtime Polymorphism Demo ===");
        Employee ref1 = new Employee("Carol White", "Finance");
        Employee ref2 = new Manager("David Brown", "Marketing", 5, "Brand Relaunch");

        ref1.displayDetails();
        System.out.println();
        ref2.displayDetails();
    }
}