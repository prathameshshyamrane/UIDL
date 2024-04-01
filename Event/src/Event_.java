import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Event_ {

	private JFrame frame;
	private JTextField txtEnterYourEmail;
	private JLabel lblNewLabel_2_2;
	private JTextField txtEnterYourLast;
	private JTextField txtEnterYourFirst;
	private JTextField txtWhatIsYour;
	private JTextField txtWhereDoYou;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JTextField txtMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_ window = new Event_();
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
	public Event_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Gill Sans Ultra Bold Condensed", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 540, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Join The Event");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(62, 11, 171, 56);
		frame.getContentPane().add(lblNewLabel);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setBackground(SystemColor.activeCaptionText);
		txtEnterYourEmail.setText("   Enter your email");
		txtEnterYourEmail.setToolTipText("");
		txtEnterYourEmail.setForeground(SystemColor.inactiveCaptionBorder);
		txtEnterYourEmail.setBounds(47, 178, 186, 38);
		frame.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(47, 78, 60, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Company Size");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(293, 227, 86, 32);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Last Name");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(293, 78, 60, 32);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Title");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_1_2.setBackground(Color.WHITE);
		lblNewLabel_2_1_2.setBounds(293, 152, 86, 32);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		lblNewLabel_2_2 = new JLabel("Business Email");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(47, 152, 86, 32);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txtEnterYourLast = new JTextField();
		txtEnterYourLast.setBackground(SystemColor.activeCaptionText);
		txtEnterYourLast.setText("   Enter your last name");
		txtEnterYourLast.setForeground(SystemColor.inactiveCaptionBorder);
		txtEnterYourLast.setColumns(10);
		txtEnterYourLast.setBounds(293, 103, 171, 38);
		frame.getContentPane().add(txtEnterYourLast);
		
		txtEnterYourFirst = new JTextField();
		txtEnterYourFirst.setText("   Enter your first name");
		txtEnterYourFirst.setBackground(SystemColor.activeCaptionText);
		txtEnterYourFirst.setForeground(SystemColor.inactiveCaptionBorder);
		txtEnterYourFirst.setColumns(10);
		txtEnterYourFirst.setBounds(47, 103, 186, 38);
		frame.getContentPane().add(txtEnterYourFirst);
		
		txtWhatIsYour = new JTextField();
		txtWhatIsYour.setBackground(SystemColor.activeCaptionText);
		txtWhatIsYour.setText("   What is your job title?");
		txtWhatIsYour.setForeground(SystemColor.inactiveCaptionBorder);
		txtWhatIsYour.setColumns(10);
		txtWhatIsYour.setBounds(293, 178, 171, 38);
		frame.getContentPane().add(txtWhatIsYour);
		
		txtWhereDoYou = new JTextField();
		txtWhereDoYou.setBackground(SystemColor.activeCaptionText);
		txtWhereDoYou.setText("   Where do you work?");
		txtWhereDoYou.setForeground(SystemColor.inactiveCaptionBorder);
		txtWhereDoYou.setColumns(10);
		txtWhereDoYou.setBounds(47, 253, 186, 38);
		frame.getContentPane().add(txtWhereDoYou);
		
		lblNewLabel_2_3 = new JLabel("Company Name");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_3.setBounds(47, 227, 86, 32);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		lblNewLabel_2_4 = new JLabel("What are you hoping to learn about?");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_4.setBounds(47, 302, 233, 32);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		txtMessage = new JTextField();
		txtMessage.setHorizontalAlignment(SwingConstants.CENTER);
		txtMessage.setBackground(SystemColor.activeCaptionText);
		txtMessage.setForeground(SystemColor.inactiveCaptionBorder);
		txtMessage.setColumns(10);
		txtMessage.setBounds(47, 328, 417, 80);
		frame.getContentPane().add(txtMessage);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(SystemColor.inactiveCaptionBorder);
		comboBox.setBackground(SystemColor.activeCaptionText);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Small", "Medium", "Large"}));
		comboBox.setBounds(293, 253, 171, 38);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I would like to recieve emails about future webinars");
		chckbxNewCheckBox.setForeground(SystemColor.inactiveCaptionBorder);
		chckbxNewCheckBox.setBackground(SystemColor.activeCaptionText);
		chckbxNewCheckBox.setBounds(47, 415, 271, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Register for this event");
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(47, 456, 212, 56);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.setBounds(62, 344, 46, 14);
		frame.getContentPane().add(label);
	}
}
