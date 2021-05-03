
public class CorporatePlayer extends User {
	
	private String CompanyName;
	private String companyNumber; 
	
	
	
	public CorporatePlayer(String companyName, String companyNumber) {
		super();
		CompanyName = companyName;
		this.companyNumber = companyNumber;
	}



	public String getCompanyName() {
		return CompanyName;
	}



	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}



	public String getCompanyNumber() {
		return companyNumber;
	}



	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

}
