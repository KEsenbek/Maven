package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumberDemo {

    @Given("Bank account {int} exists with balance ${int}")
    public void bank_account_exists_with_balance_$(Integer int1, Integer int2) {

    }
    @When("Bank account {int} deposits ${int}")
    public void bank_account_deposits_$(Integer int1, Integer int2) {

    }
    @Then("Bank account {int} should have ${int} in balance")
    public void bank_account_should_have_$_in_balance(Integer int1, Integer int2) {

    }

    @Given("User  account number {int} is registered")
    public void user_account_number_is_registered(Integer int1) {

    }
    @Given("User  account number {int} deposited ${int}")
    public void user_account_number_deposited_$(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("User with account number {int} transferred ${int}")
    public void user_with_account_number_transferred_$(Integer int1, Integer int2) {

    }
    @When("User with account number {int} should have ${int} in the balance.")
    public void user_with_account_number_should_have_$_in_the_balance(Integer int1, Integer int2) {

    }
}
