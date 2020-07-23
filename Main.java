package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PersonAccount pAccount = new PersonAccount();
        EnterpriseAccount eAccount = new EnterpriseAccount();
        ArrayList<IAccount> listAccounts = new ArrayList<>();

        int option;

        do{
            System.out.println("What you want to do?");
            System.out.println("1- Register a new person account.");
            System.out.println("2- Register a new enterprise account.");
            System.out.println("3- Upgrade limit from all accounts.");
            System.out.println("4- List all accounts.");
            System.out.println("5- Exit.");

            option = input.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Person name: ");
                    listAccounts.add(pAccount);
                    pAccount.setName(input.next());
                    System.out.print("Person SNN: ");
                    listAccounts.add(pAccount);
                    pAccount.setSnn(input.next());
                    System.out.print("Account number: ");
                    listAccounts.add(pAccount);
                    pAccount.setAccNumber(input.next());
                    System.out.print("Amount in account: ");
                    listAccounts.add(pAccount);
                    pAccount.setAmount(input.nextDouble());
                    System.out.print("Account limit: ");
                    listAccounts.add(pAccount);
                    pAccount.setLimit(input.nextDouble());
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Enterprise name: ");
                    listAccounts.add(eAccount);
                    eAccount.setName(input.next());
                    System.out.print("Enterprise CNPJ: ");
                    listAccounts.add(eAccount);
                    eAccount.setCnpj(input.next());
                    System.out.print("Account number: ");
                    listAccounts.add(eAccount);
                    eAccount.setAccNumber(input.next());
                    System.out.print("Amount in account: ");
                    listAccounts.add(eAccount);
                    eAccount.setAmount(input.nextDouble());
                    System.out.print("Account limit: ");
                    listAccounts.add(eAccount);
                    eAccount.setLimit(input.nextDouble());
                    System.out.println("\n");
                    break;

                case 3:
                    IAccount acc;
                    for (int i=0; i<listAccounts.size();i++){
                        acc = listAccounts.get(i);
                        System.out.println(acc.getLimit());
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    for (int i=0; i<listAccounts.size();i++){
                        System.out.println(listAccounts.get(i));
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    break;
                }
            } while(option != 5);
    }
}