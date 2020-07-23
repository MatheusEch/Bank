package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account account = new Account();
        PersonAccount pAccount = new PersonAccount();
        EnterpriseAccount eAccount = new EnterpriseAccount();
        int option;

        do{
            System.out.println("What you want to do?");
            System.out.println("1- Register a new person account.");
            System.out.println("2- Register a new enterprise account.");
            System.out.println("3- List all accounts.");
            System.out.println("4- Exit.");

            option = input.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Person name: ");
                    pAccount.setName(input.nextLine());
                    System.out.print("Person SNN: ");
                    pAccount.setSnn(input.nextLine());
                    System.out.print("Account number: ");
                    pAccount.setAccNumber(input.nextLine());
                    System.out.print("Amount in account: ");
                    pAccount.setAmount(input.nextDouble());
                    System.out.println("Account limit: ");
                    pAccount.setLimit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enterprise name: ");
                    eAccount.setName(input.nextLine());
                    System.out.print("Enterprise CNPJ: ");
                    eAccount.setCnpj(input.nextLine());
                    System.out.print("Account number: ");
                    eAccount.setAccNumber(input.nextLine());
                    System.out.print("Amount in account: ");
                    eAccount.setAmount(input.nextDouble());
                    System.out.println("Account limit; ");
                    eAccount.setLimit(input.nextDouble());
                    break;

                case 3:
                    //print list
                    break;

                case 4:
                    break;
                }
            } while(option != 4);

        ArrayList<PersonAccount> pAccounts = new ArrayList<PersonAccount>();
//      Account acc;
//      for (int i=0; i<listAccount.size();i++){
//          acc = listAccount.get(i);
//          System.out.println(acc.getLimit() + " to ");
//          System.out.println(acc.getLimit());
//        }
    }
}