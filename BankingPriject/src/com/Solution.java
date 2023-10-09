package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Bank bank=new BankImpl(5000);
		while(true) {
			System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Check Balance\n4.Exit");
			System.out.println("Enter Your Choice");
			int choice=scan.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter The Amount to be deposited: ");
				int amountToDeposit=scan.nextInt();
				bank.display(amountToDeposit); //bank.deposit(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter The Amount to be Withdrawn: ");
				int amountToWithdraw=scan.nextInt();
				bank.withdraw(amountToWithdraw); //bank.withdraw(scan.nextInt());
				break;
				
			case 3:
				System.out.println("Available Balance : "+bank.getBalance());
				break;
			case 4:
				System.out.println("Thank You Visit again");
				System.exit(0);
				default:
					try {
					System.out.println("Invalid Choice");	
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
			}
			System.out.println("========================");
		}


	}
}
