class Calculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Calculator <number1> <number2>");
            System.out.println("Example: java Calculator 10 5");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;
            
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("--------------------");
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers as arguments.");
            System.out.println("Example: java Calculator 10.5 3.2");
        }
    }
}