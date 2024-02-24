package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.format.DateTimeFormatter;

public class ConfigureServerParametersSteps {
private String hostServer;
private String iPAddress;
private String nameServer;
private String configServ;
private String accessServer;

private String dateService;

private String userName;

private String diskSever;
private String statusServer;

    @Given("a new server needs to be configured")
    public void a_new_server_needs_to_be_configured() {
        System.out.println("Server is configured");
    }
    @When("the host is set to {string}")
    public void the_host_is_set_to(String host) {
       hostServer=host;
    }
    @When("the IP Address is set to {string}")
    public void the_ip_address_is_set_to(String Ip) {
        iPAddress=Ip;
    }
    @When("the Server Name is set to {string}")
    public void the_server_name_is_set_to(String name) {
        nameServer=name;
    }
    @When("the Rules and Policies are configured with {string}")
    public void the_rules_and_policies_are_configured_with(String config) {
        configServ=config;
    }
    @When("the Access Control is limited to {string}")
    public void the_access_control_is_limited_to(String access) {
       accessServer=access;
    }
    @When("the Expiration Date is set to {string}")
    public void the_expiration_date_is_set_to(String date) {
        dateService=formatTimeline(date);
    }
    @When("the Responsible User is defined as {string}")
    public void the_responsible_user_is_defined_as(String user) {
       userName=user;
    }
    @When("the Disk Space is allocated with {string}")
    public void the_disk_space_is_allocated_with(String disk) {
     diskSever=disk;
    }
    @When("the Server Status is set to {string}")
    public void the_server_status_is_set_to(String status) {
        statusServer=status;
    }
    @Then("the server should be successfully configured with the provided parameters.")
    public void the_server_should_be_successfully_configured_with_the_provided_parameters() {
        System.out.println("Server successful is configured");
    }

    private String formatTimeline(String timeline) {
        timeline = String.valueOf(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return timeline;
    }
}
