package bank;


public class AirMilesSavingsAccount extends Account {

	private int airmile;

	public AirMilesSavingsAccount(int accountId, String description, double balance) {
		super(accountId, description, "AirMile", balance, 0.75);	// 1 airmile을 어디다가 더해야하는지 모르겠습니다
		airmile = 10;
		
		
	}
	
	public void withdraw (double amount, String description) {
		super.withdraw(amount, description);
		airmile += amount / 30;
	}
}
