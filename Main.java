package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What you want to do?/n");
        System.out.println("1- Register a new person account.");
        System.out.println("2- Register a new enterprise account.");
        System.out.println("3- List all accounts.");
        System.out.println("4- Exit.");

        Scanner input = new Scanner(System.in);
        boolean keep = true;
        Account account = new Account();
        PersonAccount pAccount = new PersonAccount();
        EnterpriseAccount eAccount = new EnterpriseAccount();
        String option = input.nextLine();

        do{
            if(option.equals("1")) {
                System.out.println("Person name: ");
                pAccount.setName(input.nextLine());
                System.out.println("Person SNN: ");
                pAccount.setSnn(input.nextLine());
                System.out.println("Account number: ");
                pAccount.setAccNumber(input.nextLine());
                System.out.println("Amount in account: ");
                pAccount.setAmount(input.nextDouble());
                System.out.println("Account limit: ");
                pAccount.setLimit(input.nextDouble());
                break;
            }
            if(option.equals("2")){
                System.out.println("Enterprise name: ");
                eAccount.setName(input.nextLine());
                System.out.println("Enterprise CNPJ: ");
                eAccount.setCnpj(input.nextLine());
                System.out.println("Account number: ");
                eAccount.setAccNumber(input.nextLine());
                System.out.println("Amount in account: ");
                eAccount.setAmount(input.nextDouble());
                System.out.println("Account limit; ");
                eAccount.setLimit(input.nextDouble());
                break;
            }
            if(option.equals("3")){
                //print list
            }
            if(option.equals("4")){
                keep = false;
                break;
            }
        } while(keep);

//        Account acc;
 //       for (int i=0; i<listAccount.size();i++){
 //           acc = listAccount.get(i);
//            System.out.println(acc.getLimit() + " to ");
//            System.out.println(acc.getLimit());
    }
}