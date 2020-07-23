package com.company;

public class Account{

    private String name;
    private String accNumber;
    private double amount;
    private double limit;

    public Account(String name, String accNumber, double amount, double limit) {
        this.name = name;
        this.accNumber = accNumber;
        this.amount = amount;
        this.limit = limit;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account owner: " + this.name + "Account number: " + this.accNumber +
                " Amount: " + this.amount + " Limit: " + this.limit + "/n";
    }

    public void newLimit(){

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}