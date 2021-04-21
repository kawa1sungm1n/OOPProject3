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

public class ViewMenu extends JFrame {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	private JTextField textField;
	
	public ViewMenu()  {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblDirection = new JLabel("Transactions of currently selected account:");
		lblDirection.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDirection.setBounds(12, 49, 351, 27);
		getContentPane().add(lblDirection);
		
		textField = new JTextField();
		textField.setBounds(12, 86, 710, 266);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 362, 119, 27);
		getContentPane().add(btnNewButton);
		

	}
}
