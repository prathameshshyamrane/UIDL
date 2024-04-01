package choice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class gender {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gender window = new gender();
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
	public gender() {
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
		
		JRadioButton r1 = new JRadioButton("Male");
		buttonGroup.add(r1);
		r1.setBounds(51, 29, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		buttonGroup.add(r2);
		r2.setBounds(183, 29, 109, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("others");
		buttonGroup.add(r3);
		r3.setBounds(319, 29, 109, 23);
		frame.getContentPane().add(r3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected())
				{
					t2.setText("male is selected");
				}
				if(r2.isSelected())
				{
					t2.setText("female is selected");
				}
				if(r3.isSelected())
				{
					t2.setText("others is selected");
				}
			
			
			}
		});
		btnNewButton.setBounds(169, 124, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel tf1 = new JLabel("Options selected");
		tf1.setBounds(43, 220, 117, 14);
		frame.getContentPane().add(tf1);
		
	
		
		t2 = new JTextField();
		t2.setBounds(192, 217, 166, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
	
	}
}
