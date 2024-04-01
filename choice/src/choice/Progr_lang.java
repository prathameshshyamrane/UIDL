package choice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Progr_lang {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Progr_lang window = new Progr_lang();
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
	public Progr_lang() {
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
		
		JLabel lblNewLabel = new JLabel("Select Your Choice");
		lblNewLabel.setBounds(20, 21, 152, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox cbox1 = new JCheckBox("mango");
		cbox1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		cbox1.setBounds(47, 68, 97, 23);
		frame.getContentPane().add(cbox1);
		
		JCheckBox cbox2 = new JCheckBox("coffee");
		cbox2.setBounds(170, 68, 97, 23);
		frame.getContentPane().add(cbox2);
		
		JCheckBox cbox3 = new JCheckBox("icecream");
		cbox3.setBounds(314, 68, 97, 23);
		frame.getContentPane().add(cbox3);
		
		t1 = new JTextField();
		t1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		t1.setBounds(91, 132, 265, 40);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Message");
		lblNewLabel_1.setBounds(20, 139, 61, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbox1.isSelected())
				{
					t1.setText("mango is selected");
				}
				if(cbox2.isSelected())
				{
					t1.setText("coffee is selected");
				}
				if(cbox3.isSelected())
				{
					t1.setText("iceceram is selected");
				}
			}
		});
		b1.setBounds(146, 214, 121, 23);
		frame.getContentPane().add(b1);
	}
}
