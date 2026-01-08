import java.util.Scanner;

class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();
        
        System.out.println("\n100: " + amount / 100);
        amount = amount % 100;
        
        System.out.println("50: " + amount / 50);
        amount = amount % 50;
        
        System.out.println("10: " + amount / 10);
        amount = amount % 10;
        
        System.out.println("5: " + amount / 5);
        amount = amount % 5;
        
        System.out.println("2: " + amount / 2);
        amount = amount % 2;
        
        System.out.println("1: " + amount);
        
        scanner.close();
    }
}