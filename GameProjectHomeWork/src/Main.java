

public class Main {

	public static void main(String[] args) {
	
		
		User user1 = new User();
		user1.setEmail("cezaevi@gmail.com");
		user1.setGamerPi("1453");
		user1.setId(1);
		UserManager manager = new UserManager( new RegistrationVerificationManager());
		
		CampignManager campignManager = new CampignManager();
		campignManager.addCampaign();
		campignManager.MakeACampaign();
		
	Campaign campaign=	new Campaign("çilgin yapanya ", 25, 100,75);
		manager.add(user1 ,campaign );
		manager.delete(user1,campaign);
		manager.update(user1,campaign);
		

	}

}
