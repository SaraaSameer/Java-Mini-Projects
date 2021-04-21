001
import java.awt.*;
002
import java.awt.event.*;
003
import javax.swing.*;
004
import javax.swing.event.*;
005
 
006
public class bookStore extends JFrame
007
{
008
   static String[] yourChoicesItems =
009
                           {
010
                            "Candy                  34.00",
011
                            "Cinderella             19.50",
012
                            "The Seasons with Bird  21.00",
013
                            "The DAM book           66.00",
014
                            "Coloring with Thread   56.00",
015
                            "Little Red  Hood       30.00",
016
                            "Security Engineering   70.00",
017
                            "Journey                22.00",
018
                            "Java                   85.00"
019
                            };
020
    
021
   static double[] yourChoicesPrices = { 34.00,19.50,21.00, 66.00, 56.00, 30.00,70.00, 22.00, 85.00};
022
    
023
   private JList yourChoices;
024
   private checkOutButtonHandler cHandler;
025
   private clearButtonHandler crHandler;
026
   private selectionButtonHandler sHandler;
027
   private removeButtonHandler rmHandler;
028
   private JButton checkB,clearB,selectionB,removeB;
029
   private JCheckBox check;
030
   private JTextArea list,bill;
031
   private Container pane;
032
    
033
   public bookStore()
034
   {
035
      super("Welcome to Success Book Store");
036
 
037
      pane = getContentPane();
038
      pane.setBackground(new Color(0, 100, 200));
039
      pane.setLayout(new BorderLayout(5, 5));
040
 
041
      JLabel yourChoicesJLabel = new JLabel("The Book List                                        Shopping Cart  ");
042
      pane.add(yourChoicesJLabel,BorderLayout.NORTH);
043
      yourChoicesJLabel.setFont(new Font("Dialog",Font.BOLD,20));
044
 
045
      JPanel m=new JPanel();
046
      yourChoices = new JList(yourChoicesItems);
047
      m.add(yourChoices);
048
      yourChoices.setFont(new Font("Courier",Font.BOLD,14));
049
      pane.add(m,BorderLayout.WEST);
050
       
051
      selectionB=new JButton("Selection");
052
      sHandler=new selectionButtonHandler();
053
      selectionB.addActionListener(sHandler);
054
      m.add(selectionB);
055
      
056
      JPanel p=new JPanel();
057
      list = new JTextArea(20,50);
058
      p.add(list);
059
      list.setFont(new Font("Courier",Font.PLAIN,14));
060
       
061
      checkB=new JButton("Check out");
062
      cHandler=new checkOutButtonHandler();
063
      checkB.addActionListener(cHandler);
064
       
065
      clearB=new JButton("Clear");
066
      crHandler=new clearButtonHandler();
067
      clearB.addActionListener(crHandler);
068
       
069
      removeB=new JButton("Remove");
070
      rmHandler=new removeButtonHandler();
071
      removeB.addActionListener(rmHandler);
072
       
073
      p.add(removeB);
074
      p.add(clearB);
075
      p.add(checkB);
076
 
077
      bill = new JTextArea(20,60);
078
      p.add(bill);
079
      bill.setFont(new Font("Courier",Font.PLAIN,12));
080
      pane.add(p,BorderLayout.CENTER);
081
       
082
      setSize(800, 800);
083
      setVisible(true);
084
      setDefaultCloseOperation(EXIT_ON_CLOSE);
085
   }
086
    
087
   private void displayList()
088
   {
089
      list.setEditable(false);
090
      list.setText("");
091
      int[] listArray = yourChoices.getSelectedIndices();
092
       
093
      for (int index = 0; index < listArray.length; index++)
094
      {
095
         list.append(yourChoicesItems[listArray[index]] + "\n");
096
      }
097
 
098
      list.append("\n");
099
   }
100
    
101
   private void displayBill()
102
   {
103
      int[] listArray = yourChoices.getSelectedIndices();
104
       
105
      double subTotal = 0;
106
      double total;
107
 
108
      bill.setEditable(false);
109
      bill.setText("");
110
 
111
      for (int index = 0; index < listArray.length; index++)
112
          subTotal = subTotal
113
                     + yourChoicesPrices[listArray[index]];
114
      total = subTotal ;
115
 
116
      bill.append("TOTAL    \t\tRM"
117
                 + String.format("%.2f", total) + "\n\n");
118
      bill.append("Thank you - Have a Nice Day\n\n");
119
 
120
          //Reset list array.
121
      yourChoices.clearSelection();
122
 
123
      repaint();
124
   }
125
    
126
   
127
   private class checkOutButtonHandler implements ActionListener
128
   {
129
        public void actionPerformed(ActionEvent e)
130
        {
131
            if(e.getActionCommand().equals("Check out"))
132
            displayBill();
133
        }  
134
    }
135
    
136
   private class clearButtonHandler implements ActionListener
137
   {
138
        public void actionPerformed(ActionEvent e)
139
        {
140
            
141
        }  
142
   }
143
    
144
   private class selectionButtonHandler implements ActionListener
145
   {
146
        public void actionPerformed(ActionEvent e)
147
        {
148
            if(e.getActionCommand().equals("Selection"))
149
            displayList();
150
        }  
151
    }
152
     
153
   private class removeButtonHandler implements ActionListener
154
   {
155
        public void actionPerformed(ActionEvent e)
156
        {
157
            
158
        }  
159
   }
160
    
161
   public static void main(String[] args)
162
   {
163
        bookStore book = new bookStore();
164
   }
165
}
