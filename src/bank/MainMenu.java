package bank;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JPanel  {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;

	
	public MainMenu()  {
	
	    this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
	    setLayout(null);
	    
	    JButton btnSelect = new JButton("select");
	    btnSelect.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnSelect.setBounds(12, 24, 112, 32);
	    add(btnSelect);
	    
	    JButton btnDeposit = new JButton("deposit");
	    btnDeposit.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnDeposit.setBounds(12, 66, 112, 32);
	    add(btnDeposit);
	    
	    JButton btnWithdraw = new JButton("withdraw");
	    btnWithdraw.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnWithdraw.setBounds(12, 108, 112, 32);
	    add(btnWithdraw);
	    
	    JButton btnCreate = new JButton("create");
	    btnCreate.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnCreate.setBounds(12, 150, 112, 32);
	    add(btnCreate);
	    
	    JButton btnDelete = new JButton("delete");
	    btnDelete.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnDelete.setBounds(12, 192, 112, 32);
	    add(btnDelete);
	    
	    JButton btnView = new JButton("view");
	    btnView.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnView.setBounds(12, 234, 112, 32);
	    add(btnView);
	    
	    JButton btnQuit = new JButton("quit");
	    btnQuit.setFont(new Font("Dubai", Font.PLAIN, 18));
	    btnQuit.setBounds(12, 276, 112, 32);
	    add(btnQuit);
	    
	    JLabel lblSelect = new JLabel("Select Account");
	    lblSelect.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblSelect.setBounds(136, 29, 151, 22);
	    add(lblSelect);
	    
	    JLabel lblDeposit = new JLabel("Deposit sum to account");
	    lblDeposit.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblDeposit.setBounds(136, 71, 186, 22);
	    add(lblDeposit);
	    
	    JLabel lblWithdraw = new JLabel("Withdraw sum from account");
	    lblWithdraw.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblWithdraw.setBounds(136, 113, 218, 22);
	    add(lblWithdraw);
	    
	    JLabel lblCreate = new JLabel("Create account");
	    lblCreate.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblCreate.setBounds(136, 155, 151, 22);
	    add(lblCreate);
	    
	    JLabel lblDelete = new JLabel("Delete account");
	    lblDelete.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblDelete.setBounds(136, 197, 151, 22);
	    add(lblDelete);
	    
	    JLabel lblView = new JLabel("View account transactions");
	    lblView.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblView.setBounds(136, 239, 206, 22);
	    add(lblView);
	    
	    JLabel lblQuit = new JLabel("Save and Quit");
	    lblQuit.setFont(new Font("Dubai", Font.PLAIN, 18));
	    lblQuit.setBounds(136, 281, 151, 22);
	    add(lblQuit);
		
		
	}
}

