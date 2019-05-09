import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class ProgramTester {
	
	
	public static void main(String[] args) {
<<<<<<< HEAD
		
		Scanner keyboard = new Scanner (System.in);		
		System.out.println("Welcome to our Restaurant Ordering System!");
		System.out.println("Please Register your account");
		//enter account information 			
=======
		Scanner keyboard = new Scanner (System.in);	
		
		System.out.println("Welcome to our Restaurant Ordering System!");
		System.out.println("Please Register your account \n");
		//create model view and controller	
		//User model = new User("Kevin", "Don", "43-34 43trg", "peza361@gmail.com", "3477655676", "password", "123212321232");
/*		User model = InputUserData();
		UserView view = new UserView();			
		UserController controller = new UserController(model, view);
		//display
		controller.updateView();
	
		//update model data
		System.out.println("\nEnter new firstname: ");
		String firstname = keyboard.nextLine(); 
		controller.setUserFirstName(firstname);
		System.out.println("Enter email: ");
		String email = keyboard.nextLine();
		controller.setUserEmail(email);
		controller.updateView();
*/		
		//Choosing a Restaurant
		System.out.println("\nPlease enter which Restaurant you want (Panera Bread / Olive Garden)");
		System.out.println("Press 1 for Panera Bread | Press 2 for Olive Garden");

		Restaurant PaneraBread1 = new Restaurant("Panera Bread"," 67-64 104th st" , "534543234");
		Restaurant PaneraBread2 = new Restaurant("Panera Bread"," 50-40 7 ave" , "654334454");

		Restaurant OliveGarden1 = new Restaurant("Olive Garden"," 54-23 garden street" , "142354323");
		Restaurant OliveGarden2 = new Restaurant("Olive Garden"," 78-22 utopia pkwy" , "43234323");
		
		int ResChoice = keyboard.nextInt();
			
		PaneraBreadMenu panerabreadmenu = new PaneraBreadMenu();  
		OliveGardenMenu olivegardenmenu = new OliveGardenMenu();
		
		if(ResChoice == 1){//Panera Bread
			System.out.println("\nHere are available Panera Bread Restaurants: ");
			System.out.println("[1] " + PaneraBread1.toString());
			System.out.println("[2] " + PaneraBread2.toString());
			System.out.println("\nPlease Select which location you want to order from: ");
			int LocationChoice = keyboard.nextInt();
			
			
			
			if(LocationChoice == 1){//Location NUM1
				System.out.println("Location selected is: " + PaneraBread1.toString() +"\n");
				panerabreadmenu.printMenu();
				System.out.println("Please Select which FOOD/BEVERAGE you would like to order:");
				Order PaneraOrder = new Order();
				int MenuSelection = keyboard.nextInt();
				while(true){
					if((MenuSelection>0) && (MenuSelection<panerabreadmenu.size())){
					MenuItem selected=panerabreadmenu.getMenuItem(MenuSelection);
					System.out.println("[You Selected]" + selected);
					System.out.println("Please Select which FOOD/BEVERAGE you would like to order | Enter 0 to exit ");
					PaneraOrder.addOrderItem(selected);
					//System.out.println(PaneraOrder.tostring());
					PaneraOrder.printOrder();
					MenuSelection = keyboard.nextInt();
					}
					else if(MenuSelection==0){
						break;
					}
					else {
						System.out.println("There is no item for that number. Please enter another number");
						MenuSelection = keyboard.nextInt();
					}
					//(MenuSelection<0) && (MenuSelection>panerabreadmenu.size())
				}//end of loop
				PaneraOrder.calculateBill();
			}//Location #1
			
			
			if(LocationChoice == 2){//Location NUM2
				System.out.println("Location selected is: " + PaneraBread2.toString() +"\n");
				System.out.println("Select which FOOD/BEVERAGE you would like to order:");
				Order PaneraOrder = new Order();
				int MenuSelection = keyboard.nextInt();
				while((MenuSelection>0) && (MenuSelection<13)){

					MenuItem selected=panerabreadmenu.getMenuItem(MenuSelection);
					System.out.println("You Selected: " + selected);
					PaneraOrder.addOrderItem(selected);
					//System.out.println(PaneraOrder.tostring());
					PaneraOrder.printOrder();
					MenuSelection = keyboard.nextInt();
					if(MenuSelection==0){
						break;
					}
				}
			}//Location #2
			else{
				System.out.println("Please enter a number again!");
			}
			panerabreadmenu.printMenu();
			
		}//end of first if statement
		
		
		
		
		
		
		if (ResChoice == 2){//OliveGarden
			System.out.println("\nHere are available Olive Garden Restaurants: ");
			System.out.println(OliveGarden1.toString());
			System.out.println(OliveGarden2.toString());
			
			
		
		
		
		
		
		
		
		
		
		
		
		}//end of second if statement
		
		
		
	}//end of main method

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static User InputUserData(){
		Scanner keyboard = new Scanner (System.in);	
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77
		System.out.print("Please enter first name: ");
	    String firstname = keyboard.nextLine(); 
	    System.out.print("Please enter last name: ");
	    String lastname = keyboard.nextLine();
	    System.out.print("Please enter address name: ");
	    String address = keyboard.nextLine();
	    System.out.print("Please enter email name: ");
	    String email = keyboard.nextLine();
	    System.out.print("Please enter cell phonenumber name: ");
	    String cellphonenumber = keyboard.nextLine();
	    System.out.print("Please enter password name: ");
	    String password = keyboard.nextLine();
<<<<<<< HEAD
	    
	    User you = new User(firstname, lastname, address, email, cellphonenumber, password);
	    System.out.println("User information: " + you.PrintUserDetails());
	    
	    
		
		System.out.println("Please enter which Restaurant you want (Panera Bread / Olive Garden)");
		
				
		Restaurant OliveGarden = new Restaurant("Olive Garden"," 54-23 garden street" , "142354323");
		Restaurant PaneraBread = new Restaurant("Panera Bread"," 67-64 104th st" , "534543234");
		
		OliveGardenMenu ogm = new OliveGardenMenu(); 
		//System.out.println("menu: " + menu);
		//menu.print();
		//System.out.println(Menu.menu.get(1));
		//menu.printMenu();
		ogm.printOliveGardenMenu();
		
		//System.out.println(OliveGardeMenu);
		
	}//end of main method


=======
	    System.out.println("Please enter your credit/debit card number");
	    String PaymentCardNumber = keyboard.nextLine();	    
	    	    
	    User you = new User(firstname,lastname,address,email,cellphonenumber,password,PaymentCardNumber);
	    return you;
		}//Get input from user 
>>>>>>> 547dca0f0c6ffbb8cddb332352a15a34ebcbae77

	
	
	
	
}//end of class
