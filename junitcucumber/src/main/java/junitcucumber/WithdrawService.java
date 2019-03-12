package junitcucumber;

public class WithdrawService {
	public static void withdraw(BankRepo repo, String name, float money) {
		Account acc = repo.getAccount(name);
		acc.transactions.add(new Transaction(acc.currentBalance, money, acc.currentBalance - money));// no time to code, let public
		acc.currentBalance = acc.currentBalance - money;// no time to code, let public
	}
}
