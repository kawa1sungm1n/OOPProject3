package bank;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		BankMachine model = new BankMachine();
		JFrame view = new MainMenu(model);
		Controller controller = new Controller(model, view);
		
		view.setVisible(true);
	}

}
