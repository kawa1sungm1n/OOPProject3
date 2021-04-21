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

public class SelectMenu extends JPanel {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JButton btnOk;
	private JButton btnCancel;
	
	public SelectMenu() {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblSelect = new JLabel("Select Account:");
		lblSelect.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblSelect.setBounds(12, 35, 105, 15);
		add(lblSelect);
		
		JComboBox menuBox = new JComboBox();
		menuBox.setBounds(129, 32, 149, 171);
		add(menuBox);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(129, 230, 97, 38);
		add(btnOk);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(254, 230, 97, 38);
		add(btnCancel);
	}
	
	public void addOkListener(ActionListener a) {
		btnOk.addActionListener(a);
	}
	public void addCancelListener(ActionListener a) {
		btnCancel.addActionListener(a);
	}
	
}
