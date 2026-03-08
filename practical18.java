public class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 3.5;

    BankAccount(String account_holder_name, double balance) {
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void displayInterest() {
        System.out.println("\nAccount Holder : " + account_holder_name);
        System.out.println("Balance        : $" + balance);
        System.out.println("Interest Rate  : " + interest_rate + "%");
        System.out.println("Interest Earned: $" + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("\nInterest rate updated to: " + interest_rate + "%");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 25000);
        BankAccount acc3 = new BankAccount("Charlie", 15000);

        System.out.println("===== Interest at " + interest_rate + "% =====");
        acc1.displayInterest();
        acc2.displayInterest();
        acc3.displayInterest();

        BankAccount.updateInterestRate(5.0);

        System.out.println("\n===== Interest at " + interest_rate + "% =====");
        acc1.displayInterest();
        acc2.displayInterest();
        acc3.displayInterest();
    }
}