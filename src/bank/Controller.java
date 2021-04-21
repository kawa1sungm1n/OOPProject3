package bank;

import java.awt.event.*;

import javax.swing.*;

public class Controller {
	
	private BankMachine model;
	private JFrame view;
	
	public Controller(BankMachine myModel, JFrame myView) {
		model = myModel;
		view = myView;
		
		// construct the ActionListeners to be used by the view

		view.addClearListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			model.reset();
			view.reset();
		});
	}
}
