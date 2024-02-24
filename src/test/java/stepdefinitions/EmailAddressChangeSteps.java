package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailAddressChangeSteps {


private String newEmail;


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.out.println("Welcome");
    }
    @Given("the user is on the account settings page")
    public void the_user_is_on_the_account_settings_page() {
        System.out.println("Setting page");
    }
    @When("the user changes the email address to {string}")
    public void the_user_changes_the_email_address_to(String email) {
        newEmail=email;
    }
    @Then("the email address should be updated to {string}")
    public void the_email_address_should_be_updated_to(String newEmailAd) {
        newEmail=newEmailAd;
    }
}
