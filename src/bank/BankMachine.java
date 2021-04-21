package bank;

import java.util.ArrayList;

public class BankMachine {
	
	private int id = 0;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Account current;
	
	
	public BankMachine() {}
	
	public boolean noAccounts() {
		return accounts.size() == 0;
	}
	
	public ArrayList<String> getAccounts() {
		ArrayList<String> ad = new ArrayList<String>();
		for (int i = 0; i < accounts.size(); i++) {
			ad.add(accounts.get(i).getDescription());
		}
		return ad;
	}

	public Account getCurrent() {
		return current;
	}

	public void select(String target) {
		for(int i = 0; i< accounts.size(); i++) {
			if(accounts.get(i).getDescription() == target)
				current = accounts.get(i);
		}
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
		if (accounts.size() == 1) current = accounts.get(0);
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

