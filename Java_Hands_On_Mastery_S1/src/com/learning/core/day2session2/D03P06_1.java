package com.learning.core.day2session2;

import java.util.Scanner;

// Custom exception for negative amount
class NegativeAmount extends Exception {
	NegativeAmount(String s) {
		super(s);
	}
}

// Custom exception for low balance
class LowBalanceException extends Exception {
	LowBalanceException(String s) {
		super(s);
	}
}

class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	// Constructor
	public BankAccount(int accNo, String custName, String accType, float initialBalance)
			throws LowBalanceException, NegativeAmount {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;

		// Checking if balance is negative
		if (initialBalance < 0) {
			throw new NegativeAmount("NegativeAmount");
		}

		// Checking if balance is less than required minimum balance
		if ((accType.equalsIgnoreCase("Saving") && initialBalance < 1000)
				|| (accType.equalsIgnoreCase("Current") && initialBalance < 5000)) {
			throw new LowBalanceException("Low Balance");
		}

		this.balance = initialBalance;
	}

	// Method to deposit amount
	public void deposit(float amt) throws NegativeAmount {
		if (amt < 0) {
			throw new NegativeAmount("NegativeAmount");
		}
		balance += amt;
		System.out.println("Amount deposited successfully.");
	}

	// Method to get current balance
	public float getBalance() throws LowBalanceException {
		if ((accType.equalsIgnoreCase("Saving") && balance < 1000)
				|| (accType.equalsIgnoreCase("Current") && balance < 5000)) {
			throw new LowBalanceException("Low Balance");
		}
		return balance;
	}
}

public class D03P06_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input accNo, custName, accType, initial balance
		System.out.print("Enter account number, customer name, account type, and initial balance: ");
		int accNo = scanner.nextInt();
		String custName = scanner.next();
		String accType = scanner.next();
		float initialBalance = scanner.nextFloat();

		try {
			BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
			System.out.println("Initial balance: " + account.getBalance());

			// Deposit amount
			System.out.print("Enter amount to deposit: ");
			float amt = scanner.nextFloat();
			account.deposit(amt);
			System.out.println("New balance: " + account.getBalance());
		} catch (LowBalanceException | NegativeAmount e) {
			System.out.println("Output: " + e.getMessage());
		}
	}
}
