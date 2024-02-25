package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Shoes;

import java.util.List;

public class ShoesSteps {


    @Given("there is a shoe order with following details:")
    public void there_is_a_shoe_order_with_following_details(List<Shoes> shoesList) {
        for (Shoes shoes : shoesList) {
            System.out.println(shoes.getOrderId() + ": " + shoes.getCustomerName()+ ": " +shoes.getShippingBillingAddress()+ ": " +shoes.getShoeModel()+ ": " +shoes.getQuantity()+ ": " +shoes.getSubtotal());
        }
    }
    @When("the user processes the shoe order, generating an invoice for following order:")
    public void the_user_processes_the_shoe_order_generating_an_invoice_for_following_order(List<Shoes> shoesList) {
        for (Shoes shoes : shoesList) {
            System.out.println(shoes.getOrderId() + ": "
                    + shoes.getCustomerName()+ ": "
                    + shoes.getShippingBillingAddress()+ ": "
                    +shoes.getShoeModel()+ ": "
                    +shoes.getQuantity()+ ": "
                    +shoes.getUnitPrice()+ ": "
                    +shoes.getSubtotal()+ ": "
                    +shoes.getTaxRate()+ ": "
                    +shoes.getTaxAmount()+ ": "
                    +shoes.getTotalAmount());
        }
    }
    @Then("the user should see the invoice generated for following order:")
    public void the_user_should_see_the_invoice_generated_for_following_order(List<Shoes> shoesList) {
        for (Shoes shoes : shoesList) {
            System.out.println(shoes.getOrderId() + ": "
                    + shoes.getCustomerName()+ ": "
                    + shoes.getShippingBillingAddress()+ ": "
                    +shoes.getShoeModel()+ ": "
                    +shoes.getQuantity()+ ": "
                    +shoes.getUnitPrice()+ ": "
                    +shoes.getSubtotal()+ ": "
                    +shoes.getTaxRate()+ ": "
                    +shoes.getTaxAmount()+ ": "
                    +shoes.getTotalAmount());
        }
    }

}
