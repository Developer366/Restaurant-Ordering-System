import java.util.ArrayList;
import java.util.HashMap;

public class PaneraBreadMenu {

	ArrayList<MenuItem> PBmenu = new ArrayList<MenuItem>();
	
	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
	
	public PaneraBreadMenu(){
		populateMenu();
	}//end of Panera Bread Constructor
										
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

		PBmenu.add(0, null);
		PBmenu.add(1, MainDish1);
		PBmenu.add(2, MainDish2);
		PBmenu.add(3, MainDish3);
		PBmenu.add(4, MainDish4);
		PBmenu.add(5, MainDish5);
		
		PBmenu.add(6, Appetizer1);
		PBmenu.add(7, Appetizer2);
		PBmenu.add(8, Appetizer3);
		PBmenu.add(9, Appetizer4);
		
		PBmenu.add(10, Beverage1);
		PBmenu.add(11, Beverage2);
		PBmenu.add(12, Beverage3);
		
		}//end of constructor
		
		
		//get MenuItem from the Menu
		public MenuItem getMenuItem(int index){
			return PBmenu.get(index);
		}
		

		
		
		
		
		
		
		
		
		public void printMenu(){
			System.out.println("-------------------------PANERA BREAD MENU-------------------------");
			System.out.format("[Item]\t" + "%-45s %s%n", "Food Item", "Price");
				for(int i= 1; i<PBmenu.size(); i++){
					//System.out.println("Item [" + i + "]:" + "\t" + PBmenu.get(i));
					//System.out.format("%-20s %-12s,PBmenu.get(i).ItemName + "\t Item Price:" + PBmenu.get(i).getItemPrice());
					System.out.format("Item[" + i + "]:\t" + "%-45s$%.2f%n", PBmenu.get(i).getItemName(), PBmenu.get(i).getItemPrice());

				}
		
		}
		//get the menu size
		public int size() {
			return PBmenu.size();
		}

	
	
	
}//end of class



