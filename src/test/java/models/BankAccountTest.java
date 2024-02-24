package models;

import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount("1234", 1000.0);
        bankAccount.deposit(500.0);
        assertEquals(1500.0, bankAccount.getBalance(),"deposit functionality bug");
    }

    //withdraw functionality have a requirement
    //for withdraw should only be possible if the current balance is more or equal to the amount
    //requested

    @Test
    public void testWithdrawSufficientFunds(){
        BankAccount bankAccount = new BankAccount("1234", 1000.00);
        boolean actualResult = bankAccount.withdraw(500.0);

        assertTrue(actualResult, "withdraw");
        assertEquals(500.0, bankAccount.getBalance(),"withdraw balance mismatch");
    }

    @Test
    public void testWithdrawInsufficientFunds(){

        BankAccount bankAccount = new BankAccount("1234", 100.00);
        boolean actualResult = bankAccount.withdraw(200.00);

        assertFalse(actualResult);
        assertEquals(100.00, bankAccount.getBalance(), " Insufficient funds withdraw call altered the balance ");
    }
}
