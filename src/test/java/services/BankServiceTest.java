package services;

import models.BankAccount;
import models.Customer;
import models.Transaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class BankServiceTest {
    static BankService bankService;
    BankAccount bankAccount1;
    Customer customer1;

    @BeforeAll
    public static void beforeAll(){
        bankService = new BankService();

    }
    @BeforeEach
    public void setUpEachTest(){
         bankAccount1 = new BankAccount("12345", 1000.0);
         customer1 = new Customer("Elon Musk", "x1",bankAccount1);

    }
    @AfterEach
    public void cleanUp(){
        bankService.clearCache();
    }

    @Test
    public void addNewCustomerTest() {

//this is action test
        bankService.addCustomer(customer1);
        List<Customer> expectedListOfCustomers = new ArrayList<>();
        expectedListOfCustomers.add(customer1);

        assertEquals(expectedListOfCustomers, bankService.getCustomerList(),"Two customer list are not equal");
    }

    @Test
    public void findingCustomerTest(){
        //this is action test
        bankService.addCustomer(customer1);

       Customer actualResult = bankService.findCustomer("x1");

       assertEquals("Elon Musk", actualResult.getName(), "Names are not equals");
       assertEquals("Elon Musk", actualResult.getName(), "Customers name is not equal");

    }

    @Test
    public void findingCustomerThatDoesntExist(){

        //this is action test
        bankService.addCustomer(customer1);
        //this is action test
        Customer actualResultObj = bankService.findCustomer("beta123");

        assertNull(actualResultObj,"finding a customer that doesnt exist should return null");
    }

    @Test
    public void performTransactionWithNullCustomer(){
//this is action test
        bankService.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN001", "Deposit", 500.0,"12345","y1");

        try {
            assertThrows(Exception.class,() ->bankService.performTransaction(transaction));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
           assertThrows(Exception.class, () -> bankService.performTransaction(transaction));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testPerformDepositTransaction(){
//this is action test
        bankService.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN001", "Deposit", 500.0,"12345","x1");

        try {
            bankService.performTransaction(transaction);

            assertEquals(1500,bankAccount1.getBalance(),"Deposit is not completed");
        }catch (Exception e){
            fail("Perform transaction with a valid transaction failed");
        }
    }

    @Test
    public void performWithdrawWithSufficientFunds(){

        //this is action test
        bankService.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN001", "Withdraw", 300.0,"12345","x1");

        try {
            bankService.performTransaction(transaction);
            assertEquals(700, bankAccount1.getBalance(),"withdraw balance mismatch");
        }catch (Exception e){
            fail("withdraw with sufficient funds in not completed "+e.getMessage());
        }

    }

    @Test
    public void testPerformWithdrawWithInsufficientFunds(){

        //this is action test
        bankService.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN001", "Withdraw", 1500.0,"12345","x1");

        try {
            bankService.performTransaction(transaction);
            assertEquals(1000.0, bankAccount1.getBalance());
        }catch (Exception e){
            fail("withdraw with insufficient funds error "+ e.getMessage());
        }
    }
}
