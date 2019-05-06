import java.util.ArrayList;
import java.util.HashMap;

public class PaneraBreadMenu {


	ArrayList<MenuItem> panerabreadMenu = new ArrayList<MenuItem>();
	//private String RestaurantName;
	//private String RestaurantAddress;
	//private String RestaurantID;
	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
	
	public void PaneraBreadMenu(){
		populateMenu();
	}
	//public OliveGarden(String RestaurantName, String RestaurantAddress, String RestaurantID) {		
	//	this.RestaurantName=RestaurantName;
	//	this.RestaurantAddress=RestaurantAddress;
	//	this.RestaurantID=RestaurantID;
											
		//Making Menu items and adding them to the Hashmap menu
		//HashMap <Integer, MenuItem> PaneraBreadMenu = new HashMap<Integer, MenuItem>();
		public void populateMenu(){
		MenuItem MainDish1 = new MenuItem("Chipotle Chicken Avocado Melt ", 9.59);
		MenuItem MainDish2 = new MenuItem("Roasted Turkey, Apple & Cheddar Sandwich ", 9.99);
		MenuItem MainDish3 = new MenuItem("BBQ Chicken Flatbread", 6.79);
		MenuItem MainDish4 = new MenuItem("Frontega Chicken Panini", 9.29);
		MenuItem MainDish5 = new MenuItem("Toasted Tuscan Grilled Chicken", 9.99);

		MenuItem Appetizer1 = new MenuItem("Mac & Cheese", 8.79);
		MenuItem Appetizer2 = new MenuItem("Summer Corn Chowder", 6.19);
		MenuItem Appetizer3 = new MenuItem("Chicken Noodle Soup", 6.19);
		MenuItem Appetizer4 = new MenuItem("Cream of Chicken & Wild Rice Soup", 6.19);

		MenuItem Beverage1 = new MenuItem("Agave Lemonade", 2.69);
		MenuItem Beverage2 = new MenuItem("Passion Papaya Green Tea", 2.69);
		MenuItem Beverage3 = new MenuItem("Blood Orange Lemonade", 2.69);	

		panerabreadMenu.add(1, MainDish1);
		panerabreadMenu.add(2, MainDish2);
		panerabreadMenu.add(3, MainDish3);
		panerabreadMenu.add(4, MainDish4);
		
		panerabreadMenu.add(5, Appetizer1);
		panerabreadMenu.add(6, Appetizer2);
		panerabreadMenu.add(7, Appetizer3);
		panerabreadMenu.add(8, Appetizer4);
		
		panerabreadMenu.add(9, Beverage1);
		panerabreadMenu.add(10, Beverage2);
	
		//end of constructor
	
		}
		
	public void printPaneraBreadMenu(){
		for(int i= 1; i<panerabreadMenu.size(); i++){
			System.out.println("Item: " + panerabreadMenu.get(i) );
		}
		
	}
	
}//end of class



