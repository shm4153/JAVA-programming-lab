package practice10;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Random;
import java.awt.event.ActionEvent;
public class MainGUI extends JFrame {

	private JPanel contentPane;//c
	private JPanel pnInput;//c
	private JLabel panel;//c
	private JTextField textField;//c
	private JButton btnRun;//c
	private JButton btnCancel;//c
	private JScrollPane txtArea;//c
	private JPanel pnList;//pnStatus
	private JPanel pnStatus;
	private JLabel lblStatus;//c
	private JTextArea textArea;
	private JProgressBar progressBar;//c
	private Thread thread;//c
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		
		panel = new JLabel("Input a number");
		pnInput.add(panel);
		
		textField = new JTextField();
		pnInput.add(textField);
		textField.setColumns(10);
		
		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userInput = Integer.parseInt(textField.getText());
				taskToDo longTask = new taskToDo();
				thread = new Thread(longTask);
				
				thread.start();
			}
		});
		
		pnInput.add(btnRun);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				btnRun.setEnabled(true);
				btnCancel.setEnabled(false);
				
			}
		});
		
		btnCancel.setEnabled(false);
		pnInput.add(btnCancel);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		pnList = new JPanel();
		contentPane.add(pnList, BorderLayout.CENTER);
		pnList.setLayout(new BorderLayout(0,0));
		textArea = new JTextArea();
		txtArea = new JScrollPane(textArea);
		pnList.add(txtArea);
		
		pnStatus = new JPanel();
		contentPane.add(pnStatus, BorderLayout.SOUTH);
		pnStatus.setLayout(new GridLayout(1,2,0,0));
		
		progressBar = new JProgressBar();
		pnStatus.add(progressBar);
		
		lblStatus = new JLabel("...");
		pnStatus.add(lblStatus);
		
		
	}
	
	class slowTask implements Runnable{

		@Override
		public void run() {
			btnCancel.setEnabled(false);
			btnRun.setEnabled(true);
			lblStatus.setText("Running...");
			textArea.setText("");
			progressBar.setValue(0);
			
			int number =Integer.parseInt(textField.getText());
			Random random = new Random();
			for (int i = 1; i <= number; i++) {
				textArea.append(random.nextInt()+"\n");
				progressBar.setValue((i)*100/number);
			}
			try { 
				Thread.sleep(500);
				
			} catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			
			progressBar.setValue((i+1)*100/number);
			
			//add more code heree

			btnCancel.setEnabled(false);
			btnRun.setEnabled(true);
			lblStatus.setText("Finished");
		}
		
	}

}
