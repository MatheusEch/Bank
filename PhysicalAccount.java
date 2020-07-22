package com.company;

public class PhysicalAccount extends Account {

    double income;

    public PhysicalAccount(String accNumber, double amount, double limit, double income){
        super(accNumber, amount, limit);
        this.income = income;
    }

    @Override
    public void newLimit(){
        double currentLimit = getLimit();
        double newLimit = currentLimit * 4;
        setLimit(newLimit);
    }

    public PhysicalAccount(double income) {
        this.income = income;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
}
