import java.awt.EventQueue;
import java.util.Scanner;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login {

	private JFrame frame;
	private JTextField insertuser;
	private JPasswordField insertpassword;
	String user="";
	char[] password;
	Logindata miLogin = new Logindata();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Open a new window 
				 * pagina principal */
				user= insertuser.getText();
				miLogin.setUser(user);
				password = insertpassword.getPassword();
				miLogin.setPassword(password);
				JOptionPane.showMessageDialog(null, "El usuario fue logeado");
				
			}
		});
		btnNewButton.setBounds(405, 313, 82, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sing up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Here it opens the Singup window
				frame.dispose();
				Singup nwsinup= new Singup();
				//nwsinup.show();
			}
		});
		btnNewButton_1.setBounds(252, 310, 82, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		insertuser = new JTextField();
		insertuser.setBounds(225, 102, 312, 38);
		frame.getContentPane().add(insertuser);
		insertuser.setColumns(10);
		
		insertpassword = new JPasswordField();
		insertpassword.setBounds(225, 181, 312, 38);
		frame.getContentPane().add(insertpassword);
		
		JLabel lblNewLabel = new JLabel("User:");
		lblNewLabel.setBounds(225, 79, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(225, 161, 66, 22);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
