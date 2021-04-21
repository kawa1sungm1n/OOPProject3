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

public class CreateMenu extends JFrame {
	private JTextField txtDes;
	private JTextField txtBalance;
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	
	public CreateMenu() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblTypeMenu = new JLabel("Select Account Type:");
		lblTypeMenu.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblTypeMenu.setBounds(36, 58, 141, 30);
		getContentPane().add(lblTypeMenu);
		
		JComboBox typeMenu = new JComboBox();
		typeMenu.setBounds(189, 58, 117, 61);
		getContentPane().add(typeMenu);
		
		JLabel lblDescription = new JLabel("Account Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblDescription.setBounds(36, 137, 141, 30);
		getContentPane().add(lblDescription);
		
		txtDes = new JTextField();
		txtDes.setBounds(190, 142, 344, 21);
		getContentPane().add(txtDes);
		txtDes.setColumns(10);
		
		JLabel lblBalance = new JLabel("Starting Balance: $");
		lblBalance.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblBalance.setBounds(46, 177, 131, 30);
		getContentPane().add(lblBalance);
		
		txtBalance = new JTextField();
		txtBalance.setColumns(10);
		txtBalance.setBounds(189, 182, 91, 21);
		getContentPane().add(txtBalance);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBounds(183, 241, 97, 38);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(292, 241, 97, 38);
		getContentPane().add(btnCancel);
		
	}
}
