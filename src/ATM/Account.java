package ATM;

import java.util.*;

public class Account {
	Scanner input = new Scanner(System.in);
	
	private int CustomerNumber;
	private int  PinNumber;
	private double CheckingBalance = 0;
	private double SavingsBalance = 0;
	
	/* Set customer number */
	
	public int setCustomerNumber(int CustomerNumber) {
		this.CustomerNumber = CustomerNumber;
		return CustomerNumber;
	}
	
	/* Get customer number */
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	
	/* Set pin number */
	
	public int setPinNumber(int PinNumber) {
		this.PinNumber = PinNumber;
		return PinNumber;
	}
	
	/* Get pin number */
	
	public int getPinNumber() {
		return PinNumber;
	}
	
	/* Get checking account balance */
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}

	/* Get Savings account balance */
	
	public double getSavingsBalance() {
		return SavingsBalance;
	}
	
	/* Calculate checking account withdraw balance */
	
	public double calcCheckingWithdraw(double amount) {
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
	}
	
	/* Calculate savings account withdraw balance */ 
	
	public double calcSavingsWithdraw(double amount) {
		SavingsBalance = (SavingsBalance - amount);
		return SavingsBalance;
	}

	/* Calculate checking account deposit balance */
	
	public double calcCheckingDeposit(double amount) {
		CheckingBalance = (CheckingBalance + amount);
		return CheckingBalance;
	}
	
	/* Calculate savings account deposit balance */ 
	
	public double calcSavingsDeposit(double amount) {
		SavingsBalance = (SavingsBalance + amount);
		return SavingsBalance;
	}
	
	/* Money formatter to USD */
	
	public String format(double money) {
		return "$" + money;
	}
	
	/* Customer checking account withdraw input */
	
	public void getCheckingWithdrawInput() {
		System.out.println("\nChecking Account Balance: " + format(CheckingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if((CheckingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance: " + format(CheckingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer savings account withdraw input */
	
	public void getSavingsWithdrawInput() {
		System.out.println("\nSavings Account Balance: " + format(SavingsBalance));
		System.out.println("Amount you want to withdraw from savings account: ");
		double amount = input.nextDouble();
		
		if((SavingsBalance - amount) >= 0) {
			calcSavingsWithdraw(amount);
			System.out.println("New savings account balance: " + format(SavingsBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer checking account deposit input */
	
	public void getCheckingDepositInput() {
		System.out.println("\nChecking Account Balance: " + format(CheckingBalance));
		System.out.println("Amount you want to deposit in checking account: ");
		double amount = input.nextDouble();
		
		if((CheckingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance: " + format(CheckingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer savings account deposit input */
	
	public void getSavingsDepositInput() {
		System.out.println("\nSavings Account Balance: " + format(SavingsBalance));
		System.out.println("Amount you want to deposit in savings account: ");
		double amount = input.nextDouble();
		
		if((SavingsBalance + amount) >= 0) {
			calcSavingsDeposit(amount);
			System.out.println("New savings account balance: " + format(SavingsBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
}