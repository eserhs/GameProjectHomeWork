

public class Gamer extends User {
	
	 private String NationalĘdentity ;
	 
	private String firstName;
	 private String lastName;
	 
	 
	public Gamer(String nationalĘdentity, String firstName, String lastName) {
		super();
		NationalĘdentity = nationalĘdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getNationalĘdentity() {
		return NationalĘdentity;
	}


	public void setNationalĘdentity(String nationalĘdentity) {
		NationalĘdentity = nationalĘdentity;
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
