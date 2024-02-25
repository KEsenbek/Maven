package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.List;


public class CarComparisonWithDatatablesSteps {

    @Given("a list of cars with their characteristics:")
    public void a_list_of_cars_with_their_characteristics(List<Map<String,String>> listOfCharacters) {
        for (Map<String,String> listMap : listOfCharacters) {
            if (listMap.get("Car").contains("Tesla Model 3")) {
                for (Map.Entry<String,String> entryMap : listMap.entrySet()){
                    System.out.println(entryMap.getKey() + ": " +entryMap.getValue());
                }
            }
        }

    }
    @When("the user compares the cars based on the following characteristics:")
    public void the_user_compares_the_cars_based_on_the_following_characteristics(List<String> listOfCarType) {
//        for (String varList: listOfCarType) {
//            System.out.println(varList);
//        }
    }
    @Then("the user should be able to make comparisons between the cars and determine which car has:")
    public void the_user_should_be_able_to_make_comparisons_between_the_cars_and_determine_which_car_has(List<String> listOfСhoose) {

    }

}
