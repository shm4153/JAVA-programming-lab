package assignment4;

import java.awt.*;


import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class applicationSKKU extends JFrame {
	private JTextField degree;
	private JTextField GPAfield;
	private JLabel lblname;
	private JLabel lblbirthdate;
	private JLabel lblemail;
	private JLabel lbldegree;
	private JLabel lbluniveristy;
	private JLabel lblGPA;
	private JLabel lblstatement;
	private JLabel titlelabel;
	private JLabel background;
	private JLabel lbladdress;
	private JButton submitionbutton;
	private JTextField pstatementField;
	private JTextField addressField;
	private JLabel lblPhoneNumber;
	private JLabel lblGender;
	private JTextField nameField;
	private JTextField birthField;
	private JTextField emailField;
	private JTextField degreeField;
	private JTextField attendField;
	private JTextField gpaField;
	private JTextField numberField;
	private JTextField genderField;
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					applicationSKKU frame = new applicationSKKU();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public applicationSKKU() 
	{
		setForeground(new Color(255, 240, 245));
		setBackground(new Color(240, 255, 240));	
	
		
		getContentPane().setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 683);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		//degree content pane background
		degree = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, degree, 384, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, degree, -318, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, degree, -52, SpringLayout.EAST, getContentPane());
		getContentPane().add(degree);
		degree.setColumns(10);
		
		//gpa field. content pane for gpa of user
		GPAfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, GPAfield, 393, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, GPAfield, 516, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, GPAfield, -56, SpringLayout.NORTH, degree);
		springLayout.putConstraint(SpringLayout.EAST, GPAfield, -52, SpringLayout.EAST, getContentPane());
		getContentPane().add(GPAfield);
		GPAfield.setColumns(10);
		
		//name label
		lblname = new JLabel("Applicant Name:");
		springLayout.putConstraint(SpringLayout.NORTH, lblname, 115, SpringLayout.NORTH, getContentPane());
		lblname.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblname);
		
		//birth date label
		lblbirthdate = new JLabel("Birth Date:");
		springLayout.putConstraint(SpringLayout.NORTH, lblbirthdate, 26, SpringLayout.SOUTH, lblname);
		springLayout.putConstraint(SpringLayout.EAST, lblbirthdate, -370, SpringLayout.EAST, getContentPane());
		lblbirthdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblbirthdate);
		
		//email label
		lblemail = new JLabel("Email:");
		springLayout.putConstraint(SpringLayout.SOUTH, lblemail, -434, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblemail, -372, SpringLayout.EAST, getContentPane());
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblemail);
		
		//degree label
		lbldegree = new JLabel("Degree:");
		springLayout.putConstraint(SpringLayout.NORTH, lbldegree, 232, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbldegree, -377, SpringLayout.EAST, getContentPane());
		lbldegree.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lbldegree);
		
		//attend graduate label 
		lbluniveristy = new JLabel("Attend university (for Graduates):");
		springLayout.putConstraint(SpringLayout.NORTH, lbluniveristy, 17, SpringLayout.SOUTH, lbldegree);
		springLayout.putConstraint(SpringLayout.WEST, lbluniveristy, 317, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbluniveristy, -372, SpringLayout.EAST, getContentPane());
		lbluniveristy.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(lbluniveristy);
		
		//GPA label
		lblGPA = new JLabel("GPA (for Graduates):");
		springLayout.putConstraint(SpringLayout.NORTH, lblGPA, 25, SpringLayout.SOUTH, lbluniveristy);
		springLayout.putConstraint(SpringLayout.EAST, lblGPA, -370, SpringLayout.EAST, getContentPane());
		lblGPA.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblGPA);
		
		//personal statement label
		lblstatement = new JLabel("Personal Statement");
		lblstatement.setBackground(new Color(245, 255, 250));
		springLayout.putConstraint(SpringLayout.WEST, lblstatement, 0, SpringLayout.WEST, lblemail);
		springLayout.putConstraint(SpringLayout.EAST, lblstatement, -252, SpringLayout.EAST, getContentPane());
		lblstatement.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblstatement);
		
		//title label
		titlelabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, titlelabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, titlelabel, -6, SpringLayout.NORTH, lblname);
		getContentPane().add(titlelabel);
		titlelabel.setIcon(new ImageIcon(this.getClass().getResource("title_label.png")));
		
		//background label
		background = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, titlelabel, 98, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.WEST, lblname, 105, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.WEST, degree, 212, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.NORTH, background, 28, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, background, 20, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, background, -6, SpringLayout.WEST, lbluniveristy);
		getContentPane().add(background);
		background.setIcon(new ImageIcon(this.getClass().getResource("skku_wallpaper.png")));
		
		//applicant personal statement field place
		pstatementField = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, titlelabel, 0, SpringLayout.EAST, pstatementField);
		springLayout.putConstraint(SpringLayout.WEST, pstatementField, 15, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.EAST, pstatementField, -42, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblstatement, -12, SpringLayout.NORTH, pstatementField);
		springLayout.putConstraint(SpringLayout.NORTH, pstatementField, 439, SpringLayout.NORTH, getContentPane());
		pstatementField.setFont(new Font("Tahoma", Font.ITALIC, 10));
		pstatementField.setForeground(SystemColor.activeCaptionText);
		pstatementField.setBackground(SystemColor.text);
		pstatementField.setColumns(10);
		getContentPane().add(pstatementField);
	
		//name field
		nameField = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblname, -1, SpringLayout.WEST, nameField);
		nameField.setForeground(SystemColor.activeCaptionText);
		nameField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, lblname);
		springLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, degree);
		nameField.setColumns(10);
		getContentPane().add(nameField);
		
		//address field where user input info
		addressField = new JTextField();
		addressField.setForeground(SystemColor.activeCaptionText);
		addressField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.SOUTH, pstatementField, -20, SpringLayout.NORTH, addressField);
		springLayout.putConstraint(SpringLayout.NORTH, addressField, 533, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, addressField, 0, SpringLayout.WEST, lblbirthdate);
		springLayout.putConstraint(SpringLayout.EAST, addressField, -42, SpringLayout.EAST, getContentPane());
		addressField.setColumns(10);
		getContentPane().add(addressField);
		
		//phone number label
		lblPhoneNumber = new JLabel("Phone number (+82):");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhoneNumber, 16, SpringLayout.SOUTH, lblGPA);
		springLayout.putConstraint(SpringLayout.WEST, lblGPA, 0, SpringLayout.WEST, lblPhoneNumber);
		springLayout.putConstraint(SpringLayout.EAST, lblPhoneNumber, 0, SpringLayout.EAST, lblemail);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblPhoneNumber);
		
		//gender label 
		lblGender = new JLabel("Gender (F/M):");
		springLayout.putConstraint(SpringLayout.NORTH, lblGender, 23, SpringLayout.SOUTH, lblPhoneNumber);
		springLayout.putConstraint(SpringLayout.EAST, lblGender, -372, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblbirthdate, 17, SpringLayout.WEST, lblGender);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblGender);
		
		//address label
		lbladdress = new JLabel("Home Address:");
		springLayout.putConstraint(SpringLayout.NORTH, lbladdress, 21, SpringLayout.SOUTH, pstatementField);
		springLayout.putConstraint(SpringLayout.WEST, lbladdress, 15, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.EAST, lbladdress, -26, SpringLayout.WEST, addressField);
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lbladdress);
		//birthday field
		birthField = new JTextField();
		birthField.setForeground(SystemColor.activeCaptionText);
		birthField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.WEST, birthField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.SOUTH, birthField, 0, SpringLayout.SOUTH, lblbirthdate);
		springLayout.putConstraint(SpringLayout.EAST, birthField, 0, SpringLayout.EAST, degree);
		birthField.setColumns(10);
		getContentPane().add(birthField);
		
		//email field
		emailField = new JTextField();
		emailField.setForeground(SystemColor.activeCaptionText);
		emailField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.WEST, emailField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.SOUTH, emailField, 0, SpringLayout.SOUTH, lblemail);
		springLayout.putConstraint(SpringLayout.EAST, emailField, 0, SpringLayout.EAST, degree);
		emailField.setColumns(10);
		getContentPane().add(emailField);
		
		//degree field
		degreeField = new JTextField();
		degreeField.setForeground(SystemColor.activeCaptionText);
		degreeField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.NORTH, degreeField, 0, SpringLayout.NORTH, lbldegree);
		springLayout.putConstraint(SpringLayout.WEST, degreeField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.EAST, degreeField, 0, SpringLayout.EAST, degree);
		degreeField.setColumns(10);
		getContentPane().add(degreeField);
		
		//graduates field
		attendField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, attendField, 523, SpringLayout.WEST, getContentPane());
		attendField.setForeground(SystemColor.activeCaptionText);
		attendField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.NORTH, attendField, 0, SpringLayout.NORTH, lbluniveristy);
		springLayout.putConstraint(SpringLayout.EAST, attendField, 0, SpringLayout.EAST, degree);
		attendField.setColumns(10);
		getContentPane().add(attendField);
		
		//gpa field
		gpaField = new JTextField();
		gpaField.setForeground(SystemColor.activeCaptionText);
		gpaField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.WEST, gpaField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.SOUTH, gpaField, 0, SpringLayout.SOUTH, lblGPA);
		springLayout.putConstraint(SpringLayout.EAST, gpaField, 0, SpringLayout.EAST, degree);
		gpaField.setColumns(10);
		getContentPane().add(gpaField);
		
		//phone number field
		numberField = new JTextField();
		numberField.setForeground(SystemColor.activeCaptionText);
		numberField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, degree);
		springLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, degree);
		numberField.setColumns(10);
		getContentPane().add(numberField);
		
		//gender field
		genderField = new JTextField();
		genderField.setForeground(SystemColor.activeCaptionText);
		genderField.setBackground(SystemColor.text);
		springLayout.putConstraint(SpringLayout.WEST, genderField, 0, SpringLayout.WEST, degree);
		springLayout.putConstraint(SpringLayout.SOUTH, genderField, -6, SpringLayout.NORTH, GPAfield);
		springLayout.putConstraint(SpringLayout.EAST, genderField, 0, SpringLayout.EAST, degree);
		genderField.setColumns(10);
		getContentPane().add(genderField);
		
		// submition button
		submitionbutton = new JButton("Submition Application");
		springLayout.putConstraint(SpringLayout.WEST, submitionbutton, 39, SpringLayout.EAST, background);
		springLayout.putConstraint(SpringLayout.SOUTH, background, 0, SpringLayout.SOUTH, submitionbutton);
		submitionbutton.setForeground(new Color(255, 255, 255));
		submitionbutton.setBackground(new Color(0, 0, 139));
		springLayout.putConstraint(SpringLayout.NORTH, submitionbutton, -51, SpringLayout.SOUTH, getContentPane());
		submitionbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> errors = new ArrayList<String>();
				
					//name 
					String name = nameField.getText();
					//birth
					String birthday = birthField.getText();
					//email
					String email = emailField.getText(); 
					//degree if graduate
					String degree = degreeField.getText();
						//if graduate check attended uni and gpa 
					//attended university
					//gpa of graduate
					String attendance = attendField.getText();
					String gpa = gpaField.getText();
					//personal statement
					String statement = pstatementField.getText();
					//phone number
					String pnumber= numberField.getText();
					//gender
					String gender = genderField.getText();
					//home address
					String address = addressField.getText();
					
					try {
						
						//checks if there is a missing name or surname
						if(name.matches("[a-zA-Z]{1,40}+ +[a-zA-Z]{1,40}"))
						{
							nameField.setForeground(Color.black);
						}
						
						//checks if birthday is in correct format
						if(birthday.matches("[0-9]{2}+/+[0-9]{2}+/+[0-9]{4}"))
						{
							birthField.setForeground(Color.black);
						}
						
						//checks if emails is in correct format
						if(email.matches("[a-zA-Z0-9]+@+[a-zA-Z]{1,40}+.+[a-zA-Z]{1,10}")) {
							emailField.setForeground(Color.black);
						}
						
						//checks if degree was written 
						if(degree.contains("PhD"))
						{
							
							//checks if attendance was written correctly when graduate
							if(!(attendance.equals("")))
							{
								attendField.setForeground(Color.black);
							}
							
							//checks gpa format is correct
							
							else if(gpa.matches("[0-4]{1}+.+[0-5]{1}"))
							{
			
								gpaField.setForeground(Color.black);
							}
						}
						
						//checks phone number was written correctly
						if(pnumber.matches("[0-9]{3}+ +[0-9]{4}+-+[0-9]{4}"))
						{
							numberField.setForeground(Color.black);
						}
						
						//checks gender field was written correctly
						if(gender.matches("[MFmf]"))
						{	
							genderField.setForeground(Color.black);
						}
						
						//checks address field was written correctly
						if(address.matches("[0-9]+, +[a-zA-Z]{1,40}+, +[a-zA-Z]{1,40}+, +[a-zA-Z]{1,40}"))
						{
							addressField.setForeground(Color.black);
						}
						
						throw new Exception();
						
					}catch(Exception a)
					{
						//catches if incorrectly missing name or surname
						if(!(name.matches("[a-zA-Z]{1,40}+ +[a-zA-Z]{1,40}")))
						{
							nameField.setForeground(Color.red);
							if(name.equals(""))
							{
								errors.add("You forgot to fill the name text field, Please fill it");
							}
							if(!(name.matches("[a-zA-Z]{1,40}")))
							{
								//checks if user didn't input anything in the name field
								errors.add("You forgot to write your name or surname.");
							}
						}
						
						//catches if user input incorrectly their birth date in the correct format
						if(!(birthday.matches("[0-9]{2}+/+[0-9]{2}+/+[0-9]{4}"))){
							birthField.setForeground(Color.red);
							if(birthday.equals(""))
							{
								errors.add("You forgot to fill the birth date field, Please fill it");
							}
							else {
								errors.add("Birth date must be in '06/06/1995' format");
							}
						}
						
						//catches wrong email format 
						if(!(email.matches("[a-zA-Z0-9]+@+[a-zA-Z]{1,40}+.+[a-zA-Z]{1,10}"))) {
							emailField.setForeground(Color.red);
							if(email.equals("")) {
								errors.add("You forgot to fill the email field, Please fill it");
							}
							else {
								errors.add("Email must be in example@some.some");
							}
						}
						
						
						//catches wrong degree format for when written PhD
						if(degree.contains("PhD"))
						{
			
							//catches wrong attendance
							
							if(attendance.equals("") || gpa.equals(""))
							{
								errors.add("For graduate, you have to enter previous university and GPA");
							}
							
							//catches wrong gpa format is correct
	
							else if(!(gpa.matches("[0-4]{1}+.+[0-5]{1}")||gpa.matches("0")))
							{
								gpaField.setForeground(Color.red);
								errors.add("GPA must be between 0 and 4.5");
							}
						
						}
						//catches wrong if degree was left blank 
						else if(degree.equals("")) {
							degreeField.setForeground(Color.red);
							errors.add("Enter a degree you are getting");
						}
						
						//catches when wrong gender format
						if(!(gender.matches("[MFmf]")))
						{
							genderField.setForeground(Color.red);
							errors.add("Invalid format. Type M or F");
						}
						else if(gender.equals("")) {
							errors.add("You forgot to fill the gender field, Please fill it");
						}
							
						//catches wrong phone number format
						if(!(pnumber.matches("[0-9]{3}+ +[0-9]{4}+-+[0-9]{4}")))
						{
							numberField.setForeground(Color.red);
							errors.add("Proper format for a phone number is 010 2158-0200");
						}
						
						//catches when personal statement was wrong
						String[] swords = statement.split("\\s+");
						int pswordscount = swords.length;
						
						if(pswordscount < 100)
						{
							pstatementField.setForeground(Color.red);
							errors.add("Your Personal Statement must be at least 100 words");
						}
						
					}
					finally 
					{
						Object[] objects = errors.toArray();
						String str = "";
						
						//returns success message if all info is correct
						if(objects.length == 0) 
						{
							JOptionPane.showMessageDialog(null, "Succesfully Submitted", null, JOptionPane.INFORMATION_MESSAGE);
						}
						else if (objects.length > 0) 
						{
							//pops message of errors that have to be fixed with numbered list
							for(int i = 1; i<objects.length+1; i++)
							{
								str =str+i+". "+objects[i-1]+"\n";
							}
							JOptionPane.showMessageDialog(null, str, null, JOptionPane.ERROR_MESSAGE);
						}
					}
				
			}
		});
			
		springLayout.putConstraint(SpringLayout.SOUTH, submitionbutton, -23, SpringLayout.SOUTH, getContentPane());
		submitionbutton.setFont(new Font("Tahoma", Font.BOLD, 10));
		getContentPane().add(submitionbutton);
	}
}