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

public class DeleteMenu extends JPanel {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JButton btnDelete;
	private JButton btnCancel;
	
	
	public DeleteMenu() {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblDelete = new JLabel("Delete Current Account?");
		lblDelete.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblDelete.setBounds(12, 32, 185, 15);
		add(lblDelete);
		
		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnDelete.setBounds(193, 57, 97, 38);
		add(btnDelete);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(314, 57, 97, 38);
		add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblNewLabel.setBounds(199, 32, 212, 15);
		add(lblNewLabel);

	}
	
	public void addDeleteListener(ActionListener a) {
		btnDelete.addActionListener(a);
	}
	public void addCancelListener(ActionListener a) {
		btnCancel.addActionListener(a);
	}

}
