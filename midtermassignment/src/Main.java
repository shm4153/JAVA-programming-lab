import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {
	// fields
	// fields for the GUI
	private JPanel mainPane;
	private JLabel plannerLogoLabel;
	private JPanel buttonPanel;
	private JLabel headerName;
	private JPanel transportTypePanel;
	private JButton trainButton;
	private JButton busButton;
	private JButton taxiButton;
	private JPanel YesNoPanel;
	private JButton YesButton;
	private JButton NoButton;
	private JTextArea OutputText;
	private JPanel NumberPanel;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton cancelButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton clearButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton enterButton;
	private JButton zeroButton;
	private JButton twoZeroButton;
	private JButton threeZeroButton;
	// arraylist for all the transport types
	private ArrayList<PublicTransport> Transport = new ArrayList<PublicTransport>();
	// temporary object to store current object
	private PublicTransport temporary;
	// iteration to store number of transport objects
	private int iteration = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		// title of GUI
		setTitle("Trip Planner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// size
		setBounds(100, 100, 585, 625);
		// mainPane: content pane of the GUI
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// set to have borderLayout
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout(0, 0));

		// plannerLogoLabel: JLavel containing map image
		plannerLogoLabel = new JLabel("");
		plannerLogoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		plannerLogoLabel.setIcon(new ImageIcon(getClass().getResource("planner_logo.png")));
		mainPane.add(plannerLogoLabel, BorderLayout.NORTH);

		// buttonPanel: panel including all the inputs
		buttonPanel = new JPanel();
		mainPane.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setLayout(new BorderLayout(0, 0));

		// header name of the panel
		headerName = new JLabel("TRIP PLANNER");
		headerName.setHorizontalAlignment(SwingConstants.CENTER);
		headerName.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonPanel.add(headerName, BorderLayout.NORTH);

		// transportTypePanel: sub panel with the transport type buttons
		transportTypePanel = new JPanel();
		buttonPanel.add(transportTypePanel, BorderLayout.WEST);
		transportTypePanel.setLayout(new GridLayout(5, 1, 0, 0));

		// train option button
		trainButton = new JButton("TRAIN");
		trainButton.setIcon(new ImageIcon(getClass().getResource("train.png")));
		transportTypePanel.add(trainButton);

		// bus option button
		busButton = new JButton("BUS");
		busButton.setIcon(new ImageIcon(getClass().getResource("bus.png")));
		transportTypePanel.add(busButton);

		// taxi option button
		taxiButton = new JButton("TAXI");
		taxiButton.setIcon(new ImageIcon(getClass().getResource("taxi.png")));
		transportTypePanel.add(taxiButton);

		// YesNoPanel: sub panel with yes no buttons
		YesNoPanel = new JPanel();
		buttonPanel.add(YesNoPanel, BorderLayout.EAST);
		YesNoPanel.setLayout(new GridLayout(5, 1, 0, 0));

		// yes button
		YesButton = new JButton("Yes");
		YesButton.setIcon(new ImageIcon(getClass().getResource("enterSmall.png")));
		YesNoPanel.add(YesButton);

		// no button
		NoButton = new JButton("No");
		NoButton.setIcon(new ImageIcon(getClass().getResource("cancelSmall.png")));
		YesNoPanel.add(NoButton);

		// OutputText: contains the user input and text output
		OutputText = new JTextArea();
		OutputText.setFont(new Font("Tahoma", Font.PLAIN, 13));
		OutputText.setText("Choose transport (from left menu): ");
		OutputText.setEditable(false);
		buttonPanel.add(OutputText);

		// NumberPanel: sub panel for user's number input
		NumberPanel = new JPanel();
		buttonPanel.add(NumberPanel, BorderLayout.SOUTH);
		NumberPanel.setLayout(new GridLayout(0, 4, 0, 0));

		// number one button
		oneButton = new JButton("");
		oneButton.setIcon(new ImageIcon(getClass().getResource("1.png")));
		NumberPanel.add(oneButton);

		// number two button
		twoButton = new JButton("");
		twoButton.setIcon(new ImageIcon(getClass().getResource("2.png")));
		NumberPanel.add(twoButton);

		// number three button
		threeButton = new JButton("");
		threeButton.setIcon(new ImageIcon(getClass().getResource("3.png")));
		NumberPanel.add(threeButton);

		// cancel button
		cancelButton = new JButton("CANCEL");
		cancelButton.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
		NumberPanel.add(cancelButton);

		// number four button
		fourButton = new JButton("");
		fourButton.setIcon(new ImageIcon(getClass().getResource("4.png")));
		NumberPanel.add(fourButton);

		// number five button
		fiveButton = new JButton("");
		fiveButton.setIcon(new ImageIcon(getClass().getResource("5.png")));
		NumberPanel.add(fiveButton);

		// number six button
		sixButton = new JButton("");
		sixButton.setIcon(new ImageIcon(getClass().getResource("6.png")));
		NumberPanel.add(sixButton);

		// clear button
		clearButton = new JButton("CLEAR");
		clearButton.setIcon(new ImageIcon(getClass().getResource("clear.png")));
		NumberPanel.add(clearButton);

		// number seven button
		sevenButton = new JButton("");
		sevenButton.setIcon(new ImageIcon(getClass().getResource("7.png")));
		NumberPanel.add(sevenButton);

		// number eight button
		eightButton = new JButton("");
		eightButton.setIcon(new ImageIcon(getClass().getResource("8.png")));
		NumberPanel.add(eightButton);

		// number nine button
		nineButton = new JButton("");
		nineButton.setIcon(new ImageIcon(getClass().getResource("9.png")));
		NumberPanel.add(nineButton);

		// enter button
		enterButton = new JButton("ENTER");
		enterButton.setIcon(new ImageIcon(getClass().getResource("enter.png")));
		NumberPanel.add(enterButton);

		// number zero button
		zeroButton = new JButton("");
		zeroButton.setIcon(new ImageIcon(getClass().getResource("0.png")));
		NumberPanel.add(zeroButton);

		// two zero button
		twoZeroButton = new JButton("");
		twoZeroButton.setIcon(new ImageIcon(getClass().getResource("2zero.png")));
		NumberPanel.add(twoZeroButton);

		// three zero button
		threeZeroButton = new JButton("");
		threeZeroButton.setIcon(new ImageIcon(getClass().getResource("3zero.png")));
		NumberPanel.add(threeZeroButton);

		// add ActionListener to all the buttons
		trainButton.addActionListener(this);
		busButton.addActionListener(this);
		taxiButton.addActionListener(this);
		YesButton.addActionListener(this);
		NoButton.addActionListener(this);
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		twoZeroButton.addActionListener(this);
		threeZeroButton.addActionListener(this);
		cancelButton.addActionListener(this);
		clearButton.addActionListener(this);
		enterButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if trainButton clicked
		if (e.getSource() == trainButton) {
			// if output text is asking for type of transport
			if (OutputText.getText().contains("Choose transport (from left menu): ")) {
				//polymorphism from PublicTransport to Train
				temporary = new Train();
				OutputText.setText("You chose TRAIN\nEnter base fare: ");

			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if busButton is clicked
		else if (e.getSource() == busButton) {
			// if output text is asking for type of transport
			if (OutputText.getText().contains("Choose transport (from left menu): ")) {
				//polymorphism from PublicTransport to Bus
				temporary = new Bus();
				OutputText.setText("You chose BUS\nEnter base fare: ");

			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if taxiButton is clicked
		else if (e.getSource() == taxiButton) {
			// if output text is asking for type of transport
			if (OutputText.getText().contains("Choose transport (from left menu): ")) {
				//polymorphism from PublicTransport to Taxi
				temporary = new Taxi();
				OutputText.setText("You chose TAXI\nEnter base fare: ");

			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if YesButton is clicked
		else if (e.getSource() == YesButton) {
			if (OutputText.getText().contains("Add more transport (from right menu)?")) {
				// add temporary to the arraylist
				Transport.add(temporary);
				// increase iteration
				iteration++;
				// add extra iteration for index and number of transports
				OutputText.setText("Choose transport (from left menu): ");

			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if NoButton is clicked
		else if (e.getSource() == NoButton) {
			if (OutputText.getText().contains("Add more transport (from right menu)?")) {
				// total fare
				double total = 0;
				String temp = "";
				//clear OutputText
				OutputText.setText("");
				//increase iteration
				iteration++;
				// add last temporary to the arraylist
				Transport.add(temporary);
				// for loop to go through entire arraylist
				for (int i = 0; i < iteration; i++) {
					String eachTransportInfo = "";
					// calculate total per transport
					Transport.get(i).calculatePayment();
					// add them up
					total += Transport.get(i).getTotalFare();
					// combine temp string with all information
					eachTransportInfo += String.format("Transport %d: %s\n", i + 1, Transport.get(i).getModel());
					eachTransportInfo += String.format("Fare: %.2f\n", Transport.get(i).getTotalFare());
					
					//concatenate to temp string
					temp += eachTransportInfo;
				}
				// combine final price to temp string
				temp += "==================================\n";
				temp += String.format("Total Trip Fare: %.2f\n", total);
				// print final text
				OutputText.setText(temp);

			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if oneButton is clicked
		else if (e.getSource() == oneButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert one in text
				OutputText.setText(OutputText.getText() + "1");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if twoButton is clicked
		else if (e.getSource() == twoButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert two in text
				OutputText.setText(OutputText.getText() + "2");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if threeButton is clicked
		else if (e.getSource() == threeButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert three in text
				OutputText.setText(OutputText.getText() + "3");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if fourButton is clicked
		else if (e.getSource() == fourButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert four in text
				OutputText.setText(OutputText.getText() + "4");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if fiveButton is clicked
		else if (e.getSource() == fiveButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert five in text
				OutputText.setText(OutputText.getText() + "5");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if sixButton is clicked
		else if (e.getSource() == sixButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert six in text
				OutputText.setText(OutputText.getText() + "6");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if sevenButton is clicked
		else if (e.getSource() == sevenButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert seven in text
				OutputText.setText(OutputText.getText() + "7");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if eightButton is clicked
		else if (e.getSource() == eightButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert eight in text
				OutputText.setText(OutputText.getText() + "8");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if nineButton is clicked
		else if (e.getSource() == nineButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert nine in text
				OutputText.setText(OutputText.getText() + "9");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if zeroButton is clicked
		else if (e.getSource() == zeroButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert zero in text
				OutputText.setText(OutputText.getText() + "0");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if twoZeroButton is clicked
		else if (e.getSource() == twoZeroButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert zero in text
				OutputText.setText(OutputText.getText() + "00");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if threeZeroButton is clicked
		else if (e.getSource() == threeZeroButton) {
			// if number button is allowed to be clicked
			if (OutputText.getText().contains("Enter")) {
				// insert zero in text
				OutputText.setText(OutputText.getText() + "000");
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if cancel button is clicked
		else if (e.getSource() == cancelButton) {
			// reset the arraylist
			Transport.clear();
			//reset iteration
			iteration = 0;
			//print text out
			OutputText.setText("Cancelled!\nNew plan:\nChoose transport (from left menu): ");
		}

		// if clear button is clicked
		else if (e.getSource() == clearButton) {
			// if allowed to click
			if (OutputText.getText().contains("Enter")) {
				// extract string
				String temp = OutputText.getText();
				// delete all the numbers
				temp = temp.replaceAll("[0-9]", "");
				// change outputtext using setText
				OutputText.setText(temp);
			}

			// if not allowed to input
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		// if enter button is clicked
		else if (e.getSource() == enterButton) {
			// if output text has basic fare in it
			if (OutputText.getText().contains("base fare")) {
				// extract price from text
				String text = OutputText.getText();
				double baseFare = Double.parseDouble(text.replaceAll("[^0-9]", ""));
				// set Base Fare of temporary
				temporary.setBaseFare(baseFare);

				// replace OutputText depending on object type
				if (temporary.getModel() == "KORAIL" || temporary.getModel() == "KORBUS") {
					OutputText.setText("Enter fare per station (for extra stations): ");
				} else if (temporary.getModel() == "KAKAO TAXI") {
					OutputText.setText("Enter fare per km: ");
				}
			}
			// if output is asking for extra fare (it includes the word "fare per")
			else if (OutputText.getText().contains("fare per")) {
				// extract price from text
				String text = OutputText.getText();
				double farePerUnit = Double.parseDouble(text.replaceAll("[^0-9]", ""));

				// replace OutputText depending on object type
				// if train
				if (temporary.getModel() == "KORAIL") {
					// temporary cast to Train for setfareperstation
					((Train) temporary).setFarePerStation(farePerUnit);
					OutputText.setText("Enter number of stations: ");
				}
				// if bus
				else if (temporary.getModel() == "KORBUS") {
					// temporary cast to Bus for setfareperstation
					((Bus) temporary).setFarePerStation(farePerUnit);
					OutputText.setText("Enter number of stations: ");
				}
				// if taxi
				else if (temporary.getModel() == "KAKAO TAXI") {
					// temporary cast to taxi for fareperkm
					((Taxi) temporary).setFarePerKM(farePerUnit);
					OutputText.setText("Enter distance (in km): ");
				}
			}

			// if output is asking for number of stations or distance
			else if (OutputText.getText().contains("number of") || OutputText.getText().contains("distance")) {
				// extract price from text
				String text = OutputText.getText();
				int numberOfUnits = Integer.parseInt(text.replaceAll("[^0-9]", ""));

				// replace OutputText depending on object type
				// if train
				if (temporary.getModel() == "KORAIL") {
					// temporary cast to Train for setfareperstation
					((Train) temporary).setnStations(numberOfUnits);
					OutputText.setText("Add more transport (from right menu)?");
				}
				// if bus
				else if (temporary.getModel() == "KORBUS") {
					// temporary cast to Bus for setfareperstation
					((Bus) temporary).setnStations(numberOfUnits);
					OutputText.setText("Add more transport (from right menu)?");
				}
				// if taxi
				else if (temporary.getModel() == "KAKAO TAXI") {
					// temporary cast to taxi for fareperkm
					((Taxi) temporary).setDistance(numberOfUnits);
					OutputText.setText("Add more transport (from right menu)?");
				}
			}
			// if not allowed to click: show error message
			else {
				JOptionPane.showMessageDialog(Main.this, "Error! You cannot use this button here!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
