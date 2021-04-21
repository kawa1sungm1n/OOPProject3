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

public class DeleteMenu extends JFrame {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	
	public DeleteMenu() {
		this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JLabel lblDelete = new JLabel("Delete Current Account?");
		lblDelete.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDelete.setBounds(12, 58, 185, 15);
		getContentPane().add(lblDelete);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnDelete.setBounds(193, 83, 97, 38);
		getContentPane().add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(314, 83, 97, 38);
		getContentPane().add(btnCancel);
	}

}
