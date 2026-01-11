import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The given side lengths cannot form a triangle.");
        }
        
        scanner.close();
    }
}