import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class ProgramTester {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);	
		
		System.out.println("Welcome to our Restaurant Ordering System!");
		System.out.println("Please Register your account \n");
		//create model view and controller	
		//User model = new User("Kevin", "Don", "43-34 43trg", "peza361@gmail.com", "3477655676", "password", "123212321232");
		User model = InputUserData();
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
		
		//Choosing a Restaurant
		System.out.println("\nPlease enter which Restaurant you want (Panera Bread / Olive Garden)");
		System.out.println("Press 1 for Panera Bread | Press 2 for Olive Garden");

		Restaurant PaneraBread1 = new Restaurant("Panera Bread"," 67-64 104th st" , "534-543-2345");
		Restaurant PaneraBread2 = new Restaurant("Panera Bread"," 50-40 7th ave" , "654-334-4548");

		Restaurant OliveGarden1 = new Restaurant("Olive Garden"," 54-23 garden street" , "347-354-8323");
		Restaurant OliveGarden2 = new Restaurant("Olive Garden"," 78-22 utopia pkwy" , "347-343-2356");
		
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
				System.out.println("Please Select which FOOD/BEVERAGE (Enter Number) you would like to order: ");
				Order PaneraOrder = new Order();
				int MenuSelection = keyboard.nextInt();
				
				while(true){
					if((MenuSelection>0) && (MenuSelection<panerabreadmenu.size())){
					MenuItem selected=panerabreadmenu.getMenuItem(MenuSelection);
					System.out.println("[You Selected]" + selected);
					System.out.println("Please Select which FOOD/BEVERAGE you would (Enter Number) like to order | Enter 0 to exit ");
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
				panerabreadmenu.printMenu();
				System.out.println("Please Select which FOOD/BEVERAGE (Enter Number) you would like to order | Enter 0 to exit ");
				Order PaneraOrder = new Order();
				int MenuSelection = keyboard.nextInt();
				while(true){
					if((MenuSelection>0) && (MenuSelection<panerabreadmenu.size())){
					MenuItem selected=panerabreadmenu.getMenuItem(MenuSelection);
					System.out.println("[You Selected]:" + selected);
					System.out.println("Please Select which FOOD/BEVERAGE you would (Enter Number) like to order | Enter 0 to exit");
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
						MenuSelection= keyboard.nextInt();
					}
				}//end of loop
				PaneraOrder.calculateBill();
			}//Location #2
				
		}			
								
		
		if (ResChoice == 2){//OliveGarden 1
			System.out.println("\nHere are available Olive Garden Restaurants: ");
			System.out.println("[1]" + OliveGarden1.toString());
			System.out.println("[2]" + OliveGarden2.toString());
			System.out.println("\nPlease Select which location you want to order from: ");
			int LocationChoice = keyboard.nextInt();
						
			
			if(LocationChoice == 1){//Location NUM1
				System.out.println("Location selected is: " + OliveGarden1.toString() +"\n");
				olivegardenmenu.printMenu();
				System.out.println("Please Select which FOOD/BEVERAGE (Enter Number) you would like to order: ");
				Order OliveGardenOrder = new Order();
				int MenuSelection1 = keyboard.nextInt();
				
				while(true){
					if((MenuSelection1>0) && (MenuSelection1<olivegardenmenu.size())){
					MenuItem selected=olivegardenmenu.getMenuItem(MenuSelection1);
					System.out.println("[You Selected]" + selected);
					System.out.println("Please Select which FOOD/BEVERAGE you would (Enter Number) like to order | Enter 0 to exit ");
					OliveGardenOrder.addOrderItem(selected);
					//System.out.println(PaneraOrder.tostring());
					OliveGardenOrder.printOrder();
					MenuSelection1 = keyboard.nextInt();
					}
					else if(MenuSelection1==0){
						break;
					}
					else {
						System.out.println("There is no item for that number. Please enter another number");
						MenuSelection1 = keyboard.nextInt();
					}
						//(MenuSelection<0) && (MenuSelection>panerabreadmenu.size())
				}//end of loop
				OliveGardenOrder.calculateBill();
			}//Location #1
			
			
			if(LocationChoice == 2){//Location NUM2
				System.out.println("Location selected is: " + OliveGarden2.toString() +"\n");
				olivegardenmenu.printMenu();
				System.out.println("Please Select which FOOD/BEVERAGE (Enter Number) you would like to order | Enter 0 to exit ");
				Order OliveGardenOrder = new Order();
				int MenuSelection = keyboard.nextInt();
				while(true){
					if((MenuSelection>0) && (MenuSelection<olivegardenmenu.size())){
					MenuItem selected=olivegardenmenu.getMenuItem(MenuSelection);
					System.out.println("[You Selected]:" + selected);
					System.out.println("Please Select which FOOD/BEVERAGE you would (Enter Number) like to order | Enter 0 to exit");
					OliveGardenOrder.addOrderItem(selected);
					//System.out.println(PaneraOrder.tostring());
					OliveGardenOrder.printOrder();
					MenuSelection = keyboard.nextInt();
					}
					
					else if(MenuSelection==0){
						break;
					}
					else {
						System.out.println("There is no item for that number. Please enter another number");
						MenuSelection= keyboard.nextInt();
					}
				}//end of loop
				OliveGardenOrder.calculateBill();
			}//Location #2
											
		}//end of second if statement
				
		
	}//end of main method


	
	public static User InputUserData(){
		Scanner keyboard = new Scanner (System.in);	
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
	    System.out.println("Please enter your credit/debit card number");
	    String PaymentCardNumber = keyboard.nextLine();	    
	    	    
	    User you = new User(firstname,lastname,address,email,cellphonenumber,password,PaymentCardNumber);
	    return you;
		}//Get input from user 


	
	
}//end of class
