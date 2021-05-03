
public class User  {
	
	private  int id;
	private String GamerPi;
	private String email;
	

	
	 public  User () {
		 
		 
	 }
	public User(int id, String gamerPi ,String email) {
	
		this.id = id;
		this.GamerPi = gamerPi;
	this.email=email;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGamerPi() {
		return GamerPi;
	}
	public void setGamerPi(String gamerPi) {
		GamerPi = gamerPi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
