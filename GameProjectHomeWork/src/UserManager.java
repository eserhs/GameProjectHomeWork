
public class UserManager implements UserService {
	
	
	RegistrationVerificationService _registrationVerificationService;
	
	

	public UserManager(RegistrationVerificationService _registrationVerificationService) {
	
		this._registrationVerificationService = _registrationVerificationService;
	}

	@Override
	public void add(User user,Campaign campaign) {
		
		if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("kayit baþarlý ");
			
		}else {
			System.out.println("kayýt olmadý  (kimlik biligilerini kontorl et )");
		}
		
	}

	@Override
	public void delete(User user ,Campaign campaign) {
		if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("silindi  ");
			
		}else {
			System.out.println("silme iþlmei baþaýsýz  (kimlik biligilerini kontorl et )");
		}
		
	}

	@Override
	public void update(User user ,Campaign campaign) {
if (_registrationVerificationService.save(user)==true) {
			
			System.out.println("Güncellendý  ");
			
		}else {
			System.out.println("Güncellenme baþarýsýz  (kimlik biligilerini kontorl et )");
		}
		
	}

}
