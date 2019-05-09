import java.util.ArrayList;
<<<<<<< HEAD
public class Order {
	
	 	private int orderID;
	    private double price;
	    private String date;  
	    private String name;
	    private int quantity;

	    
	    public Order(int orderID, double price, String date, String name, int quantity) {
=======

public class Order {
		//fields
		private ArrayList <MenuItem> order = new ArrayList<MenuItem>();
	 	//private static int orderNO = 0;
	    private final double tax = 1.08875;//8.875 tax
	 	private double subtotal;
	 	private double total;
	 	private double tip=1.15;
	 	//private double price;
	    //private String date;  
	    //private String name;
	    //private int quantity;
	    
	    
/*	    public Order(int orderID, double price, String date, String name, int quantity) {
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
	        this.orderID = orderID;
	        this.price = price;
	        this.date = date;
	        this.name = name;
	        this.quantity = quantity;
	    }
<<<<<<< HEAD
	    
	    private ArrayList <Menu> order = new ArrayList<Menu>();
=======
*/
	    public Order(){
	    	    	
	    }
	        
	    
	  	//add item to order    
	    public void addOrderItem(MenuItem selected){
	    	order.add(selected);
	    	//System.out.println(selected);
	    }
	    
	    
	    //clear order
	    public void clearOrder(){
	    	order.clear();	    	
	    }
	    //remove item
//	    public void removeItem(Item item){
//	    	order.remove(item);
//	    }
	    //get order size
	    public int getSize(){
	    	return order.size();
	    	
	    }
	    //get order number
	    public int getNumber(){
	    	return orderNO;
	    }
	    //add 1 to order number
	    public void incramentNO(){
	    	orderNO++;
	    }
	    
	    public String toString(){
	    	String str = null;
	    	for(int i= 0; i<order.size();i++){
	    		str = order.get(i).toString() + "\n";
	    	}
	    	return str;
	    }
	    

		public void printOrder(){
			System.out.println("-------------------------ORDER-------------------------");
			//System.out.format("[Item]\t" + "%-45s %s%n", "Food Item", "Price");
				for(int i= 0; i<order.size(); i++){
					//System.out.println("OrderItem [" + i + "]:" + "\t" + order.get(i));
					//System.out.format("%-20s %-12s,PBmenu.get(i).ItemName + "\t Item Price:" + PBmenu.get(i).getItemPrice());
					System.out.format("Item[" + (i+1) + "]:\t" + "%-45s$%.2f%n", order.get(i).getItemName(), order.get(i).getItemPrice());
					
				}
		
		}
	    
		public void calculateBill(){
			for(int i= 0; i<order.size(); i++){
				
				//System.out.println("OrderItem [" + i + "]:" + "\t" + order.get(i));
				//System.out.format("%-20s %-12s,PBmenu.get(i).ItemName + "\t Item Price:" + PBmenu.get(i).getItemPrice());
				//System.out.format("Item[" + (i+1) + "]:\t" + "%-45s$%.2f%n", order.get(i).getItemName(), order.get(i).getItemPrice());
				subtotal+=order.get(i).getItemPrice();				
			}
			total+=subtotal*tax*tip;
			System.out.println("subtotal: " + subtotal);
			System.out.println("total including 8.875% tax and 15% tip: " + total);
		}
	    
	    
	    
	    
	    
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
	    
	    //order ID getters
	    public int getOrderID() {
	        return orderID;
	    }
	    //order ID setters
	    public void setOrderID(int orderID) {
	        this.orderID = orderID;
	    }
	    //price getters
	    public double getPrice() {
	        return price;
	    }
	    //price setters
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    //date getters
	    public String getDate() {
	        return date;
	    }
	    //date setters
	    public void setDate(String date) {
	        this.date = date;
	    }
	    //name getters
	    public String getName() {
	    	return name;
	    }
	    //name setters
	    public void setName(String name) {
	    	this.name=name;
	    }
	    //quantity getters
	    public int getQuantity() {
	    	return quantity;
	    }
	    //quantity setters
	    public void setQuantity(int quantity) {
	    	this.quantity = quantity;
	    }
	    
	    public String tostring() {
	    	
	    	String str=" " ;
	    	for(int i=0;i< order.size();i++) {
	    		
	    	str = order.get(i).toString()	+ " \n\n"; 
	    	}
	    	
			return str;
	    	
	    }
<<<<<<< HEAD
	    
	  
	
}
=======

		public void addItem(MenuItem selected) {
			
			
		}
	 
	
}
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
