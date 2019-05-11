
public class MenuItem {
	String ItemName;
	double ItemPrice;

	
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
		return "" + ItemName + "\tItem Price: $" + ItemPrice;		
		//return "%32s%10d%16s", string1, int1, string2
		//System.out.format("%32s%10d%16s", string1, int1, string2);
		//return System.out.printf("%s%f", ItemName, ItemPrice);
		//return String.format("|%-25d|", ItemPrice);
	}
	
}//end of class
