import java.util.Scanner;
class BankAccount {
    
    // Attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account (with balance check)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Your current balance is: $" + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Getters for account details (optional, useful for accessing account details)
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
public class UseBankAccount{
    // Main method to test the functionality
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String accountHolder=sc.nextLine();

        int accountNumber=sc.nextInt();

        double initialbalance=sc.nextDouble();
        // Creating a new BankAccount object
        BankAccount account = new BankAccount(accountHolder,accountNumber,initialbalance);

        // Displaying the initial balance
        account.displayBalance();

        // Depositing money
        account.deposit(150.00);
        
        // Withdrawing money
        account.withdraw(200.00);

        // Displaying the current balance after transactions
        account.displayBalance();

        // Trying to withdraw an amount larger than the available balance
        account.withdraw(600.00);

        // Displaying the final balance
        account.displayBalance();
    }
}

