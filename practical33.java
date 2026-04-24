public class Main{
    public static void main(String[] args){
        System.out.println("Name - Dhruv Barot");
        System.out.println("Enrollment No - 250393107002");
        try{
            if(args.length<2){
                System.out.println("Please provide numerator and denominator");
                return;
            }
            int numerator=Integer.parseInt(args[0]);
            int denominator=Integer.parseInt(args[1]);
            int result=numerator/denominator;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero not allowed");
        }catch(NumberFormatException e){
            System.out.println("Error: Invalid number format");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}