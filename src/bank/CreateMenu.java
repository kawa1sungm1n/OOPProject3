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

public class CreateMenu extends JPanel {
	private JTextField txtDes;
	private JTextField txtBalance;
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JTextField textField;
	private JTextField textField_1;
	
	public CreateMenu() {
		setLayout(null);
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		JLabel lblTypeMenu = new JLabel("Select Account Type:");
		lblTypeMenu.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblTypeMenu.setBounds(32, 49, 141, 30);
		add(lblTypeMenu);
		
		JComboBox typeMenu = new JComboBox();
		typeMenu.setBounds(185, 49, 117, 61);
		add(typeMenu);
		
		JLabel lblDescription = new JLabel("Account Description:");
		lblDescription.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblDescription.setBounds(32, 128, 141, 30);
		add(lblDescription);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(186, 133, 344, 21);
		add(textField);
		
		JLabel lblBalance = new JLabel("Starting Balance: $");
		lblBalance.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblBalance.setBounds(42, 168, 131, 30);
		add(lblBalance);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 173, 91, 21);
		add(textField_1);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(179, 232, 97, 38);
		add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(288, 232, 97, 38);
		add(btnCancel);
	}
}
