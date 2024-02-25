package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.EmployeeInformationManagementWithDatatables;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInformationManagementWithDatatablesSteps {

    List<EmployeeInformationManagementWithDatatables> list=new ArrayList<>();


    @Given("a list of employee details with the following information:")
    public void a_list_of_employee_details_with_the_following_information(List<EmployeeInformationManagementWithDatatables> listEmployees) {
        list.addAll(listEmployees);
        for (EmployeeInformationManagementWithDatatables var:listEmployees) {
            System.out.println(var.getEmployeeID()+": "+ var.getFirstName()+": "+var.getLastName()+": "+var.getDepartment()+": "+var.getPosition()+": "+var.getSalary());
        }
    }
    @When("the user adds a new employee with the following details:")
    public void the_user_adds_a_new_employee_with_the_following_details(List<EmployeeInformationManagementWithDatatables> listEmployees) {
        System.out.println("-------------------------------------------");

        for (EmployeeInformationManagementWithDatatables var:listEmployees) {
            System.out.println(var.getEmployeeID()+": "+ var.getFirstName()+": "+var.getLastName()+": "+var.getDepartment()+": "+var.getPosition()+": "+var.getSalary());
            list.add(var);
        }

    }
    @When("the user updates the salary of an existing employee with Employee ID {int} to ${double}.")
    public void the_user_updates_the_salary_of_an_existing_employee_with_employee_id_to_$(Integer employeeID, Double salary) {
        for (EmployeeInformationManagementWithDatatables var: list) {
            if (var.getEmployeeID()==employeeID){
                var.setSalary(salary);
            }
        }

//
//        employeeID=101;
//        salary=5000.0;
//        System.out.println(list.get(101).getEmployeeID());
    }
    @When("the user removes the employee with Employee ID {int} from the records.")
    public void the_user_removes_the_employee_with_employee_id_from_the_records(Integer employeeID) {
        for (EmployeeInformationManagementWithDatatables var: list){
            if (var.getEmployeeID() == employeeID){
                list.remove(var.getEmployeeID()==employeeID);
            }
        }
    }
    @Then("the user should be able to view and confirm the updated employee details:")
    public void the_user_should_be_able_to_view_and_confirm_the_updated_employee_details(List<EmployeeInformationManagementWithDatatables> listEmployees) {
        System.out.println("-------------------------------------------");

        for (EmployeeInformationManagementWithDatatables var:listEmployees) {
            System.out.println(var.getEmployeeID()+": "+ var.getFirstName()+": "+var.getLastName()+": "+var.getDepartment()+": "+var.getPosition()+": "+var.getSalary());

        }
    }
}
