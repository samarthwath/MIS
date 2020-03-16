package com.my.desktop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewRecordWindow {

	public JFrame frame;
	private JTextField textField;

	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ViewRecordWindow window = new ViewRecordWindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public ViewRecordWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setBounds(100, 100, 961, 773);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblEnterEnrollmentNumber = new JLabel("Enter Enrollment Number ");
		lblEnterEnrollmentNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterEnrollmentNumber.setBounds(12, 13, 291, 32);
		frame.getContentPane().add(lblEnterEnrollmentNumber);
		
		textField = new JTextField();
		textField.setBounds(319, 21, 161, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(571, 23, 150, 25);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(12, 204, 134, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(12, 268, 134, 25);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(12, 321, 191, 25);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(12, 379, 191, 25);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(12, 434, 134, 25);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(12, 486, 173, 25);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBounds(12, 544, 173, 25);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(12, 607, 184, 25);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_8.setBounds(12, 664, 173, 25);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_9.setBounds(289, 204, 191, 25);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_10.setBounds(289, 257, 191, 25);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_11.setBounds(289, 321, 191, 25);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_12.setBounds(289, 379, 191, 25);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_13.setBounds(289, 434, 191, 25);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_14.setBounds(289, 486, 191, 25);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_15.setBounds(289, 544, 191, 25);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_16.setBounds(289, 607, 191, 25);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_17.setBounds(289, 664, 191, 25);
		frame.getContentPane().add(label_17);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					int no=Integer.parseInt(textField.getText());
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Connection Established");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
					PreparedStatement ps=con.prepareStatement("select * from desktop where Enroll_ID='"+no+"'");
					ResultSet rs=ps.executeQuery();
					if(rs.next()==false)
					{
					lblNewLabel_1.setText("Invalid ID");
					}
					else
					{
						label.setText("First Name");
						label_1.setText("Last Name");
						label_2.setText("Ten Percentage");
						label_3.setText("Tweleve Percent");
						label_4.setText("JEE Score");
						label_5.setText("Select Branch");
						label_6.setText("Contact Number");
						label_7.setText("Parent Number");
						label_8.setText("Address");
						label_9.setText(rs.getString(2));
						label_10.setText(rs.getString(3));
						String ten=Integer.toString(rs.getInt(4));
						label_11.setText(ten);
						String tweleve=Integer.toString(rs.getInt(5));
						label_12.setText(tweleve);
						String jee=Integer.toString(rs.getInt(6));
						label_13.setText(jee);
						label_14.setText(rs.getString(7));
						String sn=Integer.toString(rs.getInt(8));
						label_15.setText(sn);
						String pn=Integer.toString(rs.getInt(9));
						label_16.setText(pn);
						label_17.setText(rs.getString(10));
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(206, 58, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(null);
				label_1.setText(null);
				label_2.setText(null);
				label_3.setText(null);
				label_4.setText(null);
				label_5.setText(null);
				label_6.setText(null);
				label_7.setText(null);
				label_8.setText(null);
				label_9.setText(null);
				label_10.setText(null);
				label_11.setText(null);
				label_12.setText(null);
				label_13.setText(null);
				label_14.setText(null);
				label_15.setText(null);
				label_16.setText(null);
				label_17.setText(null);
				textField.setText(null);
				lblNewLabel_1.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(240, 240, 240));
		btnReset.setBounds(348, 58, 97, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstWindow fw=new FirstWindow();
				fw.frame.setVisible(true);
				frame.hide();
			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPrevious.setBackground(new Color(240, 240, 240));
		btnPrevious.setBounds(497, 58, 97, 25);
		frame.getContentPane().add(btnPrevious);
		
		
		
		
		
		
		
		
		
		
	}
}
