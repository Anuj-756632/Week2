package inheritanceproblems.hierarchicalinheritance.bankaccountmanagementsystem;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calling the constructor of the superclass (BankAccount)
        this.interestRate = interestRate;
    }

    // Getter method for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    // Overridden method to display account type for SavingsAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
