package junitcucumber;

public class BankRepo {
	public Account acc;
	public Account getAccount(String name) {
		return acc;// fake	
	}
	public BankRepo() {
		acc = BankFactory.buildAccount("pierre");// fake	
	}
	
}
