package junitcucumber;

public class Transaction {
	private float originalBalance;
	private float amount;
	private float newBalance;
	
	public Transaction(float oldB, float amt, float newB) {
		originalBalance = oldB;
		amount = amt;
		newBalance = newB;
	}
}
