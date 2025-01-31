package inheritanceproblems.hierarchicalinheritance;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods for BankAccount
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display basic account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to be overridden in subclasses to display account type
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}
