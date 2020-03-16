package com.rays.mybanking;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MoneyTransfer {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoneyTransfer window = new MoneyTransfer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MoneyTransfer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 565, 62);
		panel.setBackground(new Color(152, 251, 152));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Details");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 13, 198, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(0, 62, 565, 330);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Account Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 35, 210, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblRecieverNumber = new JLabel("Reciever Number");
		lblRecieverNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecieverNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRecieverNumber.setBounds(0, 107, 210, 34);
		panel_1.add(lblRecieverNumber);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterAmount.setBounds(0, 180, 173, 34);
		panel_1.add(lblEnterAmount);
		
		textField = new JTextField();
		textField.setBounds(222, 44, 229, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(222, 116, 229, 22);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(222, 189, 229, 22);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(110, 245, 126, 25);
		panel_1.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(330, 245, 126, 25);
		panel_1.add(btnBack);
	}

}
