package bank;

import java.util.ArrayList;

public class BankMachine {
	
	private int id = 0;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Account current;
	
	
	public BankMachine() {}
	
	public void select(Account target) {
		current = target;
	}
	
	public void deposit(double amount, String description) {
		current.deposit(amount, description);
	}
	
	public void withdraw(double amount, String description) {
		current.withdraw(amount, description);
	}
	
	public void create(String type, String description, double balance) {
		if (type == "Savings") {
			accounts.add(new SavingsAccount(id, description, balance));
		} else {
			accounts.add(new AirMilesSavingsAccount(id, description, balance));
		}
		id++; // 추가시 아이디 올라감ㅁ
	}
	
	public void delete() {
		accounts.remove(current);
		current = null;
	}
	
	public String view() {
		return current.toString();
	}
	
	public void quit() {
		
	}
}

