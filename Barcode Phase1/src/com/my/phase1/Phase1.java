package com.my.phase1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Phase1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Integer e_serial_no;
	JButton details;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Phase1 window = new Phase1();
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
	public Phase1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 41, 705, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel serial_no_label = new JLabel("Serial_Number");
		serial_no_label.setFont(new Font("Tahoma", Font.BOLD, 13));
		serial_no_label.setForeground(Color.BLACK);
		serial_no_label.setBounds(12, 29, 113, 28);
		panel.add(serial_no_label);
		
		textField = new JTextField();
		textField.setBounds(150, 32, 146, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel m_type = new JLabel("");
		m_type.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_type.setBounds(12, 170, 113, 22);
		panel.add(m_type);
		
		JLabel m_thickness = new JLabel("");
		m_thickness.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_thickness.setBounds(12, 222, 132, 22);
		panel.add(m_thickness);
		
		JLabel m_width = new JLabel("");
		m_width.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_width.setBounds(12, 278, 132, 22);
		panel.add(m_width);
		
		JLabel m_weight = new JLabel("");
		m_weight.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_weight.setBounds(12, 340, 102, 22);
		panel.add(m_weight);
		
		JLabel m_type_data = new JLabel("");
		m_type_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_type_data.setBounds(150, 170, 146, 22);
		panel.add(m_type_data);
		
		JLabel m_thickness_data = new JLabel("");
		m_thickness_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_thickness_data.setBounds(150, 222, 146, 22);
		panel.add(m_thickness_data);
		
		JLabel m_width_data = new JLabel("");
		m_width_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_width_data.setBounds(150, 278, 146, 22);
		panel.add(m_width_data);
		
		JLabel m_weight_data = new JLabel("");
		m_weight_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		m_weight_data.setBounds(150, 340, 146, 22);
		panel.add(m_weight_data);
		
		JButton show_details = new JButton("Show Details");
		
		show_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				m_type.setText("Material Type");
				m_thickness.setText("Material Thickness");
				m_width.setText("Material Width");
				m_weight.setText("Material Weight");
				//panel.add();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded Successfully");
					Connection con=DriverManager.getConnection("jdbc:mysql://34.68.120.157/naman","root","123");
					System.out.println("Connection Established");
					details.setVisible(true);
					e_serial_no=Integer.parseInt(textField.getText());
					PreparedStatement ps=con.prepareStatement("select * from barcode_details where serial_no='"+e_serial_no+"'");
					ResultSet rs=ps.executeQuery();
					//rs.next();
					if(rs.next()==false)
					{
						System.out.println("No details Found");
					}
					else
					{
						Double e_width_data=rs.getDouble(3);
						Double e_thickness_data=rs.getDouble(4);
						Double e_weight_data=rs.getDouble(5);
						String str_width_data=Double.toString(e_width_data);
						String str_thickness_data=Double.toString(e_thickness_data);
						String str_weight_data=Double.toString(e_weight_data);
						m_type_data.setText(rs.getString(2));
						m_thickness_data.setText(str_thickness_data);
						m_width_data.setText(str_width_data);
						m_weight_data.setText(str_weight_data);
						
					}
					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
					
				}
				
			}
		});
		show_details.setFont(new Font("Tahoma", Font.BOLD, 13));
		show_details.setForeground(Color.BLACK);
		show_details.setBounds(86, 80, 125, 25);
		panel.add(show_details);
		
		JLabel quality_check = new JLabel("Quality Check");
		quality_check.setFont(new Font("Tahoma", Font.BOLD, 13));
		quality_check.setBounds(12, 446, 96, 22);
		quality_check.setVisible(false);
		panel.add(quality_check);
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 446, 125, 22);
		textField_1.setVisible(false);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton ok_radio = new JRadioButton("Ok");
		ok_radio.setFont(new Font("Tahoma", Font.BOLD, 13));
		ok_radio.setBounds(12, 499, 127, 25);
		ok_radio.setVisible(false);
		panel.add(ok_radio);
		
		JRadioButton not_ok_radio = new JRadioButton("Not Ok");
		not_ok_radio.setFont(new Font("Tahoma", Font.BOLD, 13));
		not_ok_radio.setBounds(150, 499, 127, 25);
		not_ok_radio.setVisible(false);
		panel.add(not_ok_radio);
		ButtonGroup bg=new ButtonGroup();
		bg.add(not_ok_radio);
		bg.add(ok_radio);
		
		JLabel remarks_label = new JLabel("Remarks");
		remarks_label.setFont(new Font("Tahoma", Font.BOLD, 13));
		remarks_label.setBounds(12, 559, 76, 16);
		remarks_label.setVisible(false);
		panel.add(remarks_label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(150, 556, 285, 65);
		textArea.setVisible(false);
		panel.add(textArea);
		
		JButton submit_response = new JButton("Submit Response");
		submit_response.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded Successfully");
					Connection con=DriverManager.getConnection("jdbc:mysql://34.68.120.157/naman","root","123");
					System.out.println("Connection Established");
					PreparedStatement ps1=con.prepareStatement("insert into quality_check (serial_no,q_check_by,q_ok,q_remarks) values(?,?,?,?)");
					ps1.setInt(1, e_serial_no);
					ps1.setString(2, textField_1.getText());
					if(ok_radio.isSelected())
					{
						ps1.setString(3, ok_radio.getLabel());
						
					}
					if(not_ok_radio.isSelected())
					{
						ps1.setString(3, not_ok_radio.getLabel());
					}
					ps1.setString(4, textArea.getText());
					int a=ps1.executeUpdate();
					System.out.println("Values Enterd Successfully");
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		submit_response.setFont(new Font("Tahoma", Font.BOLD, 13));
		submit_response.setBounds(57, 651, 154, 25);
		submit_response.setVisible(false);
		panel.add(submit_response);
		
		details= new JButton("Add Details");
		details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				quality_check.setVisible(true);
				textField_1.setVisible(true);
				ok_radio.setVisible(true);
				not_ok_radio.setVisible(true);
				remarks_label.setVisible(true);
				textArea.setVisible(true);
				submit_response.setVisible(true);
			}
		});
		details.setFont(new Font("Tahoma", Font.BOLD, 13));
		details.setBounds(12, 387, 113, 25);
		details.setVisible(false);
		panel.add(details);
		
		
		
	}
}
