package banking;

import java.util.Scanner;

public class ICICI extends Bank {

	ICICI(Scanner scanner) {
		setScanner(scanner);
		setAddRate(0.023);
		setWithdrawRate(0.015);
		setMinimumBalance(3000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addAmount() {
//		// TODO Auto-generated method stub
		super.addAmount();
		setAddCounter(getAddCounter() + 1);
		if (getAddCounter() > 3) {
			System.out.println("Add amount:");
			double amount = scanner.nextDouble();
			double interestamount = getBalance() * getAddRate();
			setBalance(amount + getBalance() + interestamount);
		} else {
			System.out.println("Add amount:");
			double amount = scanner.nextDouble();
			setBalance(amount + getBalance());

		}

	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		super.withdrawAmount();
		setWithdrawCounter(getWithdrawCounter() + 1);
		if (getMinimumBalance() <= getBalance()) {

			if (getWithdrawCounter() > 3) {
				System.out.println("withdraw amount:");
				double amount = scanner.nextDouble();
				double interestamount = getBalance() * getWithdrawRate();
				setBalance(amount + getBalance() - interestamount);
			} else {
				System.out.println("Add amount:");
				double amount = scanner.nextDouble();
				setBalance(getBalance() - amount);

			}
		} else {
			System.out.println("balance should be atleast " + getMinimumBalance());
		}

	}

}
