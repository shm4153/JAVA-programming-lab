import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swings.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList; 

public class tripplanner extends JFrame 
{
	private JPanel contentPane;
	private JButton taxibutton;
	private JButton trainbutton;
	private JButton busbutton;
	private JButton yesbutton;
	private JButton nobutton;
	private JButton cancel;
	private JButton clear;
	private JButton enter;
	private JButton button3;
	private JButton button2;
	private JButton button1;
	private JButton button6;
	private JButton button5;
	private JButton button4;
	private JButton button9;
	private JButton button8;
	private JButton button7;
	private JButton button0;
	private JTextPane textField;
	private JTextPane txtpnTripPlanner;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tripplanner frame = new tripplanner();
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
	public tripplanner()
	{
		ArrayList<Integer> inputs = new ArrayList<>();
		setTitle("Trip Planner"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		taxibutton = new JButton("TAXI");
		Image taxiimg = new ImageIcon(this.getClass().getResource("/taxi.png")).getImage();
		taxibutton.setIcon(new ImageIcon(taxiimg));
		sl_contentPane.putConstraint(SpringLayout.WEST, taxibutton, 17, SpringLayout.WEST, contentPane);
		Image taxiImg = new ImageIcon(this.getClass().getResource("/taxi.png")).getImage();
		taxibutton.setIcon(new ImageIcon(taxiImg));
		
		taxibutton.setHorizontalAlignment(SwingConstants.LEFT);
		taxibutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("You choose Taxi\n Enter base fare: ");
				Taxi taxi = new Taxi();
				String text = textField.getText(); 
				int fareTaxi = Integer.parseInt(text.replaceAll("[0-9]"," ")).add(taxi.setFarePerKm(opacity));
			}
		});
		
		taxibutton.setBackground(new Color(128, 128, 128));
		taxibutton.setForeground(new Color(0, 0, 0));
		taxibutton.setFont(taxibutton.getFont().deriveFont(taxibutton.getFont().getStyle() | Font.BOLD));
		contentPane.add(taxibutton);
		
		trainbutton = new JButton("TRAIN");
		Image trainimg = new ImageIcon(this.getClass().getResource("/train.png")).getImage();
		trainbutton.setIcon(new ImageIcon(trainimg));
		sl_contentPane.putConstraint(SpringLayout.EAST, taxibutton, 0, SpringLayout.EAST, trainbutton);
		trainbutton.setHorizontalAlignment(SwingConstants.LEFT);
		trainbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("You choose Train:\n Enter base fare: ");
				Train train = new Train(); 
			
			}
		});
		
		trainbutton.setBackground(new Color(128, 128, 128));
		trainbutton.setForeground(Color.BLACK);
		trainbutton.setFont(trainbutton.getFont().deriveFont(trainbutton.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, trainbutton, 158, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, trainbutton, 17, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, trainbutton, 115, SpringLayout.WEST, contentPane);
		contentPane.add(trainbutton);
		
		busbutton = new JButton("BUS");
		Image busimg = new ImageIcon(this.getClass().getResource("/bus.png")).getImage();
		busbutton.setIcon(new ImageIcon(busimg));
		sl_contentPane.putConstraint(SpringLayout.NORTH, taxibutton, 6, SpringLayout.SOUTH, busbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, taxibutton, 40, SpringLayout.SOUTH, busbutton);
		Image busImg = new ImageIcon(this.getClass().getResource("/bus.png")).getImage();
		busbutton.setIcon(new ImageIcon(busImg));
		busbutton.setHorizontalAlignment(SwingConstants.LEFT);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, busbutton, -382, SpringLayout.SOUTH, contentPane);
		busbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("You choose Bus\n Enter base fare:");
				Bus bus = new Bus();
			}
		});
		
		busbutton.setBackground(new Color(128, 128, 128));
		busbutton.setForeground(new Color(0, 0, 0));
		busbutton.setFont(busbutton.getFont().deriveFont(busbutton.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, busbutton, 198, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, trainbutton, -6, SpringLayout.NORTH, busbutton);
		sl_contentPane.putConstraint(SpringLayout.WEST, busbutton, 17, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, busbutton, -474, SpringLayout.EAST, contentPane);
		contentPane.add(busbutton);
		
		
		yesbutton = new JButton("Yes");
		Image checkImg = new ImageIcon(this.getClass().getResource("/enterSmall.png")).getImage();
		yesbutton.setIcon(new ImageIcon(checkImg));
		yesbutton.setBackground(new Color(128, 128, 128));
		yesbutton.setFont(yesbutton.getFont().deriveFont(yesbutton.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, yesbutton, 151, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, yesbutton, -206, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, yesbutton, -49, SpringLayout.EAST, contentPane);
		contentPane.add(yesbutton);
		
		nobutton = new JButton("No");
		Image noImg = new ImageIcon(this.getClass().getResource("/cancelSmall.png")).getImage();
		nobutton.setIcon(new ImageIcon(noImg));
		nobutton.setBackground(new Color(128, 128, 128));
		nobutton.setFont(nobutton.getFont().deriveFont(nobutton.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, nobutton, 193, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, yesbutton, -3, SpringLayout.NORTH, nobutton);
		sl_contentPane.putConstraint(SpringLayout.WEST, nobutton, 0, SpringLayout.WEST, yesbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, nobutton, -382, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, nobutton, 0, SpringLayout.EAST, yesbutton);
		contentPane.add(nobutton);
		
		cancel = new JButton("CANCEL");
		Image bigCancelimg = new ImageIcon(this.getClass().getResource("cancel.png")).getImage();
		cancel.setIcon(new ImageIcon(bigCancelimg));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Cancelled\n New plan:\n Choose transport(from left menu): ");
			}
		});
		
		cancel.setBackground(new Color(128, 128, 128));
		cancel.setFont(cancel.getFont().deriveFont(cancel.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, cancel, 320, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, cancel, 0, SpringLayout.WEST, yesbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cancel, 155, SpringLayout.SOUTH, nobutton);
		sl_contentPane.putConstraint(SpringLayout.EAST, cancel, -49, SpringLayout.EAST, contentPane);
		contentPane.add(cancel);
		
		clear = new JButton("CLEAR");
		Image clearimg = new ImageIcon(this.getClass().getResource("/clear.png")).getImage();
		clear.setIcon(new ImageIcon(clearimg));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		
		clear.setBackground(new Color(128, 128, 128));
		clear.setFont(clear.getFont().deriveFont(clear.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, clear, 6, SpringLayout.SOUTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.WEST, clear, 0, SpringLayout.WEST, yesbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, clear, 73, SpringLayout.SOUTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.EAST, clear, 157, SpringLayout.WEST, yesbutton);
		contentPane.add(clear);
		
		enter = new JButton("ENTER");
		Image enterimg = new ImageIcon(this.getClass().getResource("/enter.png")).getImage();
		enter.setIcon(new ImageIcon(enterimg));
		enter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String enteredV = textField.getText();
				textField.setText("Enter fare per station: ");
				int pin = Integer.parseInt(enteredV.replaceAll("[0-9]",""));
			}
		});
		
		enter.setBackground(new Color(128, 128, 128));
		enter.setFont(enter.getFont().deriveFont(enter.getFont().getStyle() | Font.BOLD));
		sl_contentPane.putConstraint(SpringLayout.NORTH, enter, 6, SpringLayout.SOUTH, clear);
		sl_contentPane.putConstraint(SpringLayout.WEST, enter, 0, SpringLayout.WEST, yesbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, enter, 73, SpringLayout.SOUTH, clear);
		sl_contentPane.putConstraint(SpringLayout.EAST, enter, 157, SpringLayout.WEST, yesbutton);
		contentPane.add(enter);
		
		button3 = new JButton("");
		Image threeimg = new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		button3.setIcon(new ImageIcon(threeimg));
		sl_contentPane.putConstraint(SpringLayout.WEST, button3, -89, SpringLayout.WEST, cancel);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button3.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button3, 0, SpringLayout.NORTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button3, 0, SpringLayout.SOUTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.EAST, button3, -6, SpringLayout.WEST, cancel);
		contentPane.add(button3);
		
		button2 = new JButton();
		Image twoimg = new ImageIcon(this.getClass().getResource("/2.png")).getImage();
		button2.setIcon(new ImageIcon(twoimg));
		sl_contentPane.putConstraint(SpringLayout.EAST, button2, -8, SpringLayout.WEST, button3);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button2.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button2, 0, SpringLayout.NORTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button2, 0, SpringLayout.SOUTH, cancel);
		contentPane.add(button2);
		
		button1 = new JButton("");
		Image oneimg = new ImageIcon(this.getClass().getResource("/1.png")).getImage();
		button1.setIcon(new ImageIcon(oneimg));
		sl_contentPane.putConstraint(SpringLayout.WEST, button1, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button1, -396, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, button2, 3, SpringLayout.EAST, button1);
		button1.setBackground(new Color(128, 128, 128));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, button1, 0, SpringLayout.NORTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button1, 67, SpringLayout.NORTH, cancel);
		contentPane.add(button1);
		
		button6 = new JButton("");
		Image siximg = new ImageIcon(this.getClass().getResource("/6.png")).getImage();
		button6.setIcon(new ImageIcon(siximg));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"6");
			}
		});
		
		sl_contentPane.putConstraint(SpringLayout.WEST, button6, 0, SpringLayout.WEST, button3);
		sl_contentPane.putConstraint(SpringLayout.EAST, button6, -6, SpringLayout.WEST, clear);
		button6.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button6, 6, SpringLayout.SOUTH, cancel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button6, 0, SpringLayout.SOUTH, clear);
		contentPane.add(button6);
		
		button5 = new JButton("");
		Image fiveimg = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
		button5.setIcon(new ImageIcon(fiveimg));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		
		sl_contentPane.putConstraint(SpringLayout.WEST, button5, 3, SpringLayout.WEST, button2);
		sl_contentPane.putConstraint(SpringLayout.EAST, button5, -8, SpringLayout.WEST, button6);
		button5.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button5, 0, SpringLayout.NORTH, clear);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button5, 67, SpringLayout.NORTH, clear);
		contentPane.add(button5);
		
		button4 = new JButton("");
		Image fourimg = new ImageIcon(this.getClass().getResource("/4.png")).getImage();
		button4.setIcon(new ImageIcon(fourimg));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button4, 0, SpringLayout.NORTH, clear);
		sl_contentPane.putConstraint(SpringLayout.WEST, button4, 0, SpringLayout.WEST, button1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button4, 0, SpringLayout.SOUTH, clear);
		sl_contentPane.putConstraint(SpringLayout.EAST, button4, 0, SpringLayout.EAST, button1);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button4.setBackground(new Color(128, 128, 128));
		contentPane.add(button4);
		
		button9 = new JButton("");
		Image nineimg = new ImageIcon(this.getClass().getResource("/9.png")).getImage();
		button9.setIcon(new ImageIcon(nineimg));
		sl_contentPane.putConstraint(SpringLayout.WEST, button9, 0, SpringLayout.WEST, button3);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button9.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button9, 0, SpringLayout.NORTH, enter);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button9, 0, SpringLayout.SOUTH, enter);
		sl_contentPane.putConstraint(SpringLayout.EAST, button9, -6, SpringLayout.WEST, enter);
		contentPane.add(button9);
		
		button8 = new JButton("");
		Image eightimg = new ImageIcon(this.getClass().getResource("/8.png")).getImage();
		button8.setIcon(new ImageIcon(eightimg));
		sl_contentPane.putConstraint(SpringLayout.EAST, button8, 0, SpringLayout.EAST, button2);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		
		button8.setBackground(new Color(128, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button8, 0, SpringLayout.NORTH, enter);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button8, 0, SpringLayout.SOUTH, enter);
		contentPane.add(button8);
		
		button7 = new JButton("");
		Image sevenimg = new ImageIcon(this.getClass().getResource("/7.png")).getImage();
		button7.setIcon(new ImageIcon(sevenimg));
		sl_contentPane.putConstraint(SpringLayout.WEST, button8, 7, SpringLayout.EAST, button7);
		sl_contentPane.putConstraint(SpringLayout.NORTH, button7, 0, SpringLayout.NORTH, enter);
		sl_contentPane.putConstraint(SpringLayout.WEST, button7, 0, SpringLayout.WEST, button1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button7, 67, SpringLayout.NORTH, enter);
		sl_contentPane.putConstraint(SpringLayout.EAST, button7, 0, SpringLayout.EAST, button1);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"7");
			}
		});
		button7.setBackground(new Color(128, 128, 128));
		contentPane.add(button7);
		
		button0 = new JButton("");
		Image zeroimg = new ImageIcon(this.getClass().getResource("/0.png")).getImage();
		button0.setIcon(new ImageIcon(zeroimg));
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, button0, 6, SpringLayout.SOUTH, button8);
		sl_contentPane.putConstraint(SpringLayout.WEST, button0, 0, SpringLayout.WEST, button5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button0, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button0, 0, SpringLayout.EAST, button2);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		
		button0.setBackground(new Color(128, 128, 128));
		contentPane.add(button0);
		
		textField = new JTextPane();
		textField.setText("Choose transport (from left menu): ");
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, trainbutton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -14, SpringLayout.NORTH, button2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -11, SpringLayout.WEST, yesbutton);
		textField.setForeground(new Color(128, 128, 128));
		contentPane.add(textField);
		
		txtpnTripPlanner = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnTripPlanner, -501, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, txtpnTripPlanner);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnTripPlanner, 253, SpringLayout.WEST, contentPane);
		txtpnTripPlanner.setFont(txtpnTripPlanner.getFont().deriveFont(txtpnTripPlanner.getFont().getStyle() | Font.BOLD));
		txtpnTripPlanner.setBackground(new Color(240, 240, 240));
		txtpnTripPlanner.setText("TRIP PLANNER");
		contentPane.add(txtpnTripPlanner);
		
		lblNewLabel = new JLabel(" ");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 506, SpringLayout.WEST, contentPane);
		Image mapimg = new ImageIcon(this.getClass().getResource("/planner_logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(mapimg));
	 	
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 60, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 79, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel);
		
	}
}
		

	
	

