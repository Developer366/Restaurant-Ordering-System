
public class UserController {

	private User model;
	private UserView view; 
	
	public UserController(User model, UserView view){
		this.model = model;
		this.view = view;		
	}
	
	//first name
	public void setUserFirstName(String firstname){
		model.setfirstname(firstname);
	}
	
	public String getUserFirstName() {
		return model.getfirstname();
	}
	//last name
	public void setUserLastName(String lastname){
		model.setlastname(lastname);
	}
	
	public String getUserLastName(){
		return model.getlastname();
	}
	
	//user address
	public void setUserAddress(String address){
		model.setaddress(address);
	}
	
	public String getUserAddress() {
		return model.getaddress();
	}
	//email
	public void setUserEmail(String email){
		model.setemail(email);
	}
	
	public String getUserEmail(){
		return model.getemail();
	}
	//user cell phone
	public void setCellPhoneNumber(String cellphonenumber){
		model.setcellphonenumber(cellphonenumber);
	}
	public String getCellPhoneNumber(){
		return model.getemail();
	}
	//user password
	public void setPassword(String password){
		model.setpassword(password);
	}
	public String getPassword(){
		return model.getemail();
	}
	// User Payment method
	public void setPaymentCardMethod(String password){
		model.setpassword(password);
	}
	public String getPaymentCardMethod(){
		return model.getpassword();
	}
	//update view
	public void updateView(){
		UserView.printUserDetails(model.getfirstname(), model.getlastname(), model.getaddress(), model.getemail(), model.getcellphonenumber(), model.getpassword(), model.getPaymentCardNumber());
	}
	
	//https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
	
	
	
	
}
