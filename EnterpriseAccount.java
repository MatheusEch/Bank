package com.company;

public class EnterpriseAccount implements IAccount {

    private String cnpj;
    private Double limit;
    private String name;
    private String accNumber;
    private Double amount;

    @Override
    public void newLimit(){
        double currentLimit = getLimit();
        double newLimit = currentLimit * 2;
        setLimit(newLimit);
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String printInfo() {
        return "Account owner: " + this.name + " Account number: " + this.accNumber +
                " Amount: " + this.amount + " Limit: " + this.limit;
    }

    @Override
    public Double getLimit() {
        return this.limit;
    }

    @Override
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAccNumber() {
        return this.accNumber;
    }

    @Override
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}