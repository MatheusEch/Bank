package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String cpf;
        String accNumber;
        double amount;
        double limit;

        Scanner scanner = new Scanner(System.in);
        People people;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your cpf: ");
        cpf = scanner.nextLine();

        People ownerInfo1 = new People(name, cpf);
        People ownerInfo2 = new People(name, cpf);
        People ownerInfo3 = new People(name, cpf);

        ArrayList<People> listPeople = new ArrayList<>();
        listPeople.add(ownerInfo1);
        listPeople.add(ownerInfo2);
        listPeople.add(ownerInfo3);

        listPeople.forEach(System.out::println);

        System.out.println("Enter your account number: ");
        accNumber = scanner.nextLine();
        System.out.println("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        System.out.println("Enter limit to account: ");
        limit = scanner.nextDouble();

        Account accountInfo1 = new Account(accNumber, amount, limit);
        Account accountInfo2 = new Account(accNumber, amount, limit);
        Account accountInfo3 = new Account(accNumber, amount, limit);

        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(accountInfo1);
        listAccount.add(accountInfo2);
        listAccount.add(accountInfo3);

        listAccount.forEach(System.out::println);

        Account acc;
        for (int i=0; i<listAccount.size();i++){
            acc = listAccount.get(i);
            System.out.println(acc.getLimit() + " to ");
            acc.newLimit();
            System.out.println(acc.getLimit());
        }
    }
}
