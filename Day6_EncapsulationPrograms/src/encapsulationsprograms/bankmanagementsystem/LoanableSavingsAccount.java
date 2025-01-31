package encapsulationsprograms.bankmanagementsystem;

class LoanableSavingsAccount extends SavingsAccount implements Loanable {
    public LoanableSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance, interestRate);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for " + amount);
        } else {
            System.out.println("Loan application rejected due to insufficient balance or criteria.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Eligibility: Must have at least 10x the loan amount in balance
        return getBalance() >= 1000;
    }
}

class LoanableCurrentAccount extends CurrentAccount implements Loanable {
    public LoanableCurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance, overdraftLimit);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for " + amount);
        } else {
            System.out.println("Loan application rejected due to insufficient balance or criteria.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Eligibility: Can apply for a loan if overdraft limit is available
        return getBalance() + getOverdraftLimit() >= 1000;
    }
}

