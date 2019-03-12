package junitcucumber;

public class BankFactory {
	public static Account buildAccount(String name) {
		return new Account(name);
	}
}
