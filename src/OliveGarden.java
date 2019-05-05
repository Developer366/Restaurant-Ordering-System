import java.util.HashMap;

public class OliveGarden {
	
	private String RestaurantName;
	private String RestaurantAddress;
	private String RestaurantID;
	//HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
	

	public OliveGarden(String RestaurantName, String RestaurantAddress, String RestaurantID) {		
		this.RestaurantName=RestaurantName;
		this.RestaurantAddress=RestaurantAddress;
		this.RestaurantID=RestaurantID;
											
		//Making Menuitems and adding them to the Hashmap menu
		HashMap <Integer, MenuItem> OliveGardenMenu = new HashMap<Integer, MenuItem>();
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

		OliveGardenMenu.put(1, MainDish1);
		OliveGardenMenu.put(2, MainDish2);
		OliveGardenMenu.put(3, MainDish3);
		OliveGardenMenu.put(4, MainDish4);
		
		OliveGardenMenu.put(5, Appetizer1);
		OliveGardenMenu.put(6, Appetizer2);
		OliveGardenMenu.put(7, Appetizer3);
		OliveGardenMenu.put(8, Appetizer4);
		
		OliveGardenMenu.put(9, Beverage1);
		OliveGardenMenu.put(10, Beverage2);
		OliveGardenMenu.put(11, Beverage3);			
	}//end of constructor
	

	public void printOliveGardenMenu(){
		for(int i= 1; i<OliveGardenMenu.size(); i++){
			System.out.println("Item: " + OliveGardenMenu.get(i) );
		}
		
	}
	
}//end of class
