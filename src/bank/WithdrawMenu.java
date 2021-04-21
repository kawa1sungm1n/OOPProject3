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

public class WithdrawMenu extends JPanel{
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;

	
	public WithdrawMenu() {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblWithdraw = new JLabel("Enter Amount to withdraw: $");
		lblWithdraw.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblWithdraw.setBounds(12, 33, 203, 15);
		add(lblWithdraw);
		
		JLabel lblDescription = new JLabel("Transaction Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDescription.setBounds(43, 72, 172, 15);
		add(lblDescription);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(219, 124, 97, 38);
		add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(340, 124, 97, 38);
		add(btnCancel);
	}

}
