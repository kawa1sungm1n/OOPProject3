package bank;

import java.awt.event.*;

import javax.swing.*;

public class Controller {
	
	private BankMachine model;
	private View view;
	
	public Controller(BankMachine myModel, View myView) {
		model = myModel;
		view = myView;
		view.getMainmenu().enableButtons(false);
		
		// construct the ActionListeners to be used by the view
		
		// Main menu
		view.addMainCreateListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "create menu");
		});
		
		view.addMainSelectListener((ActionEvent e) -> {
			view.getSelectmenu().populate(model.getAccounts());
			view.getCard().show(view.getPanel(), "select menu");
		});
		
		view.addMainDepositListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "deposit menu");
		});
		
		view.addMainWithdrawListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "withdraw menu");
		});
		
		view.addMainDeleteListener((ActionEvent e) -> {
			view.getDeletemenu().setCurrent(model.getCurrent().getDescription());
			view.getCard().show(view.getPanel(), "delete menu");
		});
		
		view.addMainViewListener((ActionEvent e) -> {
			view.getViewmenu().viewAccount(model.getCurrent());
			view.getCard().show(view.getPanel(), "view menu");
		});
		
		// Create
		view.addCreateCancelListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "main menu");
		});
		view.addCreateOkListener((ActionEvent e) -> {
			model.create(view.getCreateType(), view.getCreateDescription(), view.getCreateBalance());
			view.getCard().show(view.getPanel(), "main menu");
			view.getMainmenu().enableButtons(true);
		});
		
		// Select
		view.addSelectCancelListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		view.addSelectOkListener((ActionEvent e) -> {
			model.select(view.getSelectmenu().getSelected());
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		// Withdraw
		view.addWithdrawCancelListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		view.addWithdrawOkListener((ActionEvent e) -> {
			model.withdraw(view.getWithdrawmenu().getAmount(), view.getWithdrawmenu().getDesc());
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		// Deposit
		view.addDepositCancelListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		view.addDepositOkListener((ActionEvent e) -> {
			model.deposit(view.getDepositmenu().getAmount(), view.getDepositmenu().getDesc());;
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		// View
		view.addViewOkListener((ActionEvent e) -> {
			view.getViewmenu().clearView();
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		// Delete
		view.addDepositCancelListener((ActionEvent e) -> {
			view.getCard().show(view.getPanel(), "main menu");
		});
		
		view.addDeleteDeleteListener((ActionEvent e) -> {
			model.delete();
			view.getCard().show(view.getPanel(), "main menu");
			if(model.noAccounts()) view.getMainmenu().enableButtons(false);
		});
		
		// Quit
		view.addMainQuitListener((ActionEvent e) -> {System.exit(0);});
	}
		
}
