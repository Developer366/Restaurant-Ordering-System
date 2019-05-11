import java.util.ArrayList;

public class Order {
	
		//ORDER LIST
		private ArrayList <MenuItem> order = new ArrayList<MenuItem>();
		
		//fields 	
	    private final double tax = 1.08875;//8.875 tax
	    private final double tip=1.15;//15% tip
	 	private double subtotal;
	 	private double total;
	 	//int orderNO;
	 	
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
	    public void removeItem(MenuItem selected){
	    	order.remove(selected);
	    }
	    
	    //get order size
	    public int getSize(){
	    	return order.size();	    	
	    }
	    
/*	    //get order number
	    public int getNumber(){
	    	return orderNO;
	    }
	    
	    //add 1 to order number
	    public void incramentNO(){
	    	orderNO++;
	    }
*/	    
	    public String toString(){
	    	String str = null;
	    	for(int i= 0; i<order.size();i++){
	    		str = order.get(i).toString() + "\n";
	    	}
	    	return str;
	    }
	    
	    //prints the ORDER LIST
		public void printOrder(){
			System.out.println("----------------------------ORDER----------------------------");
			System.out.format("[Item]\t\t\t  [Food Item] \t\t\t     [Price]\n");

				for(int i= 0; i<order.size(); i++){
					System.out.format("Item[" + (i+1) + "]:\t" + "%-45s$%.2f%n", order.get(i).getItemName(), order.get(i).getItemPrice());					
				}		
		}
	    
		public void calculateBill(){
			for(int i= 0; i<order.size(); i++){								
				subtotal+=order.get(i).getItemPrice();				
			}
			
			total+=subtotal*tax*tip;
			System.out.println("[Subtotal]: $" + subtotal);
			System.out.print("[Total] (including 8.875% tax and 15% tip): $");			
			System.out.format("%.2f%n", total);
			System.out.println("Thank you for ordering. Your food will come shortly!");
		}
}//end of class
	  



