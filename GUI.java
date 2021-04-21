import javax.swing.*; 

/*public class GUI
{

  public static void main(String[] args)
  {
    // schedule this for the event dispatch thread (edt)
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        displayJFrame();
      }
    });
  }

  static void displayJFrame()
  {
    // set the jframe title in the constructor
   JFrame jframe = new JFrame("Personal Shopping Cart");

    // all the other jframe setup stuff
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.pack();
    jframe.setBounds(80,30,120,40);
    //jframe.setLocationRelativeTo(null);
    jframe.setVisible(true);
  }

}*/

//Java program to create frames
//using association

public class GUI
{
	JFrame frame;

	GUI()
	{
		// creating instance of JFrame with name "first way"
		frame=new JFrame("first way");
		
		// creates instance of JButton
		JButton button = new JButton("Clikck here");

		button.setBounds(200, 150, 120, 80);
		
		// setting close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// adds button in JFrame
		frame.add(button);

		// sets 500 width and 600 height
		frame.setSize(500, 600);
		
		// uses no layout managers
		frame.setLayout(null);
		
		// makes the frame visible
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GUI();
	}
}