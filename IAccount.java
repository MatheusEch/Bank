package com.company;

public interface IAccount {

    String name = null;
    String accNumber = null;
    double amount = 0;
    double limit = 0;

    void newLimit();

    public String printInfo();

    public Double getLimit();
    public void setLimit(Double limit);

    public String getName();
    public void setName(String name);

    public String getAccNumber();
    public void setAccNumber(String accNumber);

    public Double getAmount();
    public void setAmount(Double amount);

}