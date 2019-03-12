package junitcucumber;
 
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.Account;
 
public class UserSteps {
	Account acc;
	BankRepo repo;
	public void UserSteps(Account acc1) {
		//acc = acc1;
	}
     
    @Given("^an existing client named \"([^\"]*)\" with (\\d+)\\.(\\d+) EUR in his account$")
    public void an_existing_client_named_with_EUR_in_his_account(String arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	repo = new BankRepo();
    	acc = repo.getAccount(arg1);
    	
        assertNotNull(acc);
        assertEquals(arg2, acc.currentBalance, 0.0f);
    	
    	//throw new PendingException();
    }

    @When("^he withdraws (\\d+)\\.(\\d+) EUR from his account$")
    public void he_withdraws_EUR_from_his_account(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	WithdrawService.withdraw(repo, acc.name, arg1);    	
    }

    @Then("^the new balance is (\\d+)\\.(\\d+) EUR$")
    public void the_new_balance_is_EUR(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	assertEquals(arg1, acc.currentBalance, 0.0f);    	
    }
}