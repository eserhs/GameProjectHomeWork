
public class UserManager implements UserService {
	
	
	RegistrationVerificationService _registrationVerificationService;
	
	

	public UserManager(RegistrationVerificationService _registrationVerificationService) {
	
		this._registrationVerificationService = _registrationVerificationService;
	}

	@Override
	public void add(User user,Campaign campaign) {
		
		if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("kayit ba�arl� ");
			
		}else {
			System.out.println("kay�t olmad�  (kimlik biligilerini kontorl et )");
		}
		
	}

	@Override
	public void delete(User user ,Campaign campaign) {
		if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("silindi  ");
			
		}else {
			System.out.println("silme i�lmei ba�a�s�z  (kimlik biligilerini kontorl et )");
		}
		
	}

	@Override
	public void update(User user ,Campaign campaign) {
if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("G�ncellend�  ");
			
		}else {
			System.out.println("G�ncellenme ba�ar�s�z  (kimlik biligilerini kontorl et )");
		}
		
	}

}
