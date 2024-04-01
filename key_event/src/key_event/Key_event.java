package key_event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Key_event {

	private JFrame frame;
	private JTextField tphno;
	private JTextField tname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Key_event window = new Key_event();
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
	public Key_event() {
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
		
		tphno = new JTextField();
		tphno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{
					JOptionPane.showMessageDialog(null,"enter number only");
					tphno.setText(" ");
				}
				
			}
		});
		tphno.setBounds(168, 62, 240, 20);
		frame.getContentPane().add(tphno);
		tphno.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Phone Number");
		lblNewLabel.setBounds(25, 65, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enyter Name");
		lblNewLabel_1.setBounds(25, 136, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tname = new JTextField();
		tname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isDigit(c))
				{
					JOptionPane.showMessageDialog(null,"enter letters only");
					tname.setText(" ");
			
					
				}
				

			}
		});
		tname.setBounds(168, 133, 240, 20);
		frame.getContentPane().add(tname);
		tname.setColumns(10);
		
		JButton btn = new JButton("clear");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					tphno.setText(null);
					tname.setText(null);
				
				
			}
		});
		btn.setBounds(48, 203, 89, 23);
		frame.getContentPane().add(btn);
		
		JButton btn_1 = new JButton("exit");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_1.setBounds(222, 203, 89, 23);
		frame.getContentPane().add(btn_1);
	}

}
