package com.unique.issued;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IssuedMaterial {

	private JFrame frame;
	private JTextField textField;
	//private JTextField textField_1;
	Integer e_serial_no;
	private JButton submit;
	private JTextField textField_1;
	private JLabel issued; 
	private JLabel remarks_label;
	private JLabel check_label;
	private JLabel quality_label;
	private JLabel check_data;
	private JLabel quality_data;
	private JLabel remarks_data;
	Connection con;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssuedMaterial window = new IssuedMaterial();
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
	public IssuedMaterial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 784, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		m_weight.setBounds(12, 340, 113, 22);
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
		
JButton show_details = 
new JButton("Show Details");
		
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
					con=DriverManager.getConnection("jdbc:mysql://34.68.120.157/naman","root","");
					System.out.println("Connection Established");
					//details.setVisible(true);
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
						String ok_variable="Ok";
						
						
						PreparedStatement ps1=con.prepareStatement("select * from quality_check where serial_no='"+e_serial_no+"'");
						ResultSet rs1=ps1.executeQuery();
						if(rs1.next()==false)
						{
							System.out.println("No details Found");
						}
						else
						{
							//rs1.next();
							if(rs1.getString(3).equals("Ok"))
							{
								issued.setVisible(true);
								textField_1.setVisible(true);
								submit.setVisible(true);
								check_label.setVisible(true);
								quality_label.setVisible(true);
								check_data.setVisible(true);
								quality_data.setVisible(true);
								String st1= rs1.getString(2);
								check_data.setText(st1);
								String st2 = rs1.getString(3);
								quality_data.setText(st2);
//								PreparedStatement ps2=con.prepareStatement("insert into coil_issue values(?,?)");
//								ps2.setInt(1,e_serial_no);
//								ps2.setString(2, textField_1.getText().toString());
//								int row=ps2.executeUpdate();
//								System.out.println("Values Enterd in Coil_issue table");
							}
							else
							{
								issued.setVisible(false);
								textField_1.setVisible(false);
								submit.setVisible(false);
								check_label.setVisible(true);
								quality_label.setVisible(true);
								remarks_label.setVisible(true);
								check_data.setVisible(true);
								quality_data.setVisible(true);
								remarks_data.setVisible(true);								
								check_data.setText(rs1.getString(2));
								quality_data.setText(rs1.getString(3));
								remarks_data.setText(rs1.getString(4));
								JOptionPane.showMessageDialog(null, "Product has some defects");
								System.out.println("Product has some defects");
							}
							
						}
						
						
						
					}
					
				}
				catch (Exception e) 
				{
					
					e.printStackTrace();
					try {
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		show_details.setFont(new Font("Tahoma", Font.BOLD, 13));
		show_details.setForeground(Color.BLACK);
		show_details.setBounds(86, 80, 125, 25);
		panel.add(show_details);
		
		issued = new JLabel("Issued To");
		issued.setFont(new Font("Tahoma", Font.BOLD, 13));
		issued.setBounds(12, 570, 86, 28);
		issued.setVisible(false);
		panel.add(issued);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 573, 146, 22);
		textField_1.setVisible(false);
		panel.add(textField_1);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PreparedStatement ps2;
				try {
					ps2 = con.prepareStatement("insert into coil_issue values(?,?)");
					ps2.setInt(1,e_serial_no);
					ps2.setString(2, textField_1.getText().toString());
					ps2.executeUpdate();
					System.out.println("Values Enterd in Coil_issue table");
			
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
					}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 13));
		submit.setBounds(92, 633, 97, 25);
		submit.setVisible(false);
		panel.add(submit);
		
		check_label = new JLabel("Checked By");
		check_label.setFont(new Font("Tahoma", Font.BOLD, 13));
		check_label.setBounds(12, 416, 113, 22);
		check_label.setVisible(false);
		panel.add(check_label);
		
		quality_label = new JLabel("Quality");
		quality_label.setFont(new Font("Tahoma", Font.BOLD, 13));
		quality_label.setBounds(12, 474, 113, 22);
		quality_label.setVisible(false);
		panel.add(quality_label);
		
		remarks_label = new JLabel("Remarks");
		remarks_label.setFont(new Font("Tahoma", Font.BOLD, 13));
		remarks_label.setBounds(12, 535, 113, 22);
		remarks_label.setVisible(false);
		panel.add(remarks_label);
		
		check_data = new JLabel("Checked By");
		check_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		check_data.setBounds(183, 416, 113, 22);
		check_data.setVisible(false);
		panel.add(check_data);
		
		quality_data = new JLabel("Checked By");
		quality_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		quality_data.setBounds(183, 474, 113, 22);
		quality_data.setVisible(false);
		panel.add(quality_data);
		
		remarks_data = new JLabel("Checked By");
		remarks_data.setFont(new Font("Tahoma", Font.BOLD, 13));
		remarks_data.setBounds(183, 538, 113, 22);
		remarks_data.setVisible(false);
		panel.add(remarks_data);
		
		
		
		
	}
}
