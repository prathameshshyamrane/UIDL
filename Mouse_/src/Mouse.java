import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse {

	private JFrame frame;
	private JTextField tf1;
	private JLabel lblMouseIsPressed;
	private JLabel lblNewLabel_1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mouse window = new Mouse();
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
	public Mouse() {
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
		
		tf1 = new JTextField();
		tf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tf1.setText(null);
				tf2.setText("mouse is pressed");
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				tf2.setText(null);
				tf3.setText("mouse is released");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				tf4.setText("mouse is entered");
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tf4.setText("mouse is exited");
			}
		});
		tf1.setBounds(237, 28, 154, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mouse pressed inside the textbox");
		lblNewLabel.setBounds(39, 31, 162, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblMouseIsPressed = new JLabel("Mouse is pressed ");
		lblMouseIsPressed.setBounds(39, 81, 110, 31);
		frame.getContentPane().add(lblMouseIsPressed);
		
		lblNewLabel_1 = new JLabel("Mouse is released");
		lblNewLabel_1.setBounds(39, 140, 154, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf2 = new JTextField();
		tf2.setBounds(237, 86, 154, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(237, 137, 154, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(237, 206, 154, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Mouse entered /exit in textbox");
		lblNewLabel_2.setBounds(39, 209, 154, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
