package banking;

import java.util.Scanner;

public class App {
	Scanner scanner = new Scanner(System.in);
	Bank bank;


	public void userInterface() {
		int bankchoice=-1;
		
		System.out.println("Choose your Bank");
		bankchoice = scanner.nextInt();
		switch (bankchoice) {
		case 1:
			bank = new ICICI(scanner);
			break;
		case 2:
			bank = new HDFC(scanner);
			break;

		}
		
		while (bankchoice != 9) {

			System.out.println("choose the method\n 1.add amount\n2.withdraw amount");
			bankchoice = scanner.nextInt();
			switch (bankchoice) {
			case 1:
				bank.addAmount();
				break;
			case 2:
				bank.withdrawAmount();
				break;
			case 3:
				bank.showBalance();
	
				break;

			}

		}

	}

}
