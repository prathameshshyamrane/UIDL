package gender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Select_gender {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_gender window = new Select_gender();
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
	public Select_gender() {
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
		
		JLabel lblNewLabel = new JLabel("SELECT GENDER");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 11));
		lblNewLabel.setBounds(36, 27, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rbmale = new JRadioButton("Male");
		rbmale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rbmale.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Male option is selected");
				}
				
			}
		});
		buttonGroup.add(rbmale);
		rbmale.setBounds(36, 83, 109, 23);
		frame.getContentPane().add(rbmale);
		
		JRadioButton rbfemale = new JRadioButton("Female");
		rbfemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rbfemale.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Female option is selected");
				}
				
			}
		});
		buttonGroup.add(rbfemale);
		rbfemale.setBounds(147, 83, 109, 23);
		frame.getContentPane().add(rbfemale);
		
		JRadioButton rbother = new JRadioButton("Other");
		rbother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbother.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Others option is selected");
				}
			}
		});
		buttonGroup.add(rbother);
		rbother.setBounds(268, 83, 109, 23);
		frame.getContentPane().add(rbother);
	}
}
