package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CallSystemSteps {
    @Given("the user is an administrator logged into the call system configuration")
    public void the_user_is_an_administrator_logged_into_the_call_system_configuration() {
        System.out.println("It is Given");
    }
    @Given("the user selects the system settings option")
    public void the_user_selects_the_system_settings_option() {
        System.out.println("It is First And for Given");
    }
    @Given("the user chooses the audio messaging feature from the available options")
    public void the_user_chooses_the_audio_messaging_feature_from_the_available_options() {
        System.out.println("It is Second And for Given");
    }
    @Given("the audio message feature is currently turned off")
    public void the_audio_message_feature_is_currently_turned_off() {
        System.out.println("It is Third And for Given");
    }
    @When("the user toggles the audio message feature to {string}")
    public void the_user_toggles_the_audio_message_feature_to(String string) {
        System.out.println("It is When");
    }
    @When("confirms the change")
    public void confirms_the_change() {
        System.out.println("It is And for When");
    }
    @Then("the system should save the configuration successfully")
    public void the_system_should_save_the_configuration_successfully() {
        System.out.println("It is Then");
    }
    @Then("the audio message feature should be turned on")
    public void the_audio_message_feature_should_be_turned_on() {
        System.out.println("It is And for Then");
    }
}
