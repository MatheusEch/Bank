package com.company;

public class EnterpriseAccount extends Account{

    private String cnpj;

    public EnterpriseAccount(String name, String cnpj, String accNumber, double amount, double limit) {
        super(name, accNumber, amount, limit);
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
}
