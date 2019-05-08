import java.util.ArrayList;
//import java.util.HashMap;


public class OliveGardenMenu {

	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
	ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	
	//Constructor
		public void OliveGardenMenu(){
			populateMenu();
		}//Olive Garden Constructor
		
		public void populateMenu(){
		//Making Menu items and adding them to the Hashmap menu
		//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
		
		MenuItem MainDish1 = new MenuItem("Chicken Piccata", 16.79);
		MenuItem MainDish2 = new MenuItem("Chicken Parmigiana", 16.29);
		MenuItem MainDish3 = new MenuItem("Create A Sampler Italiano ", 9.99);
		MenuItem MainDish4 = new MenuItem("Chicken Margherita", 16.29);

		MenuItem Appetizer1 = new MenuItem("Fried Mozzarella", 6.79);
		MenuItem Appetizer2 = new MenuItem("Calamari", 10.29);
		MenuItem Appetizer3 = new MenuItem("Spinach-Artichoke Dip", 9.99);
		MenuItem Appetizer4 = new MenuItem("Classic Shrimp Scampi Fritta", 8.49);

		MenuItem Beverage1 = new MenuItem("Spiked Strawberry Lemonade", 5.00);
		MenuItem Beverage2 = new MenuItem("Watermelon Margarita ", 5.00);
		MenuItem Beverage3 = new MenuItem("Bacardi & Coke ", 5.00);	
	
		menu.add(1, MainDish1);
		menu.add(2, MainDish2);
		menu.add(3, MainDish3);
		menu.add(4, MainDish4);
		
		menu.add(5, Appetizer1);
		menu.add(6, Appetizer2);
		menu.add(7, Appetizer3);
		menu.add(8, Appetizer4);
		
		menu.add(9, Beverage1);
		menu.add(10, Beverage2);
		menu.add(11, Beverage3);		
		
		}//end of populate the menu method
		
	public void printOliveGardenMenu(){
		for(int i= 1; i<olivegardenMenu.size(); i++){
			System.out.println("Number" + i + "  " + olivegardenMenu.get(i) );
		}		
	}
	
	public String printMenu(){
		String thismenu;
		System.out.println("This olivegarden menu is: \n");
		for(int i=1; i<olivegardenMenu.size();i++){
			System.out.println(olivegardenMenu.get(i).toString());
			
		}
		return toString();
	}
	
	
}//end of class




