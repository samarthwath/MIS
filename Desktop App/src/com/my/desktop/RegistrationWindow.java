package com.my.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrationWindow {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	public RegistrationWindow() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 961, 773);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(12, 27, 134, 25);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label);
		
		
		
		JLabel label_1 = new JLabel("Last Name");
		label_1.setBounds(12, 86, 134, 25);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("10th Percentage");
		label_2.setBounds(12, 153, 191, 25);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("12th Percentage");
		label_3.setBounds(12, 212, 191, 25);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("JEE Score");
		label_4.setBounds(12, 275, 134, 25);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 368, 121, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "CSIT", "Mechatronics", "Automobile", "AI", "Instrumentation"}));
		comboBox.setSelectedIndex(0);
		panel.add(comboBox);
		
		JLabel label_5 = new JLabel("Select Branch");
		label_5.setBounds(12, 330, 173, 25);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Contact Number");
		label_6.setBounds(12, 419, 173, 25);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Parent's Number");
		label_7.setBounds(12, 480, 184, 25);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Address");
		label_8.setBounds(12, 535, 173, 25);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(214, 690, 300, 30);
		panel.add(lblNewLabel);
		
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 157, 156, 22);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(192, 216, 156, 22);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(192, 279, 156, 22);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(192, 419, 156, 22);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(192, 484, 156, 22);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(192, 539, 156, 22);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		JButton button = new JButton("Previous");
		button.setBounds(88, 610, 97, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstWindow fw=new FirstWindow();
				fw.frame.setVisible(true);
				frame.dispose();
			
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(button);
		
		JButton btnSubmit = new JButton("Reset");
		btnSubmit.setBounds(416, 610, 97, 25);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				comboBox.setSelectedItem(null);
				lblNewLabel.setText(null);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnSubmit);
		
		textField_8 = new JTextField();
		textField_8.setBounds(192, 31, 156, 22);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(192, 90, 156, 22);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_9.setColumns(10);
		panel.add(textField_9);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					int ten=Integer.parseInt(textField_2.getText());
					int tweleve=Integer.parseInt(textField_3.getText());
					int jee=Integer.parseInt(textField_4.getText());
					int sn=Integer.parseInt(textField_5.getText());
					int pn=Integer.parseInt(textField_6.getText());
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Connection Established");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
					PreparedStatement ps=con.prepareStatement("insert into desktop(FirstName,LastName,TenPercentage,TwelevePercentage,JeeScore,SelectedBranch,ContactNumber,ParentNumber,Address) values(?,?,?,?,?,?,?,?,?)");
					ps.setString(1, textField_8.getText());
					ps.setString(2, textField_9.getText());
					ps.setInt(3, ten);
					ps.setInt(4,tweleve);
					ps.setInt(5, jee);
					ps.setString(6, (String)comboBox.getSelectedItem());
					ps.setInt(7, sn);
					ps.setInt(8, pn);
					ps.setString(9, textField_7.getText());
					ps.execute();
					Statement st=con.createStatement();
					ResultSet rs1=st.executeQuery("select Enroll_ID from desktop where Firstname='"+textField_8.getText()+"'");
					rs1.next();
					int id=rs1.getInt(1);
					String sid=Integer.toString(id);
					lblNewLabel.setText("Details Submitted ID Assigned "+sid);

				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				
				
			}
		});
		btnSubmit_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSubmit_1.setBounds(251, 610, 97, 25);
		panel.add(btnSubmit_1);
		
		
		
		
	}
}
