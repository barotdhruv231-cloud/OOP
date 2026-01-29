import java.util.Scanner;

public class BillGenerator {
    
    public void generateBill(int itemTotal) {
        System.out.println("Regular Customer Bill");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Discount: Rs. 0");
        System.out.println("Final Bill Amount: Rs. " + itemTotal);
    }
    
    public void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Privileged Customer Bill");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Flat Discount: Rs. " + discount);
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
    }
    
    public void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Festive Offer Bill");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();
        
        System.out.println("Shopping Mall Billing System");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer Customer");
        System.out.print("Enter customer type (1/2/3): ");
        int customerType = scanner.nextInt();
        
        System.out.print("Enter item total: Rs. ");
        int itemTotal = scanner.nextInt();
        
        System.out.println();
        
        if (customerType == 1) {
            bill.generateBill(itemTotal);
        } else if (customerType == 2) {
            System.out.print("Enter flat discount amount: Rs. ");
            int discount = scanner.nextInt();
            System.out.println();
            bill.generateBill(itemTotal, discount);
        } else if (customerType == 3) {
            System.out.print("Enter discount percentage: ");
            double discountPercent = scanner.nextDouble();
            System.out.println();
            bill.generateBill(itemTotal, discountPercent);
        } else {
            System.out.println("Invalid customer type");
        }
        
        scanner.close();
    }
}