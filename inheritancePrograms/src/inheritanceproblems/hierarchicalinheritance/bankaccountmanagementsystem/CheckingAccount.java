package inheritanceproblems.hierarchicalinheritance;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Calling the constructor of the superclass (BankAccount)
        this.withdrawalLimit = withdrawalLimit;
    }

    // Getter method for withdrawalLimit
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    // Overridden method to display account type for CheckingAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}
