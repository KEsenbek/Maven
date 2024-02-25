package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerModelConfigurationWithParameterizedStepsSteps {

    private String computerCapasity;
    private String computerColor;
    private String computeAvailability;
    private String computerPrice;
    private String computerScreen;
    private String computerRAM;
    private String computerProcessor;
    private String computerGraphics;
    private String computerOS;
    private String computerWarranty;


    @Given("the need to configure a new computer model")
    public void the_need_to_configure_a_new_computer_model() {
        System.out.println("Configure a new computer model");
    }
    @When("the capacity is set to {string}")
    public void the_capacity_is_set_to(String capacity) {
        computerCapasity=capacity;
    }
    @When("the color is set to {string}")
    public void the_color_is_set_to(String color) {
        computerColor=color;
    }
    @When("the availability is set to {string}")
    public void the_availability_is_set_to(String availability) {
        computeAvailability=availability;
    }
    @When("the price is set to {string}")
    public void the_price_is_set_to(String price) {
        computerPrice=price;
    }
    @When("the screen dimensions are set to {string}")
    public void the_screen_dimensions_are_set_to(String screen) {
        computerScreen=screen;
    }
    @When("the RAM size is set to {string}")
    public void the_ram_size_is_set_to(String RAM) {
        computerRAM=RAM;
    }
    @When("the processor is set to {string}")
    public void the_processor_is_set_to(String processor) {
        computerProcessor=processor;
    }
    @When("the graphics card is set to {string}")
    public void the_graphics_card_is_set_to(String graphics) {
        computerGraphics=graphics;
    }
    @When("the operating system is set to {string}")
    public void the_operating_system_is_set_to(String system) {
        computerOS=system;
    }
    @When("the warranty is set to {string}")
    public void the_warranty_is_set_to(String warranty) {
        computerWarranty=warranty;
    }
    @Then("a new computer model should be successfully configured with the provided details.")
    public void a_new_computer_model_should_be_successfully_configured_with_the_provided_details() {
        System.out.println("A new computer model successfully configured with the provided details");
    }
}
