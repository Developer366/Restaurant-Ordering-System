import java.util.ArrayList;
//import java.util.HashMap;
<<<<<<< HEAD

=======
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77

public class OliveGardenMenu {

	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
<<<<<<< HEAD
	ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
=======
	ArrayList<MenuItem> OGmenu = new ArrayList<MenuItem>();
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
	
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
	
<<<<<<< HEAD
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
=======
		OGmenu.add(1, MainDish1);
		OGmenu.add(2, MainDish2);
		OGmenu.add(3, MainDish3);
		OGmenu.add(4, MainDish4);
		
		OGmenu.add(5, Appetizer1);
		OGmenu.add(6, Appetizer2);
		OGmenu.add(7, Appetizer3);
		OGmenu.add(8, Appetizer4);
		
		OGmenu.add(9, Beverage1);
		OGmenu.add(10, Beverage2);
		OGmenu.add(11, Beverage3);		
		
		}//end of populate the menu method
		
		public void printMenu(){
			System.out.println("-------------------------OLIVE GARDEN MENU-------------------------");
			System.out.format("[Item]\t" + "%-45s %s%n", "Food Item", "Price");
			for(int i= 1; i<OGmenu.size(); i++){
				//System.out.println("Item [" + i + "]:" + "\t" + PBmenu.get(i));
				//System.out.format("%-20s %-12s,PBmenu.get(i).ItemName + "\t Item Price:" + PBmenu.get(i).getItemPrice());
				System.out.format("Item[" + i + "]:\t" + "%-45s$%.2f%n", OGmenu.get(i).getItemName(), OGmenu.get(i).getItemPrice());

			}
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
			
		}
	
}//end of class


/*
public void printOliveGardenMenu(){
	for(int i= 1; i<menu.size(); i++){
		System.out.println("Number" + i + "  " + menu.get(i));
	}		
}

public String printMenu(){
	String thismenu;
	System.out.println("This olivegarden menu is: \n");
	for(int i=1; i<menu.size();i++){
		System.out.println(menu.get(i).toString());
		
	}
	return toString();
	}
*/




