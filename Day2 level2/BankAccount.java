public class BankAccount {
    // Static variables
    static String bankName = "MyBank"; // Shared across all accounts
    private static int totalAccounts = 0; // Counter to track total number of accounts
    
    // Final variable
    private final String accountNumber; // Ensures account number can't be changed once assigned
    
    // Instance variables
    private String accountHolderName;
    
    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment the total number of accounts
    }
    
    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }
    
    // Method to display account details if the object is an instance of BankAccount
    public void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("This is not a valid BankAccount object.");
        }
    }

    // Getter for account number (to avoid direct modification of the final variable)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("Alice", "12345");
        BankAccount account2 = new BankAccount("Bob", "67890");
        
        // Displaying total accounts
        BankAccount.getTotalAccounts();
        
        // Displaying account details
        account1.displayAccountDetails(account1);
        account2.displayAccountDetails(account2);
    }
}
