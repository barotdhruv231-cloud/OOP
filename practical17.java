public class University {
    static String universityName;
    static int totalStudents;

    static {
        universityName = "State University";
        System.out.println("Static block executed: University name set to " + universityName);
    }

    {
        totalStudents++;
        System.out.println("Instance block executed: Student object #" + totalStudents + " is being created");
    }

    String studentName;

    University(String studentName) {
        this.studentName = studentName;
        System.out.println("Constructor executed: Created student -> " + studentName);
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("\n--- Creating Student 1 ---");
        University s1 = new University("Alice");

        System.out.println("\n--- Creating Student 2 ---");
        University s2 = new University("Bob");

        System.out.println("\n--- Creating Student 3 ---");
        University s3 = new University("Charlie");

        System.out.println("\nTotal Students at " + universityName + ": " + getTotalStudents());
    }
}
