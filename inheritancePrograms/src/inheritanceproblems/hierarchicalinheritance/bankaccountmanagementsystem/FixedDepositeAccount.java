package inheritanceproblems.hierarchicalinheritance.bankaccountmanagementsystem;

class FixedDepositAccount extends BankAccount {
    private int termLength; // in months
    private double interestRate;

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int termLength, double interestRate) {
        super(accountNumber, balance); // Calling the constructor of the superclass (BankAccount)
        this.termLength = termLength;
        this.interestRate = interestRate;
    }

    // Getter methods for termLength and interestRate
    public int getTermLength() {
        return termLength;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Overridden method to display account type for FixedDepositAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term Length: " + termLength + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
