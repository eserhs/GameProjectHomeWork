

public class Gamer extends User {
	
	 private String National›dentity ;
	 
	private String firstName;
	 private String lastName;
	 
	 
	public Gamer(String national›dentity, String firstName, String lastName) {
		super();
		National›dentity = national›dentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getNational›dentity() {
		return National›dentity;
	}


	public void setNational›dentity(String national›dentity) {
		National›dentity = national›dentity;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
