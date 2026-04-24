class NotSufficientFundException extends Exception{
NotSufficientFundException(String msg){
super(msg);
}
}
class BankAccount{
double balance;
BankAccount(){
balance=1000.00;
}
void deposit(double amount){
balance+=amount;
System.out.println("Deposited: "+amount);
}
void withdraw(double amount)throws NotSufficientFundException{
if(amount>balance)throw new NotSufficientFundException("Not Sufficient Fund");
balance-=amount;
System.out.println("Withdrawn: "+amount);
}
void display(){
System.out.println("Balance: "+balance);
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
BankAccount b=new BankAccount();
b.display();
b.deposit(1000.00);
b.display();
try{
b.withdraw(400.00);
b.display();
b.withdraw(300.00);
b.display();
b.withdraw(500.00);
b.display();
}catch(NotSufficientFundException e){
System.out.println(e.getMessage());
}
}
}