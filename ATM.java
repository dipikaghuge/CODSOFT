package com.dipika.atm.presentation;

import java.util.Scanner;

public class ATM implements ATMInterface 
{
	private BankAccount bankAccount;
    Scanner scanner = new Scanner(System.in);

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    public void checkBalance() {
    	System.out.println("------------------------------------------------");

    	System.out.println("Account Holder  Account Number  Current Balance");
    	System.out.println("------------------------------------------------");

    	System.out.println(bankAccount.getAccountHolderName()+"\t"+bankAccount.getAccountNumber()+"\t"+bankAccount.getBalance());
    }

    public void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            bankAccount.deposit(amount);
        	System.out.println("----------------------------------------------------------------");

        	System.out.println("Account Holder  Account Number    Current Balance  DepositedAmount");
        	System.out.println("-----------------------------------------------------------------");
        	System.out.println(bankAccount.getAccountHolderName()+"\t"+bankAccount.getAccountNumber()+"\t"+bankAccount.getBalance()+"\t\t"+amount);


        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (bankAccount.withdraw(amount)) {
            } else {
                System.out.println("Insufficient balance.");
            }
        	System.out.println("----------------------------------------------------------------");

        	System.out.println("Account Holder  Account Number    Current Balance  Withdrawnamount");
        	System.out.println("-----------------------------------------------------------------");
        	System.out.println(bankAccount.getAccountHolderName()+"\t"+bankAccount.getAccountNumber()+"\t"+bankAccount.getBalance()+"\t\t"+amount);

        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void exit() {
    	System.out.println("_______________________________________________");
    	System.out.println("");
    	System.out.println("Application Terminated.!!!");
    	System.out.println("_______________________________________________");
            System.exit(0);
    }

}
