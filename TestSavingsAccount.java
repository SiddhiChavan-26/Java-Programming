class SavingsAccount {
	private static double annualInterestRate;
	
	private double savingsBalance;
	
	public SavingsAccount(double balance) {
		this.savingsBalance = balance;
	}
	
	public void calculateMonthlyInterest() {
		double monthlyInterest = ( savingsBalance * annualInterestRate ) / 12;
		savingsBalance += monthlyInterest;
	}
	
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	
	public double getBalance() {
		return savingsBalance;
	}
}
public class TestSavingsAccount{
	public static void main(String args[]) {
		SavingsAccount saver1 =  new SavingsAccount(2000);
		
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("saver1 balance after 4%% interest rate : Rs %.2f%n", saver1.getBalance());
		System.out.printf("saver2 balance after 4%% interest rate : Rs %.2f%n", saver2.getBalance());
		
		SavingsAccount.modifyInterestRate(0.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("saver1 balance after 5%% interest rate : Rs %.2f%n", saver1.getBalance());
		System.out.printf("saver2 balance after 5%% interest rate : Rs %.2f%n", saver2.getBalance());
	}
}
