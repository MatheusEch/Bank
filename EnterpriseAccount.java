package com.company;

public class EnterpriseAccount implements IAccount {

    private String cnpj;
    private Double limit;
    private String name;
    private String accNumber;
    private Double amount;

    public EnterpriseAccount(String name, String cnpj, String accNumber, double amount, double limit) {
        this.cnpj = cnpj;
    }

    @Override
    public void newLimit(){
        double currentLimit = getLimit();
        double newLimit = currentLimit * 2;
        setLimit(newLimit);
    }

    public EnterpriseAccount(){
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "Account owner: " + this.name + " Account number: " + this.accNumber +
                " Amount: " + this.amount + " Limit: " + this.limit;
    }
}