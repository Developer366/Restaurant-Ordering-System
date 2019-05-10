import org.junit.Test;

import static org.junit.Assert.*;
//import junit.framework.*;
//import junit.framework.Assert;
//import org.junit.Test;
//import org.junit.Assert.*;
//import junit.framework.*;


public class JunitTest {

	
	@Test
	public void testgetItemPrice() {
		//PaneraBreadMenu pbm = new PaneraBreadMenu();
		MenuItem food1 = new MenuItem("Pizza", 9);
		
		//MenuItem Appetizer1 = new MenuItem("Mac & Cheese", 8.79);

		double output = food1.getItemPrice();
		
		assertEquals(9, food1.getItemPrice());
		//pbm.add(2,Appetizer1);
		
	}
	@Test
	public void testgetItemPricefrommenu() {
		PaneraBreadMenu pdm = new PaneraBreadMenu();
		double output = pdm.getMenuItem(3).getItemPrice();
		assertEquals(6.79,output);
		
	}
	
//	OliveGardenMenu olivegardenmenu = new OliveGardenMenu();
/*	@Test
	public void testgetMenuItemolive() {
		OliveGardenMenu olivegardenmenu = new OliveGardenMenu();
		//olivegardenmenu.getMenuItem(2);
		assertEquals(olivegardenmenu.getMenuItem(0))
		//fail("Not yet implemented");
	}
	
	@Test
	public void testgetMenuItemPanera() {
		PaneraBreadMenu pbm = new PaneraBreadMenu();
		
		equals(pbm.getMenuItem(3));
	
		
	}
	
	@Test
	public void testgetlastname() {
		
		
	}
*/	
	

}
