package bankaccount;

public class Account {
	
	private double balance;

	/**
	 * @param initialBalance
	 */
	public Account(double initialBalance) {
		
		if (initialBalance > 0) {
			balance = initialBalance;
			
		}
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	public void credit (double amount) {
		balance = balance + amount;
	}

}
