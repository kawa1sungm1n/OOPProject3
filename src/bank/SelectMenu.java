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

public class SelectMenu extends JFrame{
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	
	public SelectMenu() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblSelect = new JLabel("Select Account:");
		lblSelect.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblSelect.setBounds(12, 58, 105, 15);
		getContentPane().add(lblSelect);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 55, 149, 171);
		getContentPane().add(comboBox);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(129, 253, 97, 38);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(254, 253, 97, 38);
		getContentPane().add(btnCancel);
	}
}
