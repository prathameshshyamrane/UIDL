package gender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Fruits {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fruits window = new Fruits();
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
	public Fruits() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(31, 33, 109, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rb1 = new JRadioButton("Banana");
		buttonGroup.add(rb1);
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rb1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Banana option is selected");
				}
			}
		});
		rb1.setBounds(31, 106, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Grapes");
		buttonGroup.add(rb2);
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rb2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Grapes option is selected");
				}
			
			}
		});
		rb2.setBounds(174, 106, 109, 23);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("kiwi");
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rb3.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Kiwi option is selected");
				}
			}
			
		});
		buttonGroup.add(rb3);
		rb3.setBounds(319, 106, 109, 23);
		frame.getContentPane().add(rb3);
	}

}
