import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();
        
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        
        double bmi = weightKg / (heightMeters * heightMeters);
        
        System.out.println("Your BMI is: " + bmi);
        
        scanner.close();
    }
}