package bank;

import java.text.*;
import java.util.*;

public class Transaction {
	
	private String description;
	private Calendar date;
	private double amount;
	
	public Transaction (String description, double amount) {
		this.description = description;
		date = Calendar.getInstance();
		this.amount = amount;
	}
	
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("E MMM dd HH:mm:ss zz yyyy:");	
		return df.format(new Date()).replaceAll(".", "") + "$" + amount + "["+description+"]";
	}
}
