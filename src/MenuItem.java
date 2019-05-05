
public class MenuItem {
	String ItemName;
	double ItemPrice;
	public Integer toString;
	
	MenuItem(String ItemName, double ItemPrice){
		this.ItemName=ItemName;
		this.ItemPrice=ItemPrice;				
	}
	
	//getters and setters 
	public String getItemName(){
		return ItemName;
	}
	public void setItemName(String ItemName){
		this.ItemName=ItemName;
	}
	
	public double getItemPrice(){
		return ItemPrice;
	}
	public void setItemPrice(double ItemPrice){
		this.ItemPrice=ItemPrice;
	}
	
	//display MenuItem
	public String toString(){
		return "Menu Item:  " + ItemName + "\t  Item Price: $" + ItemPrice;
	}
	
}//end of class
