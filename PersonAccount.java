package com.company;

public class PersonAccount implements IAccount {

    private String snn;

    public PersonAccount(String name, String snn, String accNumber, double amount, double limit) {
        this.snn = snn;
    }

    @Override
    public void newLimit(){
        double currentLimit = getLimit();
        double newLimit = currentLimit * 4;
        setLimit(newLimit);
    }

    public PersonAccount(){
    }

    public String getSnn() {
        return snn;
    }
    public void setSnn(String snn) {
        this.snn = snn;
    }

    @Override
    public String printInfo() {
        return null;
    }

    @Override
    public Double getLimit() {
        return null;
    }

    @Override
    public void setLimit(Double limit) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getAccNumber() {
        return null;
    }

    @Override
    public void setAccNumber(String accNumber) {

    }

    @Override
    public Double getAmount() {
        return null;
    }

    @Override
    public void setAmount(Double amount) {

    }

    @Override
    public String toString() {
        return "Account owner: " + this.name + "Account number: " + this.accNumber +
                " Amount: " + this.amount + " Limit: " + this.limit + "/n";
    }
}
