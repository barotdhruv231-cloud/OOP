class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        System.out.println("Account opened for " + accountHolderName + " | Account No: " + accountNumber);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName + " | Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double rateOfInterest;
    int years;

    void openAccount(String accountNumber, String accountHolderName, double initialDeposit, double rateOfInterest, int years) {
        super.openAccount(accountNumber, accountHolderName, initialDeposit);
        this.rateOfInterest = rateOfInterest;
        this.years = years;
    }

    double calculateInterest() {
        double interest = (balance * rateOfInterest * years) / 100;
        System.out.println("Simple Interest for " + years + " years at " + rateOfInterest + "%: " + interest);
        return interest;
    }
}

class FixedDepositAccount extends BankAccount {
    double rateOfInterest;
    int months;

    void openAccount(String accountNumber, String accountHolderName, double depositAmount, double rateOfInterest, int months) {
        super.openAccount(accountNumber, accountHolderName, depositAmount);
        this.rateOfInterest = rateOfInterest;
        this.months = months;
    }

    double maturityAmount() {
        double amount = balance * Math.pow((1 + rateOfInterest / 100), months / 12.0);
        System.out.println("Maturity Amount after " + months + " months at " + rateOfInterest + "%: " + amount);
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Saving Account ===");
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA001", "Alice", 10000, 5.0, 3);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        System.out.println("=== Fixed Deposit Account ===");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD001", "Bob", 50000, 7.5, 24);
        fd.checkBalance();
        fd.maturityAmount();
    }
}