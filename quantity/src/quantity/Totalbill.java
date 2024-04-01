package quantity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Totalbill {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Totalbill window = new Totalbill();
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
	public Totalbill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOTAL BILL ");
		lblNewLabel.setFont(new Font("Source Code Pro Medium", Font.BOLD, 11));
		lblNewLabel.setBounds(185, 22, 83, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Snack Plate@Rs.40");
		lblNewLabel_1.setBounds(20, 99, 119, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Corn Chaat @Rs.30");
		lblNewLabel_2.setBounds(20, 149, 117, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cold Coffee @Rs 40");
		lblNewLabel_3.setBounds(20, 202, 115, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(165, 94, 145, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(166, 146, 143, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(166, 199, 143, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("qty");
		lblNewLabel_4.setBounds(165, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton cal = new JButton("Calculate Total Amount");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item1=Integer.parseInt(t1.getText());
				int item2=Integer.parseInt(t2.getText());
				int item3=Integer.parseInt(t3.getText());
				int tot=(40*item1)+(30*item2)+(40*item3);
				t4.setText(" "+tot);
				JOptionPane.showMessageDialog(null, tot);
				
			
			}
		});
		cal.setBounds(39, 267, 172, 23);
		frame.getContentPane().add(cal);
		
		t4 = new JTextField();
		t4.setBounds(270, 268, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
	}

}
