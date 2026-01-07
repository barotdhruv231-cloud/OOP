import java.util.Scanner;

public class MetersToFeetConverter {
   public static void main(String[] args) {
    final double METERS_TO_FEET = 3.28084;
        
     Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();
        
        double feet = meters * METERS_TO_FEET;
        
        System.out.printf("%.2f meters = %.2f feet%n", meters, feet);
        
        input.close();
    }
}