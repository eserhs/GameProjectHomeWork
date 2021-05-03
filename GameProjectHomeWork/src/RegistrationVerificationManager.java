
public class RegistrationVerificationManager implements RegistrationVerificationService {

	@Override
	public boolean save(User user) {
		
		if (user.getGamerPi()=="1453"&&user.getId()==1&&user.getEmail()=="cezaevi@gmail.com" ) {
			
			return true;
			
			
		}else {
			return false;
					}
	
		
	}

}
