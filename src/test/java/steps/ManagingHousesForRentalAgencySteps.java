package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;
public class ManagingHousesForRentalAgencySteps {

  private List<Map<String,String>> lisOfHouses;

    @Given("a list of houses held by a rental agency with the following details:")
    public void a_list_of_houses_held_by_a_rental_agency_with_the_following_details(List<Map<String,String>> listOfMaps) {
        lisOfHouses=listOfMaps;
        for (Map<String,String> mapVars:listOfMaps) {
            if (mapVars.get("Wi-Fi").equals("Yes") && mapVars.get("Parking").equals("Yes")) {
                for (Map.Entry<String,String> entry : mapVars.entrySet()) {
                    System.out.println(entry.getKey()+": "+entry.getValue());
                }
            }
        }
    }
    @When("the agency needs to manage the houses' details")
    public void the_agency_needs_to_manage_the_houses_details() {
        System.out.println("Agency was managed the house");
    }
    @Then("the agency should be able to access and modify information about each house, including price per night, number of rooms, maximum guests, Wi-Fi availability, parking availability, address, and check-in\\/check-out times.")
    public void the_agency_should_be_able_to_access_and_modify_information_about_each_house_including_price_per_night_number_of_rooms_maximum_guests_wi_fi_availability_parking_availability_address_and_check_in_check_out_times() {
       // System.out.println(lisOfHouses);
    }

}
