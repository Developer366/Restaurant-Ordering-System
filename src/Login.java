import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//Template for database
//User clase

public class Login {
//Connect to databse instance variables
	
/*	Connection con;
	Statement st;
	ResultSet rs; */
	
	JFrame f = new JFrame("User Login");
	JLabel l = new JLabel("Username: ");
	JLabel l1 = new JLabel("Password: ");
	JTextField t = new JTextField(30);
	JTextField t1 = new JTextField(10);
	JButton b = new JButton("Login");
	
	
	public void Login(){
		frame();
		connect();
	
	}
	
	public void connect(){
		try{				
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);
		
//		String db = "jdbc:odbc:ProjectDatabase";
//		con= DriverManager.getConnection(db);
//		st = con.createStatement();
		}
		catch(Exception ex){
			System.out.println("Error in connecting");
		}
	}
	public void frame(){
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JPanel p = new JPanel();
		
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		p.add(b);
		
		f.add(p);
		
	}
	
}
