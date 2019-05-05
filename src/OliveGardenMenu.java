import java.util.ArrayList;
import java.util.HashMap;


public class OliveGardenMenu {

	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
	ArrayList<MenuItem> olivegardenMenu = new ArrayList<MenuItem>();
	
	//Constructor
		public void OliveGardenMenu(){
			populateMenu();
		}
		
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

		
		olivegardenMenu.add(1, MainDish1);
		olivegardenMenu.add(2, MainDish2);
		olivegardenMenu.add(3, MainDish3);
		olivegardenMenu.add(4, MainDish4);
		
		olivegardenMenu.add(5, Appetizer1);
		olivegardenMenu.add(6, Appetizer2);
		olivegardenMenu.add(7, Appetizer3);
		olivegardenMenu.add(8, Appetizer4);
		
		olivegardenMenu.add(9, Beverage1);
		olivegardenMenu.add(10, Beverage2);
		olivegardenMenu.add(11, Beverage3);		
		
		}
		
	public void printOliveGardenMenu(){
		for(int i= 1; i<olivegardenMenu.size(); i++){
			System.out.println(olivegardenMenu.get(i) );
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




