package combo_box;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;


public class Cities {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cities window = new Cities();
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
	public Cities() {
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
		
		JComboBox cb1 = new JComboBox();
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED);
				{
					String str=cb1.getSelectedItem().toString();
					tf1.setText(str);
					
					JOptionPane.showMessageDialog(null, cb1.getSelectedItem());
					
				}
				
			}
		});
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Margao", "Panjim", "Vasco"}));
		cb1.setBounds(247, 43, 94, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel = new JLabel("Select Cities");
		lblNewLabel.setBounds(61, 47, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(247, 156, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("You have selected");
		lblNewLabel_1.setBounds(61, 159, 94, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
