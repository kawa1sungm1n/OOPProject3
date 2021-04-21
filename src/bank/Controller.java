package bank;

import java.awt.event.*;

import javax.swing.*;

public class Controller {
	
	private BankMachine model;
	private View view;
	
	public Controller(BankMachine myModel, View myView) {
		model = myModel;
		view = myView;
		
		// construct the ActionListeners to be used by the view

		view.addMainCreateListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "create menu");
		});
		
		view.addMainSelectListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "select menu");
		});
		
		view.addMainDepositListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "deposit menu");
		});
		
		view.addMainWithdrawListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "withdraw menu");
		});
		
		view.addMainDeleteListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "delete menu");
		});
		
		view.addMainViewListener((ActionEvent e) -> {
			// this runs when the btnClear button is clicked on the view
			view.getCard().show(view.getPanel(), "view menu");
		});
		
	}
		
}
