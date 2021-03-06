package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.CardLayout;

public class View extends JFrame {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	private MainMenu mainmenu = new MainMenu();
	private ViewMenu viewmenu = new ViewMenu();
	private SelectMenu selectmenu = new SelectMenu();
	private WithdrawMenu withdrawmenu = new WithdrawMenu();
	private CreateMenu createmenu = new CreateMenu();
	private DepositMenu depositmenu = new DepositMenu();
	private DeleteMenu deletemenu = new DeleteMenu();
	private CardLayout card = new CardLayout(0, 0);	
	private BankMachine bm;
	private JPanel panel = new JPanel();
	

	public View(BankMachine bm) {
		this.bm = bm;
	    
	    this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		panel.setBounds(12, 45, 710, 356);
		getContentPane().add(panel);
		panel.setLayout(card);
		
		panel.add(mainmenu, "main menu");
		panel.add(createmenu, "create menu");
		panel.add(selectmenu, "select menu");
		panel.add(withdrawmenu, "withdraw menu");
		panel.add(depositmenu, "deposit menu");
		panel.add(deletemenu, "delete menu");
		panel.add(viewmenu, "view menu");
		
	}

	public SelectMenu getSelectmenu() {
		return selectmenu;
	}

	public MainMenu getMainmenu() {
		return mainmenu;
	}

	public WithdrawMenu getWithdrawmenu() {
		return withdrawmenu;
	}

	public DepositMenu getDepositmenu() {
		return depositmenu;
	}

	public DeleteMenu getDeletemenu() {
		return deletemenu;
	}

	public JPanel getPanel() {
		return panel;
	}
	public CardLayout getCard() {
		return card;
	}
	
	public void addMainQuitListener(ActionListener a) {
		mainmenu.addQuitListener(a);
	}
	public void addMainCreateListener(ActionListener a) {
		mainmenu.addCreateListener(a);
	}
	public void addMainDepositListener(ActionListener a) {
		mainmenu.addDepositListener(a);
	}
	public void addMainWithdrawListener(ActionListener a) {
		mainmenu.addWithdrawListener(a);
	}
	public void addMainDeleteListener(ActionListener a) {
		mainmenu.addDeleteListener(a);	
	}
	public void addMainViewListener(ActionListener a) {
		mainmenu.addViewListener(a);
	}
	public void addMainSelectListener(ActionListener a) {
		mainmenu.addSelectListener(a);
	}
	public void addSelectOkListener(ActionListener a) {
		selectmenu.addOkListener(a);
	}
	public void addSelectCancelListener(ActionListener a) {
		selectmenu.addCancelListener(a);
	}
	public void addDepositOkListener(ActionListener a) {
		depositmenu.addOkListener(a);
	}
	public void addDepositCancelListener(ActionListener a) {
		depositmenu.addCancelListener(a);
	}
	public void addCreateOkListener(ActionListener a) {
		createmenu.addOkListener(a);
	}
	public void addCreateCancelListener(ActionListener a) {
		createmenu.addCancelListener(a);
	}
	public void addDeleteDeleteListener(ActionListener a) {
		deletemenu.addDeleteListener(a);
	}
	public void addDeleteCancelListener(ActionListener a) {
		deletemenu.addCancelListener(a);
	}
	public void addViewOkListener(ActionListener a) {
		viewmenu.addOkListener(a);
	}
	public void addWithdrawOkListener(ActionListener a) {
		withdrawmenu.addOkListener(a);
	}
	public void addWithdrawCancelListener(ActionListener a) {
		withdrawmenu.addCancelListener(a);
	}
	
	public ViewMenu getViewmenu() {
		return viewmenu;
	}

	public String getCreateDescription() {
		return createmenu.getDescription();
	}
	public double getCreateBalance() {
		return createmenu.getBalance();
	}
	public String getCreateType() {
		return createmenu.getType();
	}
}
