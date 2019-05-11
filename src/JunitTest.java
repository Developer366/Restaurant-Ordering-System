import org.junit.Test;

import static org.junit.Assert.*;

//import java.awt.Menu;
//import junit.framework.*;
//import junit.framework.Assert;
//import org.junit.Test;
//import org.junit.Assert.*;
//import junit.framework.*;

public class JunitTest {


//Menu Item Methods	
	@Test
	public void TestgetItemName(){
		MenuItem food1 = new MenuItem("Pizza", 10.99);
		String output = food1.getItemName();
		assertEquals("Pizza" , output);
	}//#1
			
	@Test
	public void TestgetItemPrice() {		
		MenuItem food2 = new MenuItem("Lasagna", 10.99);				
		double output = food2.getItemPrice();		
		assertEquals(output, food2.getItemPrice(),0);	
	}//#2
	
//Panera Bread Menu Methods
		
	@Test
	public void TestgetItemPricePaneraBreadMenu() {
		PaneraBreadMenu pdm = new PaneraBreadMenu();
		//PBmenu.add(3, MainDish3);
		//MenuItem MainDish3 = new MenuItem("BBQ Chicken Flatbread", 6.79);
		double output = pdm.getMenuItem(3).getItemPrice();
		assertEquals(6.79,output,0);
		
	}//#3
	
//Olive Garden Menu Methods
	
	@Test
	public void TestgetItemNameOliveGardenMenu(){
		OliveGardenMenu ogm = new OliveGardenMenu();
		//OGmenu.add(5, Appetizer1);
		//MenuItem Appetizer1 = new MenuItem("Fried Mozzarella", 6.79);
		String output1 = ogm.getMenuItem(5).getItemName();
		assertEquals(output1, "Fried Mozzarella");
	}//#4
	
	@Test
	public void TestgetMenuItemOliveGardenMenu(){
		OliveGardenMenu ogm = new OliveGardenMenu();
		//OGmenu.add(5, Appetizer1);
		MenuItem Appetizer1 = new MenuItem("Fried Mozzarella", 6.79);
		MenuItem menuitem5 = ogm.getMenuItem(5);
		assertEquals(menuitem5.toString(), Appetizer1.toString());
	}//#5
	
//Restaurant Class
	
	@Test
	public void TestgetRestaurantAddress(){
		//Restaurant PaneraBread1 = new Restaurant("Panera Bread"," 67-64 104th st" , "534-543-2345");
		Restaurant PizzaHut = new Restaurant("PizzaHut23","6051 Myrtle Ave","(718) 456-5300");
		String pizzahutAddress=PizzaHut.getRestaurantAddress();;
		assertEquals(pizzahutAddress,"6051 Myrtle Ave");		
	}//#6


}//end of Junit Class
