import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.*;
import java.awt.*;
public class Lucas extends JFrame {

	private JPanel contentPane;
	private JPanel pnInput;
	private JPanel pnList;
	private JPanel pnStatus;
	private JLabel lblNewLabel;
	private JButton btnRun;
	private JButton btnCancel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JProgressBar progressBar;
	private JLabel lblStatus;
	private Thread thread;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					Lucas frame = new Lucas();
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
	public Lucas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
//gets user input values 
		pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		pnInput.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblNewLabel = new JLabel("Number of row in Lucas series:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		pnInput.add(lblNewLabel);
//run button 
		btnRun = new JButton("Get sum of Lucas Series");
		btnRun.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskToDo longTask = new taskToDo();
				thread = new Thread(longTask);
				thread.start();

			}
		});
	//text field for the user lucases values 
		textField = new JTextField();
		pnInput.add(textField);
		textField.setColumns(5);

		pnInput.add(btnRun);
//cancel button 
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				btnRun.setEnabled(true);
				btnCancel.setEnabled(false);

			}
		});
		btnCancel.setEnabled(false);
		pnInput.add(btnCancel);

		pnList = new JPanel();
		contentPane.add(pnList, BorderLayout.CENTER);
		pnList.setLayout(null);
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(0, 0, 859, 353);
		pnList.add(scrollPane);

		// pnList.add(textArea, BorderLayout.NORTH);

		pnStatus = new JPanel();
		contentPane.add(pnStatus, BorderLayout.SOUTH);
		pnStatus.setLayout(new GridLayout(1, 2, 0, 0));
//progress bar for percentage done loading
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		pnStatus.add(progressBar);
		progressBar.setValue(0);
		
		lblStatus = new JLabel("Running...");
		pnStatus.add(lblStatus);
	}

	class taskToDo implements Runnable {
		
		int error=0;
		@Override
		public void run() {
			//saves lucases values
			ArrayList<Integer> lucases = new ArrayList<Integer>();
			//sets stop and run to buttons 
			btnRun.setEnabled(false);
			btnCancel.setEnabled(true);
			//shows running text before runnig program 
			lblStatus.setText("Running ...");
			textArea.setText("");
			progressBar.setValue(0);
			
			String userValue = textField.getText();
			if(userValue.matches("[a-zA-Z]{1,10000}")) {
				JOptionPane.showMessageDialog(null, "Enter valid input!", null, JOptionPane.INFORMATION_MESSAGE);
			}
			int value = Integer.parseInt(userValue);//converts userinput to int 
			
			try {
				int sum = 0;
				//limits values of user to 3 or 20 else sends error
				if(value>=3 && value<= 20 && !(userValue.matches("[a-zA-Z]{1,40}"))) 
				{	
						int a= 2;
						int b = 1;
						int temp = 0;
						sum = 1;
						//gets the fibonacci series printed 
						for(int i = 2; i<= value-1; i++) {
							textArea.append(a+"\n");
							temp = a+b;
							sum += temp;
							a= b;
							b= temp;
							//adds the lucases so that sum shows in process bar
							lucases.add(sum);
						try {
							Thread.sleep(500);//slows down the values 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						progressBar.setVisible(true);
						progressBar.setValue((i + 1) * 100 / value); //calculates precentage
						lblStatus.setText("Sum = "+sum);//shows sum in right of process bar
					}
					textArea.append(a+"\n");
					
					btnRun.setEnabled(true);
					btnCancel.setEnabled(false);
					
				}
				throw new Exception();
				
			}catch(Exception a)
			{
				//catches error if unavailable input
				if(!(value>=3 && value<= 20 ))
				{
					error++;
				}
	
			}finally {
				//shows error when more than one error 
				if(error>=1) {//pops message error when incorrect format or not in limit 
					JOptionPane.showMessageDialog(null, "Enter valid input!", null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}

	}

}
