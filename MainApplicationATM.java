package com.dipika.atm.presentation;
import java.util.Scanner;

public class MainApplicationATM 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount("1234567891234567", "Dipika Ghuge",500);
        ATMInterface atm = new ATM(account);
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
        	System.out.println("_______________________________________________");
	    	System.out.println();
            System.out.println("\t Welcome To HDFC Bank ATM ");
        	System.out.println("_______________________________________________");
            System.out.println("\t 1. Check Balance");
            System.out.println("\t 2. Deposit");
            System.out.println("\t 3. Withdraw");
            System.out.println("\t 4. Exit");
            System.out.println("_______________________________________________");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    atm.exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
 