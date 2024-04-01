package eligiblity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Age_eligiblity {

	private JFrame frame;
	private JTextField t1text;
	private JButton btneligible;
	private JLabel lblNewLabel_1;
	private JTextField t2text;
	private JButton btncancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Age_eligiblity window = new Age_eligiblity();
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
	public Age_eligiblity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		btncancel = new JButton("CANCEL");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1text.setText(null);
				t2text.setAction(null);
			}
		});
		btncancel.setEnabled(false);
		btncancel.setBounds(313, 227, 89, 23);
		frame.getContentPane().add(btncancel);
		
		t1text = new JTextField();
		t1text.setBounds(130, 63, 98, 29);
		frame.getContentPane().add(t1text);
		t1text.setColumns(10);
		btncancel.setEnabled(true);
		
		JLabel lblNewLabel = new JLabel("ENTER YOUR AGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 63, 110, 29);
		frame.getContentPane().add(lblNewLabel);
	
		btneligible = new JButton("CHECK ELIGIBLITY");
		btneligible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int age=Integer.parseInt(t1text.getText());
			
			if (age>=18)
			{
				t2text.setText("you are eligible to vote");
			}
			else {
				t2text.setText("you are not eligible to vote");
				}
			
			}
		});
		btneligible.setBounds(260, 61, 164, 33);
		frame.getContentPane().add(btneligible);
		
		
		lblNewLabel_1 = new JLabel("MESSAGE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 155, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		btncancel.setEnabled(true);
		
		t2text = new JTextField();
		t2text.setBounds(130, 146, 204, 33);
		frame.getContentPane().add(t2text);
		t2text.setColumns(10);
		btncancel.setEnabled(true);
		
		
	}

}
