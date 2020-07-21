package com.company;

import java.util.Arrays;

public class People extends Account{

    private String name;
    private String cpf;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public People(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public People(String name, String cpf, String accNumber){
        this.name = name;
        this.cpf = cpf;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " CPF: " + this.cpf;
    }
}
