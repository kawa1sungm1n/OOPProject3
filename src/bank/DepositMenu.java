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

public class DepositMenu extends JFrame {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	private JTextField txtDeposit;
	private JTextField txtDescription;
	
	public DepositMenu() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblDeposit = new JLabel("Enter Amount to deposit: $");
		lblDeposit.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDeposit.setBounds(22, 58, 184, 15);
		getContentPane().add(lblDeposit);
		
		JLabel lblDescription = new JLabel("Transaction Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDescription.setBounds(43, 93, 172, 15);
		getContentPane().add(lblDescription);
		
		txtDeposit = new JTextField();
		txtDeposit.setColumns(10);
		txtDeposit.setBounds(227, 56, 94, 21);
		getContentPane().add(txtDeposit);
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		txtDescription.setBounds(227, 91, 347, 21);
		getContentPane().add(txtDescription);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(227, 144, 97, 38);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(347, 144, 97, 38);
		getContentPane().add(btnCancel);
	}
}
