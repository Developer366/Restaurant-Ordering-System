import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Menu {
	 //instances & lists
	//HashMap <Integer, MenuItem> menu = new HashMap<Integer, MenuItem>();
	ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	//HashMap <Integer, MenuItem> Menu = new HashMap<Integer, MenuItem>();
	//ArrayList<Integer> myList = new ArrayList<Integer>();
	
	
	//Constructor
	public Menu(){
		populateMenu();
	}

	//Methods	
	public void populateMenu(){
	//add to your menu list
		
	MenuItem MainDish1 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem MainDish2 = new MenuItem("Chicken Parmigiana", 16.29);
	MenuItem MainDish3 = new MenuItem("Chicken Margherita", 16.29);
	MenuItem MainDish4 = new MenuItem("Chicken Alfredo", 17.79);

	MenuItem Appetizer1 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem Appetizer2 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem Appetizer3 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem Appetizer4 = new MenuItem("Chicken Piccata", 16.79);

	MenuItem Beverage1 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem Beverage2 = new MenuItem("Chicken Piccata", 16.79);
	MenuItem Beverage3 = new MenuItem("Chicken Piccata", 16.79);	

	//myList.add(4);
	//menu.add(new MenuItem("Chicken Piccat", 16.79 ));
	menu.add(0, null);
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
	//System.out.println(menu);
	}
	
	public void print(){
		for(int i=1;i<menu.size();i++){
		    System.out.println(menu.get(i));
		} 
	}
	public String printMenu(){
		String thismenu;
		System.out.println("This olivegarden menu is: \n");
		for(int i=1; i<menu.size();i++){
			System.out.println(menu.get(i).toString());
			
		}
		return null;
	}
	
	
}

