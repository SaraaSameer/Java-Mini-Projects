import java.util.Scanner;
public class shoppingItem {
		    private String itemName;
		    private float itemPrice;
		    private int quantity;
		    private String category;
		    private Boolean urgent;

		    shoppingItem(String itemName, float itemPrice, int quantity, String category, boolean urgent) {
		        this.itemName = itemName;
		        this.itemPrice = itemPrice;
		        this.quantity = quantity;
		        this.category = category;
		        this.urgent = urgent;
		    }

		    public String getName() {
		        return itemName;
		    }

		    public void setName(String itemName) {
		        this.itemName = itemName;
		    }

		    public float getPrice() {
		        return itemPrice;
		    }

		    public void setPrice(float itemPrice) {
		        this.itemPrice = itemPrice;
		    }

		    public int getQuantity() {
		        return quantity;
		    }

		    public void setQuantity(int quantity) {
		        this.quantity = quantity;
		    }

		    public String getCategory() {
		        return category;
		    }

		    public void setCategory(String category) {
		        this.category = category;
		    }

		    public boolean getUrgent() {
		        return urgent;
		    }

		    public void setUrgent(boolean urgent) {
		        this.urgent = urgent;
		    }
		
public static void main(String[] args) {
	
	  String customerName="Mehwish";
      shoppingItem item1= new shoppingItem("Pen",2,2,"Stationary",true);
      Scanner input=new Scanner(System.in);
      System.out.println("Item Name:");
      item1.setName(input.nextLine());
      System.out.println("Item Price:");
      item1.setPrice(input.nextFloat());
      System.out.println("Item Quantity:");
      item1.setQuantity(input.nextInt());
      System.out.println("Item Category:");
      item1.setCategory(input.next());
      System.out.println("Is Urgent:");
      item1.setUrgent(input.nextBoolean());

      float totalItem1 = item1.getPrice()* item1.getQuantity();
      float totalUrgentItem=0;
      if(item1.getUrgent()==true) {
          totalUrgentItem=item1.getPrice()* item1.getQuantity();
      }

      System.out.println ("\n"+"TOTAL COST");
      System.out.println (item1.getName()+": $"+item1.getPrice()+"\nQuantity:" +item1.getQuantity());
      System.out.println ("Total: $"+ totalItem1+"\nTotal Urgent Items: $"+totalUrgentItem);
      System.out.println();
}
}
