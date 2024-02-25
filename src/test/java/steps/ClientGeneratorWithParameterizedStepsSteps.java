package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.format.DateTimeFormatter;

public class ClientGeneratorWithParameterizedStepsSteps {

    private String clientAddress;
    private String clientName;
    private String clientPlan;
    private String clientBillDate;
    private String clientPhoneNumber;
    private String clientEmail;
    private String clientPayMethod;

    @Given("the need to generate a new client")
    public void the_need_to_generate_a_new_client() {
        System.out.println("Generation a new client");
    }
    @When("a client's address is set to {string}")
    public void a_client_s_address_is_set_to(String address) {
        clientAddress=address;
    }
    @When("the client's name is set to {string}")
    public void the_client_s_name_is_set_to(String name) {
        clientName=name;
    }
    @When("the client's plan is set to {string}")
    public void the_client_s_plan_is_set_to(String plan) {
        clientPlan=plan;
    }
    @When("the client's last billing date is set to {string}")
    public void the_client_s_last_billing_date_is_set_to(String billing) {
        clientBillDate=formatTimeline(billing);
    }
    @When("the client's delivery is enabled")
    public void the_client_s_delivery_is_enabled() {
        System.out.println("Delivered");
    }
    @When("the client's phone number is set to {string}")
    public void the_client_s_phone_number_is_set_to(String phoneNumber) {
        clientPhoneNumber=phoneNumber;
    }
    @When("the client's email is set to {string}")
    public void the_client_s_email_is_set_to(String email) {
        clientEmail=email;
    }
    @When("the client's payment method is {string}")
    public void the_client_s_payment_method_is(String payment) {
        clientPayMethod=payment;
    }
    @Then("a new client should be successfully generated with the provided details.")
    public void a_new_client_should_be_successfully_generated_with_the_provided_details() {
        System.out.println("a new client successfully generated with the provided details");
    }

    private String formatTimeline(String timeline) {
        return timeline = String.valueOf(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
