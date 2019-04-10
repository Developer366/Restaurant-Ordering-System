import java.io.InputStream;

public class User {

	private String firstname;
	private String lastname;
	private String address;
	private String email;
	private String cellphonenumber;
	private String password;
	
	User (String firstname, String lastname, String address, String email, String cellphonenumber, String password){
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.email=email;
		this.cellphonenumber=cellphonenumber;
		this.password=password;
		
	}
	public String toString(){
		return firstname+ /n + lastname + address + email + cellphonenumber + password;
	}

}
