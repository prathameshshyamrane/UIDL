package quantity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Total_bill2 {

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
					Total_bill2 window = new Total_bill2();
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
	public Total_bill2() {
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
		
		JRadioButton r1 = new JRadioButton("ice cream @Rs. 25");
		r1.setBounds(25, 71, 129, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Corn Chat @Rs.20");
		r2.setBounds(25, 118, 129, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton(" Brownies @Rs. 15");
		r3.setBounds(25, 164, 129, 23);
		frame.getContentPane().add(r3);
		
		t1 = new JTextField();
		t1.setBounds(217, 72, 129, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(217, 119, 129, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(217, 165, 129, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("QTY");
		lblNewLabel.setBounds(221, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL BILL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(161, 11, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calculate Total Amount");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int item1=0;
				int item2=0;
				int item3=0;
				int v1=0;
				int v2=0;
				int v3=0;
				
				if(r1.isSelected())
				{
					item1=Integer.parseInt(t1.getText());
					v1=item1*40;
					
				}
				if(r2.isSelected())
				{
					item2=Integer.parseInt(t2.getText());
					v2=item2*30;
			
					
				}
				if(r3.isSelected())
				{
				 item3=Integer.parseInt(t3.getText());
				 v3=item3*40;
					
				}
		
				
				int tot=v1+v2+v3;
				t4.setText(" "+tot);
				
				
		
				
			}
		});
		btnNewButton.setBounds(35, 215, 159, 23);
		frame.getContentPane().add(btnNewButton);
		
		t4 = new JTextField();
		t4.setBounds(217, 216, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
	}

}
