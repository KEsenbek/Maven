package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsSteps {

    private double initialValue;
    private double anotherNumber;
    private double result;

    @Given("the initial value is {double}")
    public void setInitialValue(double value) {
        initialValue = value;
    }

    @Given("another number is {double}")
    public void setAnotherNumber(double value) {
        anotherNumber = value;
    }

    @When("the system adds the two numbers")
    public void addTwoNumbers() {
        result = initialValue + anotherNumber;
    }

    @When("the system subtracts the second number from the initial value")
    public void subtractSecondNumber() {
        result = initialValue - anotherNumber;
    }

    @When("the system multiplies the two numbers")
    public void multiplyTwoNumbers() {
        result = initialValue * anotherNumber;
    }

    @When("the system divides the initial value by the second number")
    public void divideInitialValue() {
        result = initialValue / anotherNumber;
    }

    @When("the system calculates the square root of the initial value")
    public void calculateSquareRoot() {
        result = sqrt(initialValue);
    }

    @When("the system calculates the square of the initial value")
    public void calculateSquare() {
        result = pow(initialValue, 2);
    }

    @When("the system calculates the cube of the initial value")
    public void calculateCube() {
        result = pow(initialValue, 3);
    }

    @When("the system calculates the initial value raised to the power of the second number")
    public void calculatePower() {
        result = pow(initialValue, anotherNumber);
    }

    @When("the system calculates the initial value raised to the power of 3")
    public void calculatePowerOf3() {
        result = pow(initialValue, 3);
    }

    @When("the system calculates the initial value raised to the power of the second number and rounds it to the nearest integer")
    public void calculatePowerAndRound() {
        result = round(pow(initialValue, anotherNumber));
    }

    @Then("the result should be {double}")
    public void verifyResult(double expected) {
        assertEquals(expected, result, 0.001);
    }
    @When("rounds it to the nearest integer")
    public void roundsToNearestInteger() {
        result = round(result);
    }

}