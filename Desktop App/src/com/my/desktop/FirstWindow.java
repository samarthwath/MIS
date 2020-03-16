package com.my.desktop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FirstWindow {

	public JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow window = new FirstWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FirstWindow() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 782, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setUndecorated(true);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 778, 85);
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setBounds(269, 13, 312, 67);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 83, 778, 317);
		panel_1.setBackground(Color.RED);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Developed By :-");
		lblNewLabel_1.setBounds(12, 5, 259, 87);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1. Samarth Wath");
		lblNewLabel_2.setBounds(12, 105, 178, 30);
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNakulBhoraskar = new JLabel("2. Nakul Bhoraskar");
		lblNakulBhoraskar.setBounds(12, 148, 178, 30);
		lblNakulBhoraskar.setForeground(Color.YELLOW);
		lblNakulBhoraskar.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNakulBhoraskar);
		
		JLabel lblAnukrutiKanungo = new JLabel("3. Anukruti Kanungo");
		lblAnukrutiKanungo.setBounds(12, 194, 178, 30);
		lblAnukrutiKanungo.setForeground(Color.YELLOW);
		lblAnukrutiKanungo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblAnukrutiKanungo);
		
		JLabel lblAbhishekRadhakrishnan = new JLabel("4. Vedansh Airen");
		lblAbhishekRadhakrishnan.setBounds(12, 237, 222, 30);
		lblAbhishekRadhakrishnan.setForeground(Color.YELLOW);
		lblAbhishekRadhakrishnan.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblAbhishekRadhakrishnan);
		
		JLabel lblTaniya = new JLabel("5. Taniya Kalgaonkar\r\n");
		lblTaniya.setForeground(Color.YELLOW);
		lblTaniya.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTaniya.setBounds(12, 274, 178, 30);
		panel_1.add(lblTaniya);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 401, 778, 123);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.setBounds(150, 41, 176, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrationWindow rw=new RegistrationWindow();
				rw.frame.setVisible(true);
				frame.hide();
			}
		});
		panel_2.setLayout(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(btnNewButton);
		
		JButton btnViewRecord = new JButton("View Record");
		btnViewRecord.setBounds(448, 41, 176, 25);
		btnViewRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRecordWindow vrw=new ViewRecordWindow();
				vrw.frame.setVisible(true);
				frame.hide();
				
			}
		});
		btnViewRecord.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewRecord.setBackground(Color.WHITE);
		panel_2.add(btnViewRecord);
	}
}
