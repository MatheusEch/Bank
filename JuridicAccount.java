package com.company;

public class JuridicAccount extends Account{

    double revenue;

    public JuridicAccount(String accNumber, double amount, double limit, double revenue) {
        super(accNumber, amount, limit);
        this.revenue = revenue;
    }

    @Override
    public void newLimit(){
        double currentLimit = getLimit();
        double newLimit = currentLimit * 2;
        setLimit(newLimit);
    }

    public JuridicAccount(double revenue) {
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
