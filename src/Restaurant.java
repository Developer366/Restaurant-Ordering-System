
public class Restaurant {

	private String RestaurantName;
	private String RestaurantAddress;
	private String RestaurantID;
	
	public Restaurant(String RestaurantName, String RestaurantAddress, String RestaurantID) {
		
		this.RestaurantName=RestaurantName;
		this.RestaurantAddress=RestaurantAddress;
		this.RestaurantID=RestaurantID;
		
	}
	public String toString(){
		return  "Restaurant Name: " + RestaurantName +
				"\t Restaurant Address: " + RestaurantAddress + 
				"\t Restaurant ID: " + RestaurantID;
		
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
	//Restaurant ID
	public String getRestaurantID() {
		return RestaurantID;
	}

	public void setRestaurantID(String RestaurantID) {
		this.RestaurantID = RestaurantID;
	}
	
	
}
