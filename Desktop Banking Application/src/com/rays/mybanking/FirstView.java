package com.rays.mybanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstView window = new FirstView();
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
	public FirstView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 569, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBounds(0, 0, 551, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to SBI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(137, 13, 251, 44);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 72, 551, 278);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Cash Withdraw\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashWithdraw cw=new CashWithdraw();
				cw.frame.setVisible(true);
				frame.hide();
				
			}
		});
		btnNewButton.setBounds(156, 24, 203, 33);
		panel_1.add(btnNewButton);
		
		JButton btnCashDeposit = new JButton("Cash Deposit");
		btnCashDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashDeposit cd=new CashDeposit();
				cd.frame.setVisible(true);
				frame.hide();
			}
		});
		btnCashDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCashDeposit.setBounds(156, 85, 203, 33);
		panel_1.add(btnCashDeposit);
		
		JButton btnMoneyTransfer = new JButton("Money Transfer");
		btnMoneyTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoneyTransfer mt=new MoneyTransfer();
				mt.frame.setVisible(true);
				frame.hide();
			}
		});
		btnMoneyTransfer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMoneyTransfer.setBounds(156, 144, 203, 33);
		panel_1.add(btnMoneyTransfer);
		
		JButton btnBalanceInquiry = new JButton("Balance Inquiry");
		btnBalanceInquiry.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalanceInquiry.setBounds(156, 202, 203, 33);
		panel_1.add(btnBalanceInquiry);
	}

}
