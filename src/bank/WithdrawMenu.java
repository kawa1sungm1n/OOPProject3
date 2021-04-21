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

public class WithdrawMenu extends JFrame{
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	private JTextField txtWithdraw;
	private JTextField txtDescription;
	
	public WithdrawMenu() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblWithdraw = new JLabel("Enter Amount to withdraw: $");
		lblWithdraw.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblWithdraw.setBounds(12, 58, 203, 15);
		getContentPane().add(lblWithdraw);
		
		txtWithdraw = new JTextField();
		txtWithdraw.setBounds(222, 56, 94, 21);
		getContentPane().add(txtWithdraw);
		txtWithdraw.setColumns(10);
		
		JLabel lblDescription = new JLabel("Transaction Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDescription.setBounds(43, 97, 172, 15);
		getContentPane().add(lblDescription);
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		txtDescription.setBounds(222, 95, 347, 21);
		getContentPane().add(txtDescription);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBounds(219, 149, 97, 38);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(340, 149, 97, 38);
		getContentPane().add(btnCancel);
	}

}
