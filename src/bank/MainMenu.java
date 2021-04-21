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

public class MainMenu extends JFrame  {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	private BankMachine bankmachine;
	
	public MainMenu(BankMachine bankmachine) {
		
	    this.bankmachine = bankmachine;
	    
	    this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JButton btnSelect = new JButton("select");
		btnSelect.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelect.setBounds(50, 58, 112, 32);
		getContentPane().add(btnSelect);
		
		JButton btnDeposit = new JButton("deposit");
		btnDeposit.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnDeposit.setBounds(50, 100, 112, 32);
		getContentPane().add(btnDeposit);
		
		JButton btnWithdraw = new JButton("withdraw");
		btnWithdraw.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWithdraw.setBounds(50, 142, 112, 32);
		getContentPane().add(btnWithdraw);
		
		JButton btnCreate = new JButton("create");
		btnCreate.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.setBounds(50, 184, 112, 32);
		getContentPane().add(btnCreate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(50, 226, 112, 32);
		getContentPane().add(btnDelete);
		
		JButton btnView = new JButton("view");
		btnView.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnView.setBounds(50, 268, 112, 32);
		getContentPane().add(btnView);
		
		JButton btnQuit = new JButton("quit");
		btnQuit.setFont(new Font("Dubai", Font.PLAIN, 18));
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuit.setBounds(50, 310, 112, 32);
		getContentPane().add(btnQuit);
		
		JLabel lblSelect = new JLabel("Select Account");
		lblSelect.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblSelect.setBounds(174, 63, 151, 22);
		getContentPane().add(lblSelect);
		
		JLabel lblDeposit = new JLabel("Deposit sum to account");
		lblDeposit.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblDeposit.setBounds(174, 105, 186, 22);
		getContentPane().add(lblDeposit);
		
		JLabel lblWithdraw = new JLabel("Withdraw sum from account");
		lblWithdraw.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblWithdraw.setBounds(174, 147, 218, 22);
		getContentPane().add(lblWithdraw);
		
		JLabel lblCreate = new JLabel("Create account");
		lblCreate.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblCreate.setBounds(174, 189, 151, 22);
		getContentPane().add(lblCreate);
		
		JLabel lblDelete = new JLabel("Delete account");
		lblDelete.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblDelete.setBounds(174, 231, 151, 22);
		getContentPane().add(lblDelete);
		
		JLabel lblView = new JLabel("View account transactions");
		lblView.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblView.setBounds(174, 273, 206, 22);
		getContentPane().add(lblView);
		
		JLabel lblQuit = new JLabel("Save and Quit");
		lblQuit.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblQuit.setBounds(174, 315, 151, 22);
		getContentPane().add(lblQuit);
	}
	
}

