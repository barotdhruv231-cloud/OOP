import java.util.Scanner;

class CramersRuleSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Solve system: ax + by = e and cx + dy = f");
        System.out.println();
        
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();
        
        System.out.print("Enter coefficient d: ");
        double d = input.nextDouble();
        
        System.out.print("Enter constant e: ");
        double e = input.nextDouble();
        
        System.out.print("Enter constant f: ");
        double f = input.nextDouble();
        
        double D = a * d - b * c;
        
        if (D == 0) {
            System.out.println("\nError: The system has no unique solution (denominator is zero).");
            System.out.println("The equations are either parallel or identical.");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - c * e;
            
            double x = Dx / D;
            double y = Dy / D;
            
            System.out.println();
            System.out.printf("Solution: x = %.2f, y = %.2f%n", x, y);
        }
        
        input.close();
    }

}
