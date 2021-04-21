package bank;

import java.text.*;
import java.util.*;

public class Transaction {
	
	private String description;
	private Date date;
	private double amount;
	
	public Transaction (String description, double amount) {
		this.description = description;
		date = new Date();
		this.amount = amount;
	}
//	.replaceAll(".", "")
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("E MMM dd HH:mm:ss zz yyyy:");	
		return df.format(date) + " $" + amount + "["+description+"]";
	}
}
