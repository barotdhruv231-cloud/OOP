import java.util.Scanner;

public class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("\n===== Admission Details =====");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
            System.out.println("==============================");
        }
    }

    public static void main(String[] args) {
        College college = new College("Springfield University");
        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}


