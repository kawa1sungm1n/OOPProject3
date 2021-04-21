package bank;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		BankMachine model = new BankMachine();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		view.setVisible(true);
	}

}
