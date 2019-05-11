
public class Restaurant {

	private String RestaurantName;
	private String RestaurantAddress;
	private String RestaurantPhoneNumber;
	
	public Restaurant(String RestaurantName, String RestaurantAddress, String RestaurantPhoneNumber) {
		
		this.RestaurantName=RestaurantName;
		this.RestaurantAddress=RestaurantAddress;
		this.RestaurantPhoneNumber=RestaurantPhoneNumber;
		
	}
	
	public String toString(){
		return  "Restaurant Name: " + RestaurantName +
				"\t Restaurant Address: " + RestaurantAddress + 
				"\t\t Restaurant Phone Number: " + RestaurantPhoneNumber;		
	}
	
	//RestaurantName
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String RestaurantName) {
		this.RestaurantName = RestaurantName;
	}
	
	//Restaurant Address
	public String getRestaurantAddress() {
		return RestaurantAddress;
	}	
	public void setRestaurantAddress(String RestaurantAddress) {
		this.RestaurantAddress = RestaurantAddress;
	}
	
	//Restaurant PhoneNumber
	public String getRestaurantPhoneNumber() {
		return RestaurantPhoneNumber;
	}

	public void setRestaurantPhoneNumber(String RestaurantPhoneNumber) {
		this.RestaurantPhoneNumber = RestaurantPhoneNumber;
	}
	
	
}
