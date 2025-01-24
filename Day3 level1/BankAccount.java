import java.util.*;
class BankAccount{
	public static String bankName="State Bank";
	static int totalAccounts = 0;
	String accountHolderName;
	final int accountNumber;
	
	
	public BankAccount(int accountNumber,String accountHolderName){
			this.accountNumber=accountNumber;
			this.accountHolderName=accountHolderName;
			totalAccounts++;
	}
	public static void getTotalAccounts(){
			System.out.println("Total Account is: "+totalAccounts);
	}
	
	public void displayAccountDetails() {
		
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
	}
		
	public static void main(String[] args) {
        // Create some accounts
        BankAccount account1 = new BankAccount( 101,"Alice");
        BankAccount account2 = new BankAccount(102,"Bob");
        
        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        
        // Display total accounts
        BankAccount.getTotalAccounts();
    }
}