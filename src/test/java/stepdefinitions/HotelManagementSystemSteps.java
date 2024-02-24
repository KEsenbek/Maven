package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import models.HotelManagementSystem;

import java.util.*;

public class HotelManagementSystemSteps {
    @Given("a list of hotels with the following details:")
    public void a_list_of_hotels_with_the_following_details(List<HotelManagementSystem> hotelManagementSystemList) {
        List<String> var = new ArrayList<>();
        var.add(hotelManagementSystemList.get(0).getLocation());
        var.add(hotelManagementSystemList.get(1).getLocation());
        var.add(hotelManagementSystemList.get(2).getLocation());
        var.add(hotelManagementSystemList.get(3).getLocation());
        Collections.sort(var);
        System.out.println("All the cities sorted alphabetically: ");
        System.out.println(var);

        //hotelName		starRating
        //Grand Plaza Hotel		4
        //Beachfront Resort		5
        //City Center Inn		3
        //Mountain Lodge		4

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put(hotelManagementSystemList.get(0).getHotelName(),hotelManagementSystemList.get(0).getStartRating());
        stringIntegerMap.put(hotelManagementSystemList.get(1).getHotelName(),hotelManagementSystemList.get(1).getStartRating());
        stringIntegerMap.put(hotelManagementSystemList.get(2).getHotelName(),hotelManagementSystemList.get(2).getStartRating());
        stringIntegerMap.put(hotelManagementSystemList.get(3).getHotelName(),hotelManagementSystemList.get(3).getStartRating());
        System.out.println("Names of the hotel depending on the rating ascending");
        for (Map.Entry<String,Integer> entry:stringIntegerMap.entrySet()) {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }

        double sumAvg = 0.0;

        for (int i = 0; i<hotelManagementSystemList.size();i++) {
            sumAvg +=(hotelManagementSystemList.get(i).getAvgGuestRating());
        }
        sumAvg=sumAvg/hotelManagementSystemList.size();
        System.out.printf("Total average of all hotels offered: %.3f",sumAvg);

    }
    @When("the hotel management team needs to access and modify hotel details")
    public void the_hotel_management_team_needs_to_access_and_modify_hotel_details() {

    }
    @Then("the team should be able to manage information about each hotel, including its name, location, star rating, available room types, and average guest rating.")
    public void the_team_should_be_able_to_manage_information_about_each_hotel_including_its_name_location_star_rating_available_room_types_and_average_guest_rating() {

    }
}
