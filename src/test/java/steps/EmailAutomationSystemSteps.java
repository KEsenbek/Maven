package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.EmailAutomationSystem;

import java.util.Comparator;
import java.util.List;

public class EmailAutomationSystemSteps {

    @Given("a list of email types with the following details:")
    public void a_list_of_email_types_with_the_following_details(List<EmailAutomationSystem> automationSystemList) {
        System.out.println(automationSystemList.get(0).getEmailType());
    }
    @When("the user configures email automation settings by specifying the email type and associated automation settings:")
    public void the_user_configures_email_automation_settings_by_specifying_the_email_type_and_associated_automation_settings(List<EmailAutomationSystem> automationSystemList) {

    }
    @When("the user sets up additional email automation settings for the same email types:")
    public void the_user_sets_up_additional_email_automation_settings_for_the_same_email_types(List<EmailAutomationSystem> automationSystemList) {

    }
    @Then("the user should be able to view and confirm the configured email automation settings:")
    public void the_user_should_be_able_to_view_and_confirm_the_configured_email_automation_settings(List<EmailAutomationSystem> automationSystemList) {
        automationSystemList.sort(Comparator.comparing(EmailAutomationSystem::getSendTime));
        System.out.println("Schedules ordered from earliest to latest:");
        automationSystemList.forEach(settings ->
                System.out.println(settings.getEmailType() + " - " + settings.getSendTime()));

        System.out.println("Weekly Email Types:");
        automationSystemList.stream()
                .filter(settings -> "Weekly".equalsIgnoreCase(settings.getScheduleFrequency()))
                .forEach(settings -> System.out.println(settings.getEmailType()));
    }


    @Then("the user should verify that the latest settings have been applied successfully.")
    public void the_user_should_verify_that_the_latest_settings_have_been_applied_successfully() {

    }

}
