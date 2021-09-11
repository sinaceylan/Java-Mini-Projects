
public class SignUpManager {
	
	private IUserChechService iUserChechService;
	
	public SignUpManager(IUserChechService iUserChechService) {
		
		this.iUserChechService = iUserChechService;
	}

	public void signUp(User user) {
		
		if(iUserChechService.checkUser(user)) {
			System.out.println("Kullan�c� Kay�t Oldu: "+user.getName());
		}else {
			System.out.println("Kullan�c� Kay�t Olamad�");
		}
	
}}
