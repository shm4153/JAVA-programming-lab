package finalproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnWhatsYourName;
	private JTextField nameField;
	private JTextPane txtpnName;
	private JTextPane txtpnGender;
	private JButton nextbutton;
	private JTextField genderField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 242, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnWhatsYourName = new JTextPane();
		txtpnWhatsYourName.setText("What's your name and gender?");
		txtpnWhatsYourName.setBounds(29, 102, 271, 29);
		contentPane.add(txtpnWhatsYourName);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(224, 169, 96, 19);
		contentPane.add(nameField);
		
		txtpnName = new JTextPane();
		txtpnName.setText("Name:");
		txtpnName.setBounds(29, 156, 161, 29);
		contentPane.add(txtpnName);
		
		txtpnGender = new JTextPane();
		txtpnGender.setText("Gender (f/m):");
		txtpnGender.setBounds(29, 221, 161, 29);
		contentPane.add(txtpnGender);
		
		nextbutton = new JButton("Next");
		nextbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> errors = new ArrayList<String>();
				//name
				String name = nameField.getText();
				//gender
				String gender = genderField.getText();
				//changes integer from string
				
				try {
					if(name.matches("[a-zA-Z]{1,40}+ +[a-zA-Z]{1,40}"))
					{
						nameField.setForeground(Color.black);
					}
					
					if(gender.matches("[MFmf]"))
					{
						nameField.setForeground(Color.black);
					}
					
					throw new Exception();
					
				} catch(Exception a) {
					if(!(name.matches("[a-zA-Z]{1,40}+ +[a-zA-Z]{1,40}"))) {
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
					
					if(!(gender.matches("[MFmf]"))) {
						genderField.setForeground(Color.red);
						errors.add("Invalid format. Type M or F");
					}
					else if(gender.equals("")) {
						errors.add("You forgot to fill the gender field, Please fill it");
					}
				}
				finally {
					Object[] objects = errors.toArray();
					String str = "";
					
					//returns success message if all info is correct
					if(objects.length == 0) 
					{
						weather weather = new weather();
						weather.setVisible(true);
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
		nextbutton.setBounds(269, 420, 85, 21);
		contentPane.add(nextbutton);
		
		genderField = new JTextField();
		genderField.setColumns(10);
		genderField.setBounds(224, 234, 96, 19);
		contentPane.add(genderField);
	}
}
