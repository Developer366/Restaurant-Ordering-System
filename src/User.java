
public class User {
	//instance variables
	private  String firstname;
	private  String lastname;
	private  String address;
	private  String email;
	private  String cellphonenumber;
	private  String password;
	private  String PaymentCardNumber;
	
	//user object constructor
	public User (String firstname, String lastname, String address, String email, String cellphonenumber, String password, String PaymentCardNumber){
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.email=email;
		this.cellphonenumber=cellphonenumber;
		this.password=password;
		this.PaymentCardNumber=PaymentCardNumber;		
	}//end of constructor
			
	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getcellphonenumber() {
		return cellphonenumber;
	}

	public void setcellphonenumber(String cellphonenumber) {
		this.cellphonenumber = cellphonenumber;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getPaymentCardNumber() {
		return PaymentCardNumber;
	}
	public void setPaymentCardNumber(String PaymentCardNumber) {
		this.PaymentCardNumber = PaymentCardNumber;
	}
	public String toString(){
		return "\nFirst Name: " + firstname + 
				"\nLast Name: " + lastname + 
				"\nAddress: " + address + 
				"\nEmail: " + email + 
				"\nCell Phone Number: " + cellphonenumber +
				"\nPassword: " + password + 
				"\nCredit/Debit card: " + PaymentCardNumber;
	}
		
}
