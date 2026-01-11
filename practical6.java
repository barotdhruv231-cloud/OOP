import java.util.Scanner;

class DigitIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        
        int[] digits = new int[5];
        int temp = number;
        
        for (int i = 4; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        for (int i = 0; i < 5; i++) {
            digits[i] = (digits[i] + 1) % 10;
        }
        
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result * 10 + digits[i];
        }
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}