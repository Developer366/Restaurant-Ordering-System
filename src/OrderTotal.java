import java.util.List;
public class OrderTotal {
	   private int orderID;
	    private String name;
	    private int quantity;
	    private double price;

	    public OrderTotal(int orderID, String name, int quantity, double price) {
	        this.orderID = orderID;
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    public int getOrderID() {
	        return orderID;
	    }

	    public void setOrderID(int orderID) {
	        this.orderID = orderID;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }    
	    
}