package mouse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse2 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mouse2 window = new Mouse2();
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
	public Mouse2() {
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
		
		JLabel lblNewLabel = new JLabel("Mouse Action Inside The Text Box");
		lblNewLabel.setBounds(10, 57, 177, 17);
		frame.getContentPane().add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				tf2.setText("mouse is released");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tf2.setText("mouse is entered");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				tf2.setText("mouse is exeted");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				tf2.setText("mouse button is pressed");	
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tf2.setText("mouse button is clicked");	
			}
		});
		tf1.setBounds(197, 55, 184, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Action Performed Using mouse");
		lblNewLabel_1.setBounds(10, 133, 177, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf2 = new JTextField();
		tf2.setBounds(197, 130, 184, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
	}

}
