package bank;

import java.util.*;

public class Account {
	
	private int accountId;
	private double balance;
	private String description;
	private String type;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();	
	private double fee;
	
	public Account(int accountId, String description, String type, double balance, double fee) {
		this.accountId = accountId;
		this.description = description;
		this.type = type;
		this.balance = balance;
		this.fee = fee;
	}
	
	public String getDescription() {
		return description;
	}

	public void withdraw (double amount, String description) {
		balance -= amount + fee;
		transactions.add(new Transaction(description, amount));
	}
	
	public void deposit (double amount, String description) {
		balance += amount + fee;
		transactions.add(new Transaction(description, amount));
	}
	
	public String toString() {
		String result = "";
		if (type == "Savings") {
			result += "Savings Account";
		} else {
			result += "AirMiles Savings Account";
		}
		result += "\nAccount Description: " + description + "\n";
		result += "Account type: " + type + "\n";
		result += "Current balance: $" + balance + "\n";
		for (int i = 0; i < transactions.size(); i++) {
			result += transactions.get(i).toString() + "\n";
		}
		return result;
	}	
}
