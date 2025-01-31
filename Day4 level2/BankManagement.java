class Bank{
	String customerName;
	int accountNo;
	double balance=0;
	public Bank(){
	}
	
	public Bank(String customerName,int accountNo,double balance){
			this.customerName=customerName;
			this.accountNo=accountNo;
			this.balance=balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void openAccount(String customerName,int accountNo,double balance){
		this.customerName=customerName;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void customerDetails(){
		System.out.println("Customer Name: "+customerName+"\nAcccount no: "+accountNo+"\nBalance: "+balance);
	}
}	

//Customer class
class Customer extends Bank{
	String name;
	Bank bank;
	public Customer(String  name,Bank bank){
		this.name=name;
		this.bank=bank;
	}
	public void viewBalance(){
		
		System.out.println(name+": "+bank.getBalance());
	}
}
public class BankManagement{
	public static void main(String []args){
		Bank bank=new Bank();
		
		Customer customer=new Customer("anuj",bank);
		bank.openAccount("Anuj",123,15000);
		bank.customerDetails();
		customer.viewBalance();
	}
}