package bank;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.CardLayout;

public class View extends JFrame {
	
	private final int FRAME_WIDTH = 750;
	private final int FRAME_HEIGHT = 450;
	
	public View() {

	    
	    this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bank Machine Simulation v1.0 >");
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 278, 38);
		getContentPane().add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 45, 710, 356);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new MainMenu(), "main menu");
		panel.add(new CreateMenu(), "create menu");
	}
}
