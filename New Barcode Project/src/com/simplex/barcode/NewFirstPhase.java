package com.simplex.barcode;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import com.toedter.calendar.JCalendar;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
//import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

public class NewFirstPhase {

	private JFrame frame;
	private JTextField invoice_text;
	private JTextField batch_text;
	private JTextField weight_text;
	private JLabel error_label1;
	private JLabel error_label2;
	private JLabel error_label3; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewFirstPhase window = new NewFirstPhase();
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
	public NewFirstPhase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Connection con=null;
		frame = new JFrame();
		frame.setBounds(100, 100, 964, 1066);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 77, 922, 929);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel customer_label = new JLabel("Customer Name");
		customer_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		customer_label.setBounds(12, 140, 166, 27);
		panel.add(customer_label);
		
		JComboBox customer_combo = new JComboBox();
		customer_combo.setFont(new Font("Tahoma", Font.BOLD, 18));
		customer_combo.setForeground(new Color(0, 0, 0));
		customer_combo.setToolTipText("");
		customer_combo.setBounds(218, 139, 147, 28);
		panel.add(customer_combo);
		
		JLabel material_label = new JLabel("Material Grade");
		material_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		material_label.setBounds(12, 31, 166, 27);
		panel.add(material_label);
		
		JComboBox material_combo = new JComboBox();
		material_combo.setToolTipText("");
		material_combo.setForeground(Color.BLACK);
		material_combo.setFont(new Font("Tahoma", Font.BOLD, 18));
		material_combo.setBounds(218, 35, 147, 28);
		panel.add(material_combo);
		
		JComboBox width_combo = new JComboBox();
		width_combo.setToolTipText("");
		width_combo.setForeground(Color.BLACK);
		width_combo.setFont(new Font("Tahoma", Font.BOLD, 18));
		width_combo.setBounds(641, 139, 147, 28);
		panel.add(width_combo);
		
		JComboBox thickness_combo = new JComboBox();
		thickness_combo.setToolTipText("");
		thickness_combo.setForeground(Color.BLACK);
		thickness_combo.setFont(new Font("Tahoma", Font.BOLD, 18));
		thickness_combo.setBounds(641, 30, 147, 28);
		panel.add(thickness_combo);
		
//		JDateChooser dateChooser = new JDateChooser();
//		dateChooser.setBounds(218, 236, 147, 22);
//		panel.add(dateChooser);
//		
		JLabel date_label = new JLabel("Date of Recipt");
		date_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		date_label.setBounds(12, 245, 166, 27);
		panel.add(date_label);
		
		JButton submit_button = new JButton("Submit\r\n");
		submit_button.setFont(new Font("Tahoma", Font.BOLD, 18));
		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					if(batch_text.getText().isEmpty()|| invoice_text.getText().isEmpty()|| weight_text.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please Enter All the Fields");
					}
					else
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/naman","root","");
						System.out.println("Connection Established");
						String customer_name=(String) customer_combo.getSelectedItem();
						Long invoice_no=Long.parseLong(invoice_text.getText());
						Long batch_no=Long.parseLong(batch_text.getText());
						String m_grade=(String)material_combo.getSelectedItem();
						//Integer m_width=Integer.parseInt((String)width_combo.getSelectedItem());
						//Float m_thickness=Float.parseFloat((String)thickness_combo.getSelectedItem());
						Integer m_weight=Integer.parseInt(weight_text.getText());
						//DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
						//String str=df.format(dateChooser.getDate());
						//dateChooser.getDate();
						//System.out.println(str);
						//String material_width=(String) 
						
						//Integer material_width=Integer.parseInt();
						
						//System.out.println(customer_name);
						
						//=Double.parseDouble(textField_2.getText());
						//Double m_thickness=Double.parseDouble(textField_1.getText());
						//Double m_weight=Double.parseDouble(textField_3.getText());
						
					
						
						
						
						
						
					}
				
					
					
					
					
					
					
					//PreparedStatement ps=con.prepareStatement("insert into ")
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				
				
				
				//System.out.println(material_combo.getSelectedItem());
			}
		});
		submit_button.setBounds(276, 580, 97, 25);
		panel.add(submit_button);
		
		JLabel invoice_label = new JLabel("Invoice No");
		invoice_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		invoice_label.setBounds(12, 338, 166, 27);
		panel.add(invoice_label);
		
		invoice_text = new JTextField();
		invoice_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				try
				{
					Integer var_1=Integer.parseInt(invoice_text.getText());
					error_label1.setText("");
				}
				catch(Exception e1)
				{
					error_label1.setText("Invalid Input");
					e1.printStackTrace();
				}
				
				
			}
		});
//		invoice_text.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) 
//			{
//				try
//				{
//					Integer var_1=Integer.parseInt(invoice_text.getText());
//					error_label1.setText("");
//				}
//				catch(Exception e1)
//				{
//					error_label1.setText("Invalid Input");
//					e1.printStackTrace();
//				}
//				
//				
//			}
//		
//		});
		
		
		invoice_text.setBounds(218, 342, 147, 22);
		panel.add(invoice_text);
		invoice_text.setColumns(10);
		
		JLabel batch_label = new JLabel("Batch No");
		batch_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		batch_label.setBounds(12, 439, 166, 27);
		panel.add(batch_label);
		
		batch_text = new JTextField();
		batch_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				try
				{
					Integer var_2=Integer.parseInt(batch_text.getText());
					error_label2.setText("");
				}
				catch(Exception e1)
				{
					error_label2.setText("Invalid Input");
					e1.printStackTrace();
				}	
				
				
				
			}
		});
//		batch_text.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) 
//			{
//				try
//				{
//					Integer var_2=Integer.parseInt(batch_text.getText());
//					error_label2.setVisible(false);
//				}
//				catch(NumberFormatException e2)
//				{
//					error_label2.setVisible(true);
//					//e2.printStackTrace();
//				}
//				
//			}
//		});
		batch_text.setColumns(10);
		batch_text.setBounds(218, 443, 147, 22);
		panel.add(batch_text);
		
		JLabel thickness_label = new JLabel("Thickness");
		thickness_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		thickness_label.setBounds(475, 31, 166, 27);
		panel.add(thickness_label);
		
		
		
		JLabel width_label = new JLabel("Width");
		width_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		width_label.setBounds(475, 140, 166, 27);
		panel.add(width_label);
		
		
		JButton reset_button = new JButton("Reset");
		reset_button.setFont(new Font("Tahoma", Font.BOLD, 18));
		reset_button.setBounds(456, 580, 97, 25);
		panel.add(reset_button);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWeight.setBounds(475, 327, 166, 27);
		panel.add(lblWeight);
		
		weight_text = new JTextField();
		weight_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				try
				{
					Integer var_3=Integer.parseInt(weight_text.getText());
					error_label3.setText("");
				}
				catch(Exception e1)
				{
					error_label3.setText("Invalid Input");
					e1.printStackTrace();
				}
				
			}
		});
		weight_text.setColumns(10);
		weight_text.setBounds(641, 331, 147, 22);
		panel.add(weight_text);
		
		error_label1 = new JLabel("");
		error_label1.setForeground(Color.RED);
		error_label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		error_label1.setBounds(218, 366, 147, 16);
		//error_label1.setVisible(false);
		panel.add(error_label1);
		
		error_label2 = new JLabel("");
		error_label2.setForeground(Color.RED);
		error_label2.setFont(new Font("Tahoma", Font.BOLD, 16));
		error_label2.setBounds(218, 464, 147, 16);
		//error_label2.setVisible(false);
		panel.add(error_label2);
		
		error_label3 = new JLabel("");
		error_label3.setForeground(Color.RED);
		error_label3.setFont(new Font("Tahoma", Font.BOLD, 16));
		error_label3.setBounds(641, 355, 147, 16);
		//error_label3.setVisible(false);
		panel.add(error_label3);
		
		
		
		
		
		//comboBox.setSelectedItem(null);
		//comboBox.setModel(null);
		//comboBox.addItem("");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/master","root","");
			System.out.println("Connection Established");
			PreparedStatement ps1=con.prepareStatement("select customer_name from customer");
			PreparedStatement ps2=con.prepareStatement("select material_grade from material");
			PreparedStatement ps3=con.prepareStatement("select m_thickness from thickness");
			PreparedStatement ps4=con.prepareStatement("select m_width from width");
			ResultSet rs2=ps2.executeQuery();
			ResultSet rs1=ps1.executeQuery();
			ResultSet rs3=ps3.executeQuery();
			ResultSet rs4=ps4.executeQuery();
			ArrayList al1=new ArrayList();
			ArrayList al2=new ArrayList();
			ArrayList al3=new ArrayList();
			ArrayList al4=new ArrayList();
			while(rs1.next())
			{
				al1.add(rs1.getString(1));
			}
			while(rs2.next())
			{
				al2.add(rs2.getString(1));		
			}
			while(rs3.next())
			{
				al3.add(rs3.getFloat(1));
			}
			while(rs4.next())
			{
			al4.add(rs4.getInt(1));
			}
			Iterator it1=al1.iterator();
			Iterator it2=al2.iterator();
			Iterator it3=al3.iterator();
			Iterator it4=al4.iterator();
			while(it1.hasNext())
			{
				customer_combo.addItem(it1.next());
			}
			while(it2.hasNext())
			{
				material_combo.addItem(it2.next());
			}
		
			while(it3.hasNext())
			{
				thickness_combo.addItem(it3.next());
			}
		
			while(it4.hasNext())
			{
				width_combo.addItem(it4.next());
			}
			System.out.println("All Items added Successfully");
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}
}
