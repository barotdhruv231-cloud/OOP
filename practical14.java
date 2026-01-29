import java.util.Scanner;

public class BankAccount {
    private String accountId;
    private String accountHolderName;
    private double balance;
    
    public void assignValues(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    
    public String getAccountId() {
        return accountId;
    }
    
    public static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountId().equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account with ID " + searchId + " not found.");
        }
    }
    
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        
        accounts[0] = new BankAccount();
        accounts[0].assignValues("ACC001", "John Doe", 5000.50);
        
        accounts[1] = new BankAccount();
        accounts[1].assignValues("ACC002", "Jane Smith", 7500.75);
        
        accounts[2] = new BankAccount();
        accounts[2].assignValues("ACC003", "Bob Johnson", 3200.00);
        
        accounts[3] = new BankAccount();
        accounts[3].assignValues("ACC004", "Alice Williams", 9800.25);
        
        accounts[4] = new BankAccount();
        accounts[4].assignValues("ACC005", "Charlie Brown", 4500.00);
        
        System.out.println("All Bank Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID to search: ");
        String searchId = scanner.nextLine();
        
        searchAccount(accounts, searchId);
        
        scanner.close();
    }
}