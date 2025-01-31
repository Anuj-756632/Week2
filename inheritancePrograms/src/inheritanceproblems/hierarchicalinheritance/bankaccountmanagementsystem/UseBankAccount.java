package inheritanceproblems.hierarchicalinheritance.bankaccountmanagementsystem;

public class UseBankAccount {
    public static void main(String[] args) {
        // Creating instances of each account type
        BankAccount bankAccount = new BankAccount("BA123", 5000);
        SavingsAccount savingsAccount = new SavingsAccount("SA456", 10000, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA789", 2000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA012", 15000, 12, 5.0);

        // Displaying details of each account
        System.out.println("=== Bank Account ===");
        bankAccount.displayAccountInfo();
        bankAccount.displayAccountType();

        System.out.println("\n=== Savings Account ===");
        savingsAccount.displayAccountInfo();
        savingsAccount.displayAccountType();

        System.out.println("\n=== Checking Account ===");
        checkingAccount.displayAccountInfo();
        checkingAccount.displayAccountType();

        System.out.println("\n=== Fixed Deposit Account ===");
        fixedDepositAccount.displayAccountInfo();
        fixedDepositAccount.displayAccountType();
    }
}
