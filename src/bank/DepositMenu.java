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

public class DepositMenu extends JPanel {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnOk;
	private JButton btnCancel;

	
	public DepositMenu() {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblDeposit = new JLabel("Enter Amount to deposit: $");
		lblDeposit.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDeposit.setBounds(12, 26, 184, 15);
		add(lblDeposit);
		
		JLabel lblDescription = new JLabel("Transaction Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDescription.setBounds(33, 61, 172, 15);
		add(lblDescription);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(217, 112, 97, 38);
		add(btnOk);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(337, 112, 97, 38);
		add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(208, 24, 131, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 59, 226, 21);
		add(textField_1);
		textField_1.setColumns(10);
	}
	public void addOkListener(ActionListener a) {
		btnOk.addActionListener(a);
	}
	public void addCancelListener(ActionListener a) {
		btnCancel.addActionListener(a);
	}
	
}
