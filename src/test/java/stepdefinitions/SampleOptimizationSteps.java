package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.SampleOptimization;

import java.util.ArrayList;
import java.util.List;

public class SampleOptimizationSteps {
    List<SampleOptimization> list = new ArrayList<>();

    @Given("there is an online order with the following details:")
    public void there_is_an_online_order_with_the_following_details(List<SampleOptimization> sampleOptimizations) {
        list.addAll(sampleOptimizations);
        System.out.print("Given online order :");
        for (SampleOptimization obj:list){
            System.out.println(obj.getOrderId() + " : "+ obj.getCustomerName()+ " : "+obj.getShippingAddress()+ " : "+obj.getProductName()+ " : "+obj.getQuantity()+ " : "+obj.getSubtotal());

        }
    }
    @When("the user processes the online order, generating an invoice for following order:")
    public void the_user_processes_the_online_order_generating_an_invoice_for_following_order(List<SampleOptimization> sampleOptimizations) {
        System.out.print("Generating an invoice for online order: ");
        for (SampleOptimization obj:list){
            System.out.println(obj.getOrderId() + " : "+ obj.getCustomerName()+ " : "+obj.getShippingAddress()+ " : "+obj.getProductName()+ " : "+obj.getQuantity()+ " : "+obj.getUnitPrice()+ " : "+obj.getSubtotal()+ " : "+obj.getTaxRate()+ " : "+obj.getTaxAmount()+ " : "+obj.getTotalAmount());

        }
    }
    @Then("the user should see the invoice generated for the following order:")
    public void the_user_should_see_the_invoice_generated_for_the_following_order(List<SampleOptimization> sampleOptimizations) {
        System.out.print("User should see the invoice : ");
        for (SampleOptimization obj:list){
            System.out.println(obj.getOrderId() + " : "+ obj.getCustomerName()+ " : "+obj.getShippingAddress()+ " : "+obj.getProductName()+ " : "+obj.getQuantity()+ " : "+obj.getUnitPrice()+ " : "+obj.getSubtotal()+ " : "+obj.getTaxRate()+ " : "+obj.getTaxAmount()+ " : "+obj.getTotalAmount());

        }
    }

}
