package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        People ownerInfo1 = new People("Matheus", "000123485");
        Account accountInfo1 = new Account("250", 5000);

        People ownerInfo2 = new People("Alexandre", "224892154");
        Account accountInfo2 = new Account("140", 250000);

        People ownerInfo3 = new People("Barbara", "983467885");
        Account accountInfo3 = new Account("854", 45000);

        ArrayList<People> listPeople = new ArrayList<>();
        listPeople.add(ownerInfo1);
        listPeople.add(ownerInfo2);
        listPeople.add(ownerInfo3);

        //listPeople.forEach(System.out::println);

        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(ownerInfo1);
        listAccount.add(accountInfo1);
        listAccount.add(ownerInfo2);
        listAccount.add(accountInfo2);
        listAccount.add(ownerInfo3);
        listAccount.add(accountInfo3);

        listAccount.forEach(System.out::println);
    }
}
