package textarea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

public class Textarea {

	private JFrame frame;
	private JTextField tf2;
	private JTextField tf1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField tp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Textarea window = new Textarea();
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
	public Textarea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 586, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf2 = new JTextField();
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isDigit(c))
				{
					JOptionPane.showMessageDialog(null, "enter letters only");
					tf2.setText(null);
					
				}
			}
		});
		tf2.setBounds(132, 14, 141, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(26, 17, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(368, 37, 187, 275);
		frame.getContentPane().add(ta);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL_NO");
		lblNewLabel_1.setBounds(26, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{
					JOptionPane.showMessageDialog(null, "enter numbers only");
					tf1.setText(null);
					
				}
			}
		});
		tf1.setBounds(132, 49, 141, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Details Entered Are");
		lblNewLabel_2.setBounds(382, 17, 134, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STATE");
		lblNewLabel_3.setBounds(26, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"Goa", ""}));
		cb.setBounds(132, 116, 86, 22);
		frame.getContentPane().add(cb);
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setBounds(132, 167, 58, 23);
		frame.getContentPane().add(rb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setBounds(26, 171, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setBounds(210, 167, 76, 23);
		frame.getContentPane().add(rb2);
		
		
		
		JRadioButton rb3 = new JRadioButton("Other");
		buttonGroup.add(rb3);
		rb3.setBounds(303, 167, 59, 23);
		frame.getContentPane().add(rb3);
		
		JCheckBox c1 = new JCheckBox("Reading");
		c1.setBounds(132, 208, 86, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Singing");
		c2.setBounds(242, 208, 86, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Swimming");
		c3.setBounds(132, 248, 86, 23);
		frame.getContentPane().add(c3);
		
		JCheckBox c4 = new JCheckBox("Sleeping");
		c4.setBounds(242, 248, 86, 23);
		frame.getContentPane().add(c4);
		
		JLabel lblNewLabel_5 = new JLabel("HOBBIES");
		lblNewLabel_5.setBounds(26, 212, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tp = new JPasswordField();
		tp.setBounds(132, 80, 141, 20);
		frame.getContentPane().add(tp);
		
		JLabel lblNewLabel_6 = new JLabel("ENTER PASSWORD");
		lblNewLabel_6.setBounds(26, 83, 108, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(tp.getPassword());
				
				
				ta.append("NAME:" + tf2.getText()+ "\n" );
				ta.append("ROLL_NO:" + tf1.getText()+ "\n" );
				
				if(rb1.isSelected())
				{
					ta.append("GENDER:" + rb1.getText()+ "\n");
				}
				if(rb2.isSelected())
				{
					ta.append("GENDER:" + rb2.getText()+ "\n");
				}
				if(rb3.isSelected())
				{
					ta.append("GENDER:" + rb3.getText()+ "\n");
				}
				if(c1.isSelected())
				{
					ta.append("HOBBIES:" + c1.getText()+ "\n");
					
				}
				if(c2.isSelected())
				{
					ta.append("HOBBIES:" + c2.getText()+ "\n");
					
				}
				if(c3.isSelected())
				{
					ta.append("HOBBIES:" + c3.getText()+ "\n");
					
				}
				if(c4.isSelected())
				{
					ta.append("HOBBIES:" + c4.getText()+ "\n");
					
				}
				ta.append("STATE :" +cb.getSelectedItem().toString()+ "\n");
				
				
			}
		});
		btnNewButton.setBounds(122, 308, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}

