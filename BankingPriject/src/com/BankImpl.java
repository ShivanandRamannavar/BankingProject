package com;

public class BankImpl implements Bank{
	int balance;

	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void display(int amount) {
		System.out.println("Deposititng Rs. "+amount);
		balance=balance+amount; //balance+=amount;
		System.out.println("Amount Deposited Succesfully !!");
	}

	@Override
	public void withdraw(int amount) {
		if(amount <=balance) {
			System.out.println("Withdarwing Rs. "+amount);
			balance-=amount; //balance=balance-amount;
			System.out.println("Amount Withdrawn Succesfully !!");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}


	@Override
	public int getBalance() {
		return balance;
	}

}
