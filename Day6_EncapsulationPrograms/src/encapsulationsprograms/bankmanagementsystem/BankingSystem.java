package encapsulationsprograms.bankmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new LoanableSavingsAccount("S123", "John Doe", 1500, 5.0);
        BankAccount currentAccount = new LoanableCurrentAccount("C456", "Jane Smith", 800, 200);

        // List to store different types of accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Process each account: deposit, withdraw, calculate interest
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());

            // Deposit and Withdraw
            account.deposit(500);
            account.withdraw(200);

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);

            // Check if the account can apply for a loan (Loanable accounts)
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(1000);  // Example loan amount
            }

            System.out.println();
        }
    }
}

