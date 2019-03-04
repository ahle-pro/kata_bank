package junitcucumber;
 
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.User;
 
public class UserSteps {
 
    private User user = new User();
 
    @Given("^that the user (.*) is given a task to clear (.*) certification exam$")
    public void certificationName(String name, String certication) throws Throwable {
        user.setName(name);
        user.setCertification(certication);
    }
 
    @When("^(.*) got (\\d+) marks in exam$")
    public void gotMarks(String name, int marks) throws Throwable {
        user.setName(name);
        user.setMarks(marks);
    }
 
    @Then("^(.*) is known as (.*) certified$")
    public void certifiedYes(String name, String certification) throws Throwable {
        assertThat(name, is(user.getName()));
        assertThat(user.getCertification(), equalTo("Java"));
        assertThat(user.getResult(), is(true));
    }
    
    @Given("^an existing client named \"([^\"]*)\" with (\\d+)\\.(\\d+) EUR in his account$")
    public void an_existing_client_named_with_EUR_in_his_account(String arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^he withdraws (\\d+)\\.(\\d+) EUR from his account$")
    public void he_withdraws_EUR_from_his_account(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the new balance is (\\d+)\\.(\\d+) EUR$")
    public void the_new_balance_is_EUR(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}