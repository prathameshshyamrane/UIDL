package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField uname;
	private JTextField pass;

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		uname = new JTextField();
		uname.setBounds(169, 50, 159, 20);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(34, 53, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 131, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton sunbtn = new JButton("SUBMIT");
		sunbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*String u=uname.getText();
				String pass=password.getText();
	          if(u.equals("admin") && pass.equals("123"))
					
				{
					JOptionPane.showMessageDialog(null, "login successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "login not successful");
				}
*/
				String u=uname.getText();
				String p=pass.getText();
	        
				if(u.equals("admin") && pass.equals("123"))
					
				{
					
					JOptionPane.showMessageDialog(null, "login successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "login not successful");
				}
				
				
			
			
				
			}
		});
		sunbtn.setBounds(34, 195, 89, 23);
		frame.getContentPane().add(sunbtn);
		
		JButton closebtn = new JButton("CLOSE");
		closebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closebtn.setBounds(303, 195, 89, 23);
		frame.getContentPane().add(closebtn);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uname.setText(null);
				pass.setText(null);
			}
		});
		clearbtn.setBounds(169, 195, 89, 23);
		frame.getContentPane().add(clearbtn);
		
		pass = new JTextField();
		pass.setBounds(172, 128, 86, 20);
		frame.getContentPane().add(pass);
		pass.setColumns(10);
	}
}
