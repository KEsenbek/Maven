package models;

public class BankAccount {
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private String accountNumber;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }
}
