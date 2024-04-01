package combo_box;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class details {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details window = new details();
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
	public details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(146, 42, 171, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel TF = new JLabel("NAME");
		TF.setBounds(36, 45, 46, 14);
		frame.getContentPane().add(TF);
		
		JLabel dob = new JLabel("DATE ");
		dob.setBounds(36, 99, 83, 14);
		frame.getContentPane().add(dob);
		
		JComboBox date = new JComboBox();
		date.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		date.setBounds(146, 105, 92, 22);
		frame.getContentPane().add(date);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"jan", "feb", "mar", "april", "may", "jun", "jul", "aug", "sep", "oct ", "nov", "dec"}));
		comboBox.setBounds(146, 154, 92, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1999", "2000", "2001", "2002", "2003"}));
		comboBox_1.setBounds(146, 207, 92, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("MONTH");
		lblNewLabel.setBounds(36, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YEAR");
		lblNewLabel_1.setBounds(36, 207, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(327, 40, 141, 189);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("date :" );
				
				
				
				
			}
		});
		btnNewButton.setBounds(146, 257, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
