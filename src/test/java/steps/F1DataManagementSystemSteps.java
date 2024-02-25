package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.F1DataManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class F1DataManagementSystemSteps {

    List<F1DataManagementSystem> list = new ArrayList<>();

    @Given("there are {int} F1 teams in the championship")
    public void there_are_f1_teams_in_the_championship(Integer total_teams) {
        System.out.println(total_teams);

    }
    @Given("the {string} team {string} is an F1 team")
    public void the_team_is_an_f1_team(String team_type, String team_name) {
        System.out.println(team_type + " " + team_name);
    }
    @When("I check the main representatives of the {string} {string}")
    public void i_check_the_main_representatives_of_the(String team_name, String team_role) {
        System.out.println(team_name + " "+ team_role);
    }
    @Then("I should see their {string} is {string}")
    public void i_should_see_their_is(String representative_title, String representative_name) {
        System.out.println(representative_title+ " "+ representative_name);
    }
    @Then("I compare the {string} and {string} teams")
    public void i_compare_the_and_teams(String team1_name, String team2_name) {
        System.out.println(team1_name + " "+ team2_name);
    }
    @Then("I should see the comparison results")
    public void i_should_see_the_comparison_results() {
       // System.out.println(list);
    }
    @Then("I explore the specifications of {string}'s F1 car")
    public void i_explore_the_specifications_of_s_f1_car(String team_name) {
        System.out.println(team_name+"\n");
    }
    @Then("I should see details about its engine, chassis, and performance")
    public void i_should_see_details_about_its_engine_chassis_and_performance() {
        //System.out.println(list);
    }
}
