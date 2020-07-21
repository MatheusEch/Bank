package com.company;

public class Account{

    private String accNumber;
    private float amount;

    public String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Account(String accNumber, float amount) {
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account number: " + this.accNumber + " Amount: " + this.amount;
    }

}
