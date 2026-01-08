import java.util.Scanner;

class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single letter: ");
        char letter = scanner.next().charAt(0);
        
        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else {
            char lowerLetter = Character.toLowerCase(letter);
            
            if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || 
                lowerLetter == 'o' || lowerLetter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
        
        scanner.close();
    }
}