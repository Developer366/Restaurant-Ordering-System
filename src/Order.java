import java.util.ArrayList;
public class Order {
	
	 	private int orderID;
	    private double price;
	    private String date;  
	    private String name;
	    private int quantity;

	    
	    public Order(int orderID, double price, String date, String name, int quantity) {
	        this.orderID = orderID;
	        this.price = price;
	        this.date = date;
	        this.name = name;
	        this.quantity = quantity;
	    }
	    
	    private ArrayList <Menu> order = new ArrayList<Menu>();
	    
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
	    
	  
	
}
