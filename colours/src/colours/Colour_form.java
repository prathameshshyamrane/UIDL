package colours;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colour_form {

	private JFrame frame;
	private JTextField txtbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colour_form window = new Colour_form();
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
	public Colour_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtbox = new JTextField();
		txtbox.setBounds(60, 48, 319, 41);
		frame.getContentPane().add(txtbox);
		txtbox.setColumns(10);
		
		JButton btnred = new JButton("RED");
		btnred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtbox.setBackground(Color.RED);
				txtbox.setText("RED");
				
				
				
			}
		});
		btnred.setBounds(33, 179, 98, 41);
		frame.getContentPane().add(btnred);
		
		JButton btnyellow = new JButton("YELLOW");
		btnyellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtbox.setBackground(Color.YELLOW);
				txtbox.setText("YELLOW");
			}
		});
		btnyellow.setBounds(176, 179, 89, 41);
		frame.getContentPane().add(btnyellow);
		
		JButton btngreen = new JButton("GREEN");
		btngreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtbox.setBackground(Color.GREEN);
				txtbox.setText("GREEN");
			}
		});
		btngreen.setBounds(309, 179, 89, 41);
		frame.getContentPane().add(btngreen);
	}
}
