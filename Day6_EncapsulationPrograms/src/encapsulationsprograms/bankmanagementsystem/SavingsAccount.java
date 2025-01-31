package encapsulationsprograms.bankmanagementsystem;

class SavingsAccount extends BankAccount {
    private double interestRate; // annual interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // No interest for current accounts (or a custom rule can be applied)
        return 0;
    }

    // Getter for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

