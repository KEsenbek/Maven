package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectSteps {

    String name;
    Integer points;

    String grade;

    public ProjectSteps() {
        this.name = "";
        this.points = 0;
        this.grade = "";
    }

    @Given("the student name is {string}")
    public void the_student_name_is(String name) {
        System.out.println("Student name: "+name);
    }
    @Given("the project mark for {string} is {int}")
    public void the_project_mark_for_is(String name, Integer points) {
        this.name=name;
      if (points>=90 && points<=100){
          grade="A";
      }else if (points>=70 && points<=89){
          grade="B";
      }
      else if (points>=50 && points<=69){
          grade="C";
      }
      else if (points>=30 && points<=49){
          grade="D";
      }
      else {
          grade="F";
      }
    }
    @When("the system calculates the letter grade for {string} project mark")
    public void the_system_calculates_the_letter_grade_for_project_mark(String name) {
        this.name=name;
    }
    @Then("the system should display {string} grade as {string}")
    public void the_system_should_display_grade_as(String name, String grade) {
        this.name=name;
        this.grade=grade;
        System.out.println("Grade as "+grade);
    }
}
