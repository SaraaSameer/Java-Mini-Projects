import java.awt.EventQueue;

import javax.swing.JFrame;

	import javax.swing.*;  
	import java.awt.*;  
	import java.awt.event.*;  
	import java.sql.*;  
	public class Cart extends JFrame implements ActionListener   
	{  
	    JLabel l1, l2, l3, l4, l5, l7;  
	    JTextField tf1, tf2, tf6, p1;  
	    JButton btn1 , btnNewButton;    
	    Cart()  
	    {  
	        setVisible(true);  
	        setSize(700, 700);  
	        getContentPane().setLayout(null);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setTitle("Personal Shopping Cart");  
	        l1 = new JLabel("Personal Shopping Cart:");  
	        l1.setForeground(Color.blue);  
	        l1.setFont(new Font("Serif", Font.BOLD, 20));  
	        l2 = new JLabel("Item Name:");  
	        l3 = new JLabel("Quantity:");  
	        l4 = new JLabel("Estimated Price:");  
	        l5 = new JLabel("Category:");
	        l7 = new JLabel("State:");
	        tf1 = new JTextField();  
	        tf2 = new JTextField();  
	        p1 = new JTextField();  
	        String[] Categories = { "Fruits and Vegetable", "Grains", "Meat", "Dairy Products" };

	      //Create the combo box, select item at index 4.
	      //Indices start at 0, so 4 specifies the pig.
	      JComboBox p2 = new JComboBox(Categories);
	      p2.setSelectedIndex(4);
	      p2.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
	        String cat = (String)cb.getSelectedItem();
	        p2.setSelectedItem(cat);}
	        //updateLabel(cat);}
	      });
				
	        tf6 = new JTextField();
	        btnNewButton = new JButton("Add");
	        btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
	        btn1.addActionListener(this);
	        l1.setBounds(100, 30, 400, 30);  
	        l2.setBounds(80, 71, 200, 30);  
	        l3.setBounds(80, 151, 200, 30);  
	        l4.setBounds(80, 112, 200, 30);  
	        l5.setBounds(80, 190, 200, 30);
	        l7.setBounds(80, 231, 200, 30);
	        tf1.setBounds(300, 70, 200, 30);  
	        tf2.setBounds(300, 110, 200, 30);  
	        p1.setBounds(300, 150, 200, 30);  
	        p2.setBounds(300, 190, 200, 30);
	        tf6.setBounds(300, 231, 200, 30);
	        btn1.setBounds(205, 300, 100, 30);
	        getContentPane().add(l1);  
	        getContentPane().add(l2);  
	        getContentPane().add(tf1);  
	        getContentPane().add(l3);  
	        getContentPane().add(tf2);  
	        getContentPane().add(l4);  
	        getContentPane().add(p1);  
	        getContentPane().add(l5);  
	        getContentPane().add(p2);
	        getContentPane().add(l7);  
	        getContentPane().add(tf6);
	        getContentPane().add(btn1);
	    }  
	    
	    

	    
	    public void actionPerformed1(ActionEvent e)   
	    {
	    	if (e.getSource() == btn1)  
	         {  
	            int x = 0;  
	            String s1 = tf1.getText();  
	            String s2 = tf2.getText();  
	           // char[] s3 = p1.getPassword();  
	           // char[] s4 = p2.getPassword();   
	            //String s8 = new String(s3);  
	            //String s9 = new String(s4);  
	           // String s5 = tf5.getText();  
	            //String s6 = tf6.getText();  
	            //String s7 = tf7.getText();  
	            if (true)  
	            {  
	                try  
	                {  
	                    Class.forName("oracle.jdbc.driver.OracleDriver");  
	                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");  
	                    PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");  
	                  /*  ps.setString(1, s1);  
	                    ps.setString(2, s2);  
	                    ps.setString(3, s8);  
	                    ps.setString(4, s5);  
	                    ps.setString(5, s6);  
	                    ps.setString(6, s7);  */
	                    ResultSet rs = ps.executeQuery();  
	                    x++;  
	                    if (x > 0)   
	                    {  
	                        JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");  
	                    }  
	                }  
	                catch (Exception ex)   
	                {  
	                    System.out.println(ex);  
	                }  
	            }  
	            else  
	            {  
	                JOptionPane.showMessageDialog(btn1, "Password Does Not Match");  
	            }   
	          }   
	          else  
	          {  
	            tf1.setText("");  
	            tf2.setText("");  
	            p1.setText("");  
	           // p2.setText("");  
	            //tf5.setText("");  
	            tf6.setText("");  
	            //tf7.setText("");  
	          }  
	    }
	    
	
	    public static void main(String args[])  
	    {  
	        new Cart();  
	    } 
		public void actionPerformed(ActionEvent e) {
		}
}
