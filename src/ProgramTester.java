import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ProgramTester {

	public static void main(String[] args) {
									 				 		 
		 
		//Menu menu = new Menu ();
		OliveGardenMenu ogm = new OliveGardenMenu(); 
		//System.out.println("menu: " + menu);
		//menu.print();
		//System.out.println(Menu.menu.get(1));
		//menu.printMenu();
		ogm.printOliveGardenMenu();
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
	    String cellphonenumber = keyboard.next();
	    System.out.print("Please enter password name: ");
	    String password = keyboard.nextLine();
	    
	//    User you = new User(firstname, lastname, address, email, cellphonenumber, password);
	 //   System.out.println("User information: " + you.toString());
	    
		System.out.println("Please login or register");
		
		System.out.println("Please enter which Restaurant you want (Panera Bread / Olive Garden)");
		
				
		Restaurant OliveGarden = new Restaurant("Olive Garden"," 54-23 garden street" , "142354323");
		Restaurant PaneraBread = new Restaurant("Panera Bread"," 67-64 104th st" , "534543234");
		
		
		
		//System.out.println(OliveGardeMenu);
		
	}//end of main method



}//end of class
