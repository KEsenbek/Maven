package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ColorMixingSteps {

    private String firstColor;

    private String secondColor;

    private String resultColor;

    @Given("the first color is {string}")
    public void the_first_color_is(String first) {
        firstColor = first;
     }
    @Given("the second color is {string}")
    public void the_second_color_is(String second) {
      secondColor = second;
    }
    @When("the system mixes the two colors")
    public void the_system_mixes_the_two_colors() {
        System.out.println("mixing the two colors");
    }
    @Then("the result should be {string}")
    public void the_result_should_be(String result) {
       resultColor=result;
    }
}
