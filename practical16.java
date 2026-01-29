import java.util.Scanner;

public class LoanCalculator {
    
    public void calculateEMI(int principal, int time, float rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Home Loan EMI Calculation");
        System.out.println("Principal: Rs. " + principal);
        System.out.println("Time Period: " + time + " years");
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Monthly EMI: Rs. " + String.format("%.2f", emi));
        System.out.println("Total Amount Payable: Rs. " + String.format("%.2f", emi * n));
    }
    
    public void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Vehicle Loan EMI Calculation");
        System.out.println("Principal: Rs. " + principal);
        System.out.println("Time Period: " + time + " years");
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Monthly EMI: Rs. " + String.format("%.2f", emi));
        System.out.println("Total Amount Payable: Rs. " + String.format("%.2f", emi * n));
    }
    
    public void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Personal Loan EMI Calculation");
        System.out.println("Principal: Rs. " + principal);
        System.out.println("Time Period: " + time + " years");
        System.out.println("Interest Rate: " + rate + "% (Fixed)");
        System.out.println("Monthly EMI: Rs. " + String.format("%.2f", emi));
        System.out.println("Total Amount Payable: Rs. " + String.format("%.2f", emi * n));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanCalculator calculator = new LoanCalculator();
        
        System.out.println("=== Bank Loan EMI Calculator ===\n");
        
        System.out.println("1. Home Loan");
        System.out.print("Enter principal amount: Rs. ");
        int homePrincipal = scanner.nextInt();
        System.out.print("Enter time period (years): ");
        int homeTime = scanner.nextInt();
        System.out.print("Enter interest rate (%): ");
        float homeRate = scanner.nextFloat();
        calculator.calculateEMI(homePrincipal, homeTime, homeRate);
        
        System.out.println("\n2. Vehicle Loan");
        System.out.print("Enter principal amount: Rs. ");
        double vehiclePrincipal = scanner.nextDouble();
        System.out.print("Enter time period (years): ");
        int vehicleTime = scanner.nextInt();
        System.out.print("Enter interest rate (%): ");
        double vehicleRate = scanner.nextDouble();
        calculator.calculateEMI(vehiclePrincipal, vehicleTime, vehicleRate);
        
        System.out.println("\n3. Personal Loan");
        System.out.print("Enter principal amount: Rs. ");
        int personalPrincipal = scanner.nextInt();
        System.out.print("Enter time period (years): ");
        int personalTime = scanner.nextInt();
        calculator.calculateEMI(personalPrincipal, personalTime);
        
        scanner.close();
    }
}