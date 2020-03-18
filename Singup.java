import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Singup {

	public JFrame frame;
	private JTextField name_txt;
	private JPasswordField password_txt;
	private JPasswordField Confpassword_txt;
	private JTextField adress_txt;
	private JTextField country_txt;
	private JTextField phone_txt;
	private JTextField email_txt;
	Singupdata miSingup = new Singupdata();
	private String name;
	private char[] password;
	private char[] confpassword;
	private String adress;
	private String city;
	private String country;
	private String phone;
	private String email;
	private JTextField city_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singup window = new Singup();
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


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 160, 122));
		frame.setBounds(100, 100, 675, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name_txt = new JTextField();
		name_txt.setBounds(206, 93, 149, 28);
		frame.getContentPane().add(name_txt);
		name_txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(64, 93, 61, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(65, 167, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		password_txt = new JPasswordField();
		password_txt.setBounds(206, 155, 149, 28);
		frame.getContentPane().add(password_txt);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		lblNewLabel_2.setBounds(65, 236, 102, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		Confpassword_txt = new JPasswordField();
		Confpassword_txt.setBounds(206, 229, 149, 28);
		frame.getContentPane().add(Confpassword_txt);
		
		JLabel lblNewLabel_3 = new JLabel("Adress");
		lblNewLabel_3.setBounds(64, 309, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		adress_txt = new JTextField();
		adress_txt.setBounds(206, 297, 149, 28);
		frame.getContentPane().add(adress_txt);
		adress_txt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Country");
		lblNewLabel_4.setBounds(64, 387, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		country_txt = new JTextField();
		country_txt.setBounds(206, 375, 149, 28);
		frame.getContentPane().add(country_txt);
		country_txt.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone");
		lblNewLabel_5.setBounds(415, 206, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		phone_txt = new JTextField();
		phone_txt.setBounds(486, 203, 96, 19);
		frame.getContentPane().add(phone_txt);
		phone_txt.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(415, 290, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		email_txt = new JTextField();
		email_txt.setBounds(486, 287, 96, 19);
		frame.getContentPane().add(email_txt);
		email_txt.setColumns(10);
		
		JButton btnNewButton = new JButton("Create User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 name= name_txt.getText();
			 password = password_txt.getPassword();
			 confpassword = Confpassword_txt.getPassword();
			 adress = adress_txt.getText();
			 if (confpassword==password){
				 city = city_txt.getText();
				 country=country_txt.getText();
				 phone=phone_txt.getText();
				 email=email_txt.getText();
				 miSingup.setAll(name, password, confpassword, adress,  city,  country,  phone,  email);
				 JOptionPane.showMessageDialog(null, "Done!");
			 }
			 else {
				 JOptionPane.showMessageDialog(null, "The passwords do not coincide");
			 }
			}
		});
		btnNewButton.setBounds(289, 452, 119, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("CREATE NEW USER");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_7.setBounds(256, 24, 184, 38);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel citylabel = new JLabel("city");
		citylabel.setBounds(415, 364, 45, 13);
		frame.getContentPane().add(citylabel);
		
		city_txt = new JTextField();
		city_txt.setBounds(486, 361, 96, 19);
		frame.getContentPane().add(city_txt);
		city_txt.setColumns(10);
	}

	public Singup() {
		super();
		// TODO Auto-generated constructor stub
	}
}
