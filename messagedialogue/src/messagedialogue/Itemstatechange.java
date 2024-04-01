package messagedialogue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Itemstatechange {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Itemstatechange window = new Itemstatechange();
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
	public Itemstatechange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Favourite Games");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabel.setBounds(31, 33, 107, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cob1 = new JComboBox();
		cob1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				JOptionPane.showMessageDialog(null,cob1.getSelectedItem());
				
				
			}
		});
		cob1.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 11));
		cob1.setModel(new DefaultComboBoxModel(new String[] {"basketball", "football", "batminton ", "cricket"}));
		cob1.setBounds(180, 45, 107, 22);
		frame.getContentPane().add(cob1);
		
		JLabel lblNewLabel_1 = new JLabel("Food Options");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(31, 102, 107, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox cb1 = new JCheckBox("Veg");
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		buttonGroup_1.add(cb1);
		cb1.setBounds(180, 107, 107, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Non Veg");
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		buttonGroup_1.add(cb2);
		cb2.setBounds(307, 107, 107, 23);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_2 = new JLabel("Transport Options");
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(31, 180, 118, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		rb1 = new JRadioButton("Car");
		rb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 11));
		rb1.setBounds(178, 175, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Bus");
		rb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 11));
		rb2.setBounds(305, 175, 109, 23);
		frame.getContentPane().add(rb2);
		
		JButton btn = new JButton("show selected items");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cob1.isShowing())
				{
					JOptionPane.showMessageDialog(null, "basketball is selected");
					JOptionPane.showMessageDialog(null, "ball is selected");
					JOptionPane.showMessageDialog(null, "basket is selected");
					
				}
				
				
				if(cb1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Veg is selected");
				}
				if(cb2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Non Veg is selected");
				}
				if(rb1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Car is selected");
				}
				if(rb2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Bus is selected");
				}
			
			
				
				
			}
		});
		btn.setBounds(180, 227, 134, 23);
		frame.getContentPane().add(btn);
	}
}
