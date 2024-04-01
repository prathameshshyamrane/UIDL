package cal2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc2 {

	private JFrame frame;
	private JTextField t1text;
	private JTextField t2text;
	private JTextField t3text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc2 window = new Calc2();
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
	public Calc2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the first number");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 39, 113, 19);
		frame.getContentPane().add(lblNewLabel);
		
		t1text = new JTextField();
		t1text.setForeground(Color.BLACK);
		t1text.setBackground(Color.WHITE);
		t1text.setBounds(194, 36, 191, 25);
		frame.getContentPane().add(t1text);
		t1text.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the second number");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 89, 174, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t2text = new JTextField();
		t2text.setBounds(194, 84, 191, 25);
		frame.getContentPane().add(t2text);
		t2text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 136, 100, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		t3text = new JTextField();
		t3text.setBounds(194, 136, 191, 25);
		frame.getContentPane().add(t3text);
		t3text.setColumns(10);
		
		JButton btnclear = new JButton("CLEAR");
		btnclear.setEnabled(false);
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1text.setText(null);
				t2text.setText(null);
				t3text.setText(null);
				
				
			}
		});
		btnclear.setBounds(242, 259, 143, 37);
		frame.getContentPane().add(btnclear);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1=Integer.parseInt(t1text.getText());
				int a2=Integer.parseInt(t2text.getText());
				int a3=a1+a2;
				t3text.setText(" "+a3);
				btnclear.setEnabled(true);
				
					
			}
		});
		btnAdd.setBounds(10, 198, 89, 37);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1=Integer.parseInt(t1text.getText());
				int a2=Integer.parseInt(t2text.getText());
				int a3=a1-a2;
				t3text.setText(" "+a3);
				btnclear.setEnabled(true);
					
			}
		});
		btnSub.setBounds(109, 198, 89, 37);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1=Integer.parseInt(t1text.getText());
				int a2=Integer.parseInt(t2text.getText());
				int a3=a1*a2;
				t3text.setText(" "+a3);
				btnclear.setEnabled(true);
					
			}
		});
		btnMul.setBounds(208, 198, 89, 37);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1=Integer.parseInt(t1text.getText());
				int a2=Integer.parseInt(t2text.getText());
				int a3=a1/a2;
				t3text.setText(" "+a3);
				btnclear.setEnabled(true);
					
			}
		});
		btnDiv.setBounds(307, 198, 89, 37);
		frame.getContentPane().add(btnDiv);
		
	}

}
