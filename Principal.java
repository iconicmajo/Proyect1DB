import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class Principal {

	private JFrame frame;
	private JTextField words_txt;
	public String words;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		words_txt = new JTextField();
		words_txt.setBackground(SystemColor.text);
		words_txt.setBounds(41, 186, 412, 33);
		frame.getContentPane().add(words_txt);
		words_txt.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				words = words_txt.getText();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Majo\\Downloads\\search.png"));
		btnNewButton.setBounds(460, 186, 40, 33);
		frame.getContentPane().add(btnNewButton);
	
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("MARS");
		lblNewJgoodiesTitle.setBounds(203, 52, 83, 13);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(103, 111, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
	}
}
