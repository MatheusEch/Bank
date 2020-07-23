package com.company;

public class PersonAccount extends Account {

    private String snn;

    public PersonAccount(String name, String snn, String accNumber, double amount, double limit) {
        super(name, accNumber, amount, limit);
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
}
