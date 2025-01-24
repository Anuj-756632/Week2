// Parent class BankAccount
class BankAccount {
    // Instance variables
    public String accountNumber;   // public - can be accessed directly
    protected String accountHolder;  // protected - can be accessed within the same package or subclass
    private double balance;   // private - can only be accessed via getter/setter methods

    // Constructor to initialize BankAccount details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Public setter method to modify balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    // Constructor to initialize SavingsAccount details (calling parent constructor)
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display details of the SavingsAccount, including access to accountNumber and accountHolder
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);    // Accessing public accountNumber directly
        System.out.println("Account Holder: " + accountHolder);  // Accessing protected accountHolder directly
        System.out.println("Balance: " + getBalance());  // Accessing private balance through getter method
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount bankAccount = new BankAccount("1234567890", "John Doe", 1000.50);
        bankAccount.displayAccountDetails();

        // Creating an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("0987654321", "Alice Smith", 5000.75);
        savingsAccount.displaySavingsAccountDetails();

        // Modifying balance using setter method
        savingsAccount.setBalance(6000.00);
        System.out.println("\nUpdated Savings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
