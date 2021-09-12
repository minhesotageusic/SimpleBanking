package Main;
/**
 * Handle balance related to an account number
 * @author Minhesota Geusic 
 */
public class Account {
	/**
	 * unique identification for this account
	 */
	protected String accountNumber;
	/**
	 * stored money for this account
	 */
	protected float balance;
	/**
	 * interest on this account
	 */
	protected float interest = 0f;
	/**
	 * Constructor
	 * @param accountNumber identifier for this account
	 * @param startingBalance initial balance
	 * @throws Exception 
	 */
	public Account(String accountNumber, float startingBalance) {
		this.accountNumber = accountNumber;
		balance = startingBalance;
	}
	/**
	 * Widthraw given amount from account
	 * @param amount value to take
	 * @return true if amount can be taken, else false
	 */
	public boolean Widthraw(float amount) {
		if ( amount > balance ) return false;
		balance -= amount;
		return true;
	}
	/**
	 * Deposit given amount to account
	 * @param amount value to deposit
	 * @return new balance
	 */
	public float Deposit(float amount) {
		if ( amount < 0 ) return balance;
		return balance + amount;
	}
	/**
	 * Return this account's identification
	 * @return a string value
	 */
	public String GetAccountNumber() { return accountNumber; }
	/**
	 * Return balance associated with this account
	 * @return a float value
	 */
	public float GetBalance() { return balance;	}
	/**
	 * Return interest associated with this account
	 * @return a float value
	 */
	public float GetInterest() { return interest; }

}
