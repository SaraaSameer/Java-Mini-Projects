import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;

public class FinalCart01{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String Order= "";
	String CustomerName =" Joe Biden";
	float Total =0;
	float UrgentTotal =0;
	float Price=0;
	int flag =0;
	String PrevResponse ="NotUrgent\n";    //This is done particularly for radio box
	private final JButton btnCalculateBudget = new JButton("Calculate Budget");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalCart01 window = new FinalCart01();
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
	public FinalCart01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Personal Shopping Cart");
		frame.setBounds(100, 100, 750, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Name:");
		lblNewLabel.setBounds(22, 33, 64, 20);
		frame.getContentPane().add(lblNewLabel);
		
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order = textField.getText();
				Order= Order +"\t";
			}
		});
		textField.setBounds(143, 33, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Estimated Price");
		lblNewLabel_1.setBounds(22, 64, 100, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order=  Order+ textField_1.getText()+"\t";
				Price = Float.parseFloat(textField_1.getText());
			}
		});
		textField_1.setBounds(143, 64, 129, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(21, 103, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order= Order +textField_2.getText() +"\t";
				int Quan = Integer.parseInt(textField_2.getText());
				Total = Total + Quan *Price;
			}
		});
		textField_2.setBounds(143, 100, 129, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("Category");
		lblNewLabel_3.setBounds(21, 141, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Urgent Item");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				     flag =1;
				        if (rdbtnNewRadioButton.isSelected()) {				        	   
				               Order = Order + "Urgent\n ";     
				               UrgentTotal = UrgentTotal +Price;
				               PrevResponse = "Urgent\n";
				        }
				        else{
				        	 Order = Order + "Not Urgent\n ";
				        	 PrevResponse = "NotUrgent\n";
				        }
				        
				      
				    }
			
		});
		 
		rdbtnNewRadioButton.setBounds(16, 182, 173, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		 
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fruits and Vegetables ", "Grains", "Meat", "Dairy products"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Order = Order + comboBox.getSelectedItem();
				 Order = Order +"\t";
			}
		});
		
		comboBox.setBounds(143, 137, 159, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Add");
		
		btnNewButton.setBounds(106, 243, 118, 31);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 285, 414, 191);
		frame.getContentPane().add(textArea);
		
		
		btnCalculateBudget.setBounds(470, 243, 216, 31);
		frame.getContentPane().add(btnCalculateBudget);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(458, 285, 276, 191);
		frame.getContentPane().add(textArea_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(470, 23, 216, 176);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(-6, -16, 228, 198);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 11, 228, 214);
		panel_1.add(splitPane);
		
		JLabel Show_Image = new JLabel("New label");
		splitPane.setLeftComponent(Show_Image);
		
		Show_Image.setIcon(new ImageIcon(FinalCart01.class.getResource("/Cart.png")) );
		
		
		btnCalculateBudget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.append(CustomerName);
				textArea_1.append("\n");
				textArea_1.append("The total money to be spent: " +Total+"\n");
				textArea_1.append("The total money to be spent on Urgent Items: " +UrgentTotal+"\n");
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    //Make the entire selction in string then add it
				textArea.append(Order);
				Order="";
			}
		});
		
	}
}
