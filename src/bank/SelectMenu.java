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
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class SelectMenu extends JPanel {
	
	private final int PANEL_WIDTH = 710;
	private final int PANEL_HEIGHT = 356;
	private JList list;
	private JButton btnOk;
	private JButton btnCancel;
	
	public SelectMenu() {
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		JLabel lblSelect = new JLabel("Select Account:");
		lblSelect.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblSelect.setBounds(12, 35, 105, 15);
		add(lblSelect);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnOk.setBounds(129, 230, 97, 38);
		add(btnOk);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Dubai", Font.PLAIN, 16));
		btnCancel.setBounds(254, 230, 97, 38);
		add(btnCancel);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(129, 35, 222, 166);
		add(panel);
		
		list = new JList();
		list.setBackground(Color.WHITE);
		list.setBounds(129, 35, 222, 166);
		list.setVisible(true);
		list.setPreferredSize(new Dimension(222, 166));
		panel.add(list);
		

	}
	
	public void populate(ArrayList<String> al) {
		list.setListData(al.toArray(new String[al.size()]));
	}
	public String getSelected() {
		return list.getSelectedValue().toString();
	}
	
	public void addOkListener(ActionListener a) {
		btnOk.addActionListener(a);
	}
	public void addCancelListener(ActionListener a) {
		btnCancel.addActionListener(a);
	}
}
