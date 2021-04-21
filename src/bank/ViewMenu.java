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

public class ViewMenu extends JPanel {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JTextField textField;
	private JTextField textField_1;
	
	public ViewMenu()  {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblDirection = new JLabel("Transactions of currently selected account:");
		lblDirection.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDirection.setBounds(12, 10, 686, 27);
		add(lblDirection);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 47, 686, 266);
		add(textField_1);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnNewButton.setBounds(12, 323, 199, 27);
		add(btnNewButton);
	}
}
