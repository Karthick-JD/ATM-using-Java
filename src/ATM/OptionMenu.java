package ATM;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class OptionMenu extends Account {

	Scanner menuInput = new Scanner(System.in);
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	/* User validation with login credentials */

	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				data.put(1357924680, 1234); // User 1
				data.put(1357924681, 4321); // User 2

				System.out.println("WELCOME TO ATM PROJECT!");

				System.out.println("\nEnter your customer number:");
				setCustomerNumber(menuInput.nextInt());

				System.out.println("\nEnter your pin number:");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\nInvalid characters. Use only numbers.");
				x = 2;
			}
			
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\nWrong Customer number or Pin number.");
		} while (x == 1);
	}

	int selection;

	/* Account Type Menu */

	public void getAccountType() {
		System.out.println("\nSelect the account you want to access:");
		System.out.println("Type 1: Checking  account.");
		System.out.println("Type 2: Saving account.");
		System.out.println("Type 3: Exit.");
		System.out.println("\nEnter you choice: ");
		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSavings();
			break;
		case 3:
			System.out.println("\nThank you for using the ATM, Bye!");
			break;
		default:
			System.out.println("\n" + "Invalid Choice" + "\n");
			getAccountType();
		}
	}

	/* Checking Account Menu */

	public void getChecking() {
		System.out.println("\nChecking Account:");
		System.out.println("Type 1: View Balance.");
		System.out.println("Type 2: Withdraw money.");
		System.out.println("Type 3: Deposit money.");
		System.out.println("Type 4: Exit.");
		System.out.println("\nEnter your choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("\nChecking Account Balace: " + format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("\nThank you for using the ATM. Bye!");
			break;
		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getChecking();
		}
	}

	/* Savings Account Menu */

	public void getSavings() {
		System.out.println("\nSavings Account:");
		System.out.println("Type 1: View Balance.");
		System.out.println("Type 2: Withdraw money.");
		System.out.println("Type 3: Deposit money.");
		System.out.println("Type 4: Exit.");
		System.out.println("\nEnter your choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("\nSavings Account Balace: " + format(getSavingsBalance()));
			getAccountType();
			break;
		case 2:
			getSavingsWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingsDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("\nThank you for using the ATM. Bye!");
			break;
		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getSavings();
		}
	}
}
