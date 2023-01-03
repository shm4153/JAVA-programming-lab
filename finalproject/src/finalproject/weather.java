package finalproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class weather extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnSunny;
	private JButton btnWindy;
	private JButton btnCloudy;
	private JButton btnSnowing;
	private JButton btnNext;
	private JTextArea txtrChooseWeatherConditions;
	private JTextArea txtrHowsTheWeather;
	private JTextArea txtrSunny;
	private JTextArea txtrCloudy;
	private JTextArea txtrWindy;
	private JTextArea txtrSnowy;
	private JButton clearButton;
	private JButton shortsbtn;
	private JButton btnskirt;
	private JButton btnTshirt;
	private JButton btncap;
	private JButton btnsandals;
	private JButton btnhoodie;
	private JButton btnhat;
	private JButton btnbag;
	private JButton btnbeanie;
	private JButton btnsweater;
	private JButton btnmittens;
	private JButton btnscarf;
	private JButton btnsweatpants;
	private JButton btnboots;
	private JButton btnsneakers;
	private JButton btnjeans;
	private JButton btnPufferJacket;
	private JButton btnCoat;
	private JTextField tfCount;
	private JTextArea txtrCounter;
	private JButton cancelButton;
	private int count = 0;
	ArrayList<String> outerwear = new ArrayList<String>();
	ArrayList<String> shoes = new ArrayList<String>();
	ArrayList<String> accesories = new ArrayList<String>();
	ArrayList<String> tops = new ArrayList<String>();
	ArrayList<String> buttoms = new ArrayList<String>();
	private JButton enterButton;
	private JPanel panel;
	private JScrollPane scrollPane;
	private conditions temporary;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weather frame = new weather();
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
	public weather() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 709);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 169, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSunny = new JButton("");
		btnSunny.setIcon(new ImageIcon(getClass().getResource("sunny.png")));
		btnSunny.setBounds(42, 240, 85, 71);
		
		contentPane.add(btnSunny);
		
		btnWindy = new JButton("");
		btnWindy.setHorizontalAlignment(SwingConstants.LEFT);
		btnWindy.setBounds(42, 402, 85, 71);
		Image windyImg = new ImageIcon(this.getClass().getResource("windy.png")).getImage();
		btnWindy.setIcon(new ImageIcon(windyImg));
		
		contentPane.add(btnWindy);
		
		btnCloudy = new JButton("");
		btnCloudy.setBounds(42, 321, 85, 71);
		contentPane.add(btnCloudy);
		Image cloudyImg = new ImageIcon(this.getClass().getResource("cloudy.png")).getImage();
		btnCloudy.setIcon(new ImageIcon(cloudyImg));
		
		btnSnowing = new JButton("");
		btnSnowing.setBounds(42, 495, 85, 71);
		contentPane.add(btnSnowing);
		Image snowyImg = new ImageIcon(this.getClass().getResource("snowy.png")).getImage();
		btnSnowing.setIcon(new ImageIcon(snowyImg));
		Image partlyImg = new ImageIcon(this.getClass().getResource("partlycloudy.png")).getImage();
		
		btnNext = new JButton("Next");
		btnNext.setBounds(561, 627, 85, 21);
		contentPane.add(btnNext);
		
		txtrHowsTheWeather = new JTextArea();
		
		txtrHowsTheWeather.setText("Hows the weather?");
		txtrHowsTheWeather.setBounds(37, 10, 495, 21);
		contentPane.add(txtrHowsTheWeather);
		txtrHowsTheWeather.setEditable(false);
		txtrSunny = new JTextArea();
		txtrSunny.setText("Sunny");
		txtrSunny.setBounds(137, 259, 65, 21);
		contentPane.add(txtrSunny);
		
		txtrCloudy = new JTextArea();
		txtrCloudy.setText("Cloudy");
		txtrCloudy.setBounds(137, 341, 65, 21);
		contentPane.add(txtrCloudy);
		
		txtrWindy = new JTextArea();
		txtrWindy.setText("Windy");
		txtrWindy.setBounds(137, 414, 65, 21);
		contentPane.add(txtrWindy);
		
		txtrSnowy = new JTextArea();
		txtrSnowy.setText("Snowy");
		txtrSnowy.setBounds(137, 516, 65, 21);
		contentPane.add(txtrSnowy);
		
		clearButton = new JButton("clear");
		clearButton.setBounds(561, 596, 85, 21);
		contentPane.add(clearButton);
		
		shortsbtn = new JButton("shorts");
		shortsbtn.setBounds(264, 237, 85, 38);
		contentPane.add(shortsbtn);
		
		btnskirt = new JButton("skirt");
		btnskirt.setBounds(264, 285, 85, 38);
		contentPane.add(btnskirt);
		
		btnTshirt = new JButton("tshirt");
		btnTshirt.setBounds(364, 237, 85, 38);
		contentPane.add(btnTshirt);
		
		btncap = new JButton(" cap");
		btncap.setBounds(464, 237, 85, 38);
		contentPane.add(btncap);
		
		btnsandals = new JButton("sandals");
		btnsandals.setBounds(561, 237, 85, 38);
		contentPane.add(btnsandals);
		
		btnhoodie = new JButton("hoodie");
		btnhoodie.setBounds(462, 285, 85, 38);
		contentPane.add(btnhoodie);
		
		btnhat = new JButton("hat");
		btnhat.setBounds(559, 285, 85, 38);
		contentPane.add(btnhat);
		
		btnbag = new JButton("bag");
		btnbag.setBounds(264, 333, 85, 38);
		contentPane.add(btnbag);
		
		btnbeanie = new JButton("beanie");
		btnbeanie.setBounds(364, 333, 85, 38);
		contentPane.add(btnbeanie);
		
		btnsweater = new JButton("sweater");
		btnsweater.setBounds(362, 285, 85, 38);
		contentPane.add(btnsweater);
		
		btnmittens = new JButton("mittens");
		btnmittens.setBounds(464, 333, 85, 38);
		contentPane.add(btnmittens);
		
		btnscarf = new JButton("scarf");
		btnscarf.setBounds(559, 333, 85, 38);
		contentPane.add(btnscarf);
		
		btnsweatpants = new JButton("sweatpants");
		btnsweatpants.setBounds(559, 391, 85, 38);
		contentPane.add(btnsweatpants);
		
		btnboots = new JButton("boots");
		btnboots.setBounds(464, 391, 85, 38);
		contentPane.add(btnboots);
		
		btnsneakers = new JButton("sneakers");
		btnsneakers.setBounds(364, 391, 85, 38);
		contentPane.add(btnsneakers);
		
		btnjeans = new JButton("jeans");
		btnjeans.setBounds(264, 391, 85, 38);
		contentPane.add(btnjeans);
		
		btnPufferJacket = new JButton("puffer \njacket");
		btnPufferJacket.setBounds(264, 439, 85, 38);
		contentPane.add(btnPufferJacket);
		
		btnCoat = new JButton("coat");
		btnCoat.setBounds(364, 439, 85, 38);
		contentPane.add(btnCoat);
		
		tfCount = new JTextField("0");
		tfCount.setEditable(false);
		tfCount.setColumns(10);
		tfCount.setBounds(458, 477, 186, 19);
		contentPane.add(tfCount);
		
		txtrCounter = new JTextArea();
		txtrCounter.setText("Items in Closet:");
		txtrCounter.setEditable(false);
		txtrCounter.setBounds(475, 446, 169, 22);
		contentPane.add(txtrCounter);
		
		cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrChooseWeatherConditions.setText("Cancelled\n New plan:\n Choose weather conditions from buttons (at left side):");
			}
		});
		cancelButton.setBounds(561, 565, 85, 21);
		contentPane.add(cancelButton);
		
		enterButton = new JButton("Enter");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrChooseWeatherConditions.setText("Enter Items in Closet with buttons: ");
			}
		});
		enterButton.setBounds(165, 581, 85, 21);
		contentPane.add(enterButton);
		
		panel = new JPanel();
		panel.setBounds(42, 47, 558, 178);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		txtrChooseWeatherConditions = new JTextArea();
		scrollPane.setViewportView(txtrChooseWeatherConditions);
		txtrChooseWeatherConditions.setText("Choose weather conditions from buttons (at left side): ");
		txtrChooseWeatherConditions.setEditable(false);
	
		btnSunny.addActionListener(this);
		btnWindy.addActionListener(this);
		btnCloudy.addActionListener(this);
		btnSnowing.addActionListener(this);
		clearButton.addActionListener(this);
		btnNext.addActionListener(this);
		btnCoat.addActionListener(this);
		btnskirt.addActionListener(this);
		btnbag.addActionListener(this);
		btnsandals.addActionListener(this);
		btnhat.addActionListener(this);
		btnscarf.addActionListener(this);
		btnboots.addActionListener(this);
		btnmittens.addActionListener(this);
		btnhoodie.addActionListener(this);
		btncap.addActionListener(this);
		btnsweatpants.addActionListener(this);
		btnPufferJacket.addActionListener(this);
		btnjeans.addActionListener(this);
		shortsbtn.addActionListener(this);
		btnTshirt.addActionListener(this);
		btnsweater.addActionListener(this);
		btnsneakers.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> memo = new ArrayList<String>();
		
		if (e.getSource() == clearButton) {
			txtrChooseWeatherConditions.setText(" ");
		}
		else if(e.getSource() == btnNext) {
			String str = "";
				//clear OutputText
				txtrChooseWeatherConditions.setText("");
				Object[] objects = memo.toArray();
				if (objects.length > 0){
					//pops message of errors that have to be fixed with numbered list
					for(int i = 1; i<objects.length+1; i++)
					{
						str =str+i+". "+objects[i-1]+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, str, null, JOptionPane.INFORMATION_MESSAGE);
			}
			
		
		//if cloudy button is clicked...
		else if (e.getSource() == btnCloudy) {
			memo.add("Take an unbrella just in case!");
			// if output text is asking for type of transport
			if (txtrChooseWeatherConditions.getText().contains("Choose weather conditions from buttons (at left side):")) {
				temporary = new Cloudy();
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText()+"\n The weather is cloudy!\n Understood. Click Enter.");
			
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//if sunnyy button is clicked...
		else if (e.getSource() == btnSunny) {
			
			memo.add("Take a cap!");
			// if output text is asking for type of transport
			if (txtrChooseWeatherConditions.getText().contains("Choose weather conditions from buttons (at left side):")) {
				//temporary = new Sunny();
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText()+"\n The weather is sunny!\n Understood. Click Enter.");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//if windyy button is clicked...
		else if (e.getSource() == btnWindy) {
			memo.add("Take a hoodie it may be cold!");
			// if output text is asking for type of transport
			if (txtrChooseWeatherConditions.getText().contains("Choose weather conditions from buttons (at left side):")) {
				//temporary = new Windy();
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText()+"\n The weather is windy!\n Understood. Click Enter.");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//if snowy button is clicked...
		else if (e.getSource() == btnSnowing) {
			memo.add("Wear a coat or a parka jacket!");
			// if output text is asking for type of transport
			if (txtrChooseWeatherConditions.getText().contains("Choose weather conditions from buttons (at left side):")) {
				//temporary = new Snowy();
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText()+"\n The weather is snowy!\n Understood. Click Enter.");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//if sneakers button is clicked...
		if (e.getSource() == btnsneakers) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				shoes.add("sneakers");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nsneakers, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
		//shorts added
		else if (e.getSource() == shortsbtn) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				buttoms.add("shorts");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nshorts, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//skirt added
		else if(e.getSource() == btnskirt) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				buttoms.add("skirts");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nskirts, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//cap added
		else if(e.getSource() == btncap) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("cap");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\ncap, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//sandals added
		else if(e.getSource() == btnsandals) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				shoes.add("sandals");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nsandals, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//shirt added
		else if(e.getSource() == btnTshirt) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				tops.add("t-shirt");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nt-shirt, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//sweater added
		else if(e.getSource() == btnsweater) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				outerwear.add("sweater");
				++count;
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nsweater, ");
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//hoodie added
		else if(e.getSource() == btnhoodie) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				outerwear.add("hoodie");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nhoodie, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
		//hat added
		else if(e.getSource() == btnhat) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("hat");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nhat, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
		//bag added
		else if(e.getSource() == btnbag) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("bag");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nbag, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//beanie added
		else if(e.getSource() == btnbeanie) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("beanie");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nbeanie, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//mittens added
		else if(e.getSource() == btnmittens) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("mittens");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nmittens, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//scarf added
		else if(e.getSource() == btnscarf) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				accesories.add("scarf");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nscarf, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//jeans added
		else if(e.getSource() == btnjeans) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				buttoms.add("jeans");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\njeans, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//boots added
		else if(e.getSource() == btnboots) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				shoes.add("boots");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nboots, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//swearpants added
		else if(e.getSource() == btnsweatpants) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				buttoms.add("sweatpants");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\nsweatpants, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//puffer jacket added
		else if(e.getSource() == btnPufferJacket) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				outerwear.add("pufferjacket");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\npufferjacket, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		//coat added
		else if(e.getSource() == btnCoat) {
			if (txtrChooseWeatherConditions.getText().contains("Enter")) {
				outerwear.add("coat");
				txtrChooseWeatherConditions.setText(txtrChooseWeatherConditions.getText() + "\ncoat, ");
				++count;
				tfCount.setText(count+"");
			}
			else {
				JOptionPane.showMessageDialog(weather.this, "Error! Please choose one weather condition!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}

