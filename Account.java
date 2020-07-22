package com.company;

public class Account{

    private String accNumber;
    private double amount;
    private double limit;

    public Account(String accNumber, double amount, double limit) {
        this.accNumber = accNumber;
        this.amount = amount;
        this.limit = limit;
    }

    public Account() {
    }

    public void newLimit(){

    }

    @Override
    public String toString() {
        return "Account number: " + this.accNumber + " Amount: " + this.amount + " Limit: " + this.limit;
    }

    public String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }

}
