package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.USTradingCompaniesAnalysis;

import java.util.ArrayList;
import java.util.List;

public class USTradingCompaniesAnalysisSteps {

    String company;
    List<USTradingCompaniesAnalysis> list1 = new ArrayList<>();



     @Given("there are {int} US trading companies in the market")
    public void there_are_us_trading_companies_in_the_market(Integer int1) {
        System.out.println("there are "+int1+ " US trading companies");
    }
    @Given("the company {string} is headquartered in {string}")
    public void the_company_is_headquartered_in(String company_name, String headquarters) {
                  System.out.println("company_name " + company_name);
                  company=company_name;
           System.out.println("headquarters "+headquarters);

    }
    @Given("the company manages assets worth ${int} billion")
    public void the_company_manages_assets_worth_$_billion(Integer company_assets) {
        System.out.println("company_assets " + company_assets);

    }
    @Given("the company holds shares in {int} top companies")
    public void the_company_holds_shares_in_top_companies(Integer top_shares) {

        System.out.println("top_shares " + top_shares);
    }
    @Given("there are {int} employees working at the company")
    public void there_are_employees_working_at_the_company(Integer company_employees) {
        System.out.println("company_employees " + company_employees);
    }
    @Given("the company is represented by {string}")
    public void the_company_is_represented_by(String representative_name) {
        System.out.println("representative_name "+ representative_name);
    }
    @Given("the company was established in {int}")
    public void the_company_was_established_in(Integer establishment_year) {
        System.out.println("establishment_year "+establishment_year);
    }
    @When("I analyze the assets, shares, employees, headquarters, representatives, and establishment year of {string}")
    public void i_analyze_the_assets_shares_employees_headquarters_representatives_and_establishment_year_of(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I should see the following data for {string}:")
    public void i_should_see_the_following_data_for(String company_name, List<USTradingCompaniesAnalysis> list) {


        for (USTradingCompaniesAnalysis obj:list) {
            obj.setCompanyName(company);
            System.out.println(obj.getCompanyName());
        }

        list1.addAll(list);

        System.out.println(company_name);
        System.out.println("Data"+" : "+"Value");
        System.out.println("Assets " +  " $" + "expected_assets>"+ " billion");
        System.out.println("Top Shares         | <expected_top_shares> companies ");
        System.out.println("Employees          | <expected_employees> employees");
        System.out.println("Headquarters       |<expected_headquarters>" );
        System.out.println("Representative    | <expected_representative>");
        System.out.println("Establishment Year | <expected_establishment_year>");

    }
    @Then("I calculate the total value of shares held by {string}")
    public void i_calculate_the_total_value_of_shares_held_by(String company_name) {
        System.out.println("company_name " +company_name);
    }
    @Then("I identify the highest-paid employee at {string}")
    public void i_identify_the_highest_paid_employee_at(String company_name) {
        System.out.println("company_name " + company_name);
    }
    @Then("I check the total assets managed by {string}")
    public void i_check_the_total_assets_managed_by(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I verify the number of top shares held by {string}")
    public void i_verify_the_number_of_top_shares_held_by(String company_name) {
        System.out.println("company_name " + company_name);
    }
    @Then("I determine the number of employees at {string}")
    public void i_determine_the_number_of_employees_at(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I look into the headquarters of {string}")
    public void i_look_into_the_headquarters_of(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I find the representative's name at {string}")
    public void i_find_the_representative_s_name_at(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I estimate the year of establishment of {string}")
    public void i_estimate_the_year_of_establishment_of(String company_name) {
        System.out.println("company_name "+company_name);
    }
    @Then("I should see the additional data for {string}:")
    public void i_should_see_the_additional_data_for(String company_name, List<USTradingCompaniesAnalysis> list) {
        System.out.println(company_name);
        for (USTradingCompaniesAnalysis obj:list){
            System.out.println(obj.getExpectedHeadquarters());
        }
    }
}
