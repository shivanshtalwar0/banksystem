package banking;

import java.util.Scanner;

public abstract class Bank {
	private double addRate;
	private double withdrawRate;
	private double balance;
	private int addCounter = 0;
	private int withdrawCounter = 0;
	private int minimumBalance;
	public Scanner scanner;

	
	public void addAmount() {
			}
	public void showBalance() {
		System.out.println("balance is "+balance);
		
	}

	public void withdrawAmount() {
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public void setAddCounter(int addCounter) {
		this.addCounter = addCounter;
	}

	public void setWithdrawCounter(int withdrawCounter) {
		this.withdrawCounter = withdrawCounter;
	}

		public double getAddRate() {
		return addRate;
	}

	public void setAddRate(double addRate) {
		this.addRate = addRate;
	}

	public double getWithdrawRate() {
		return withdrawRate;
	}

	public void setWithdrawRate(double withdrawRate) {
		this.withdrawRate = withdrawRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAddCounter() {
		return addCounter;
	}

	public int getWithdrawCounter() {
		return withdrawCounter;
	}

}
