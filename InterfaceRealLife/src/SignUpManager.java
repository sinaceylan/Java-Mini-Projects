
public class SignUpManager {
	
	private IUserChechService iUserChechService;
	
	public SignUpManager(IUserChechService iUserChechService) {
		
		this.iUserChechService = iUserChechService;
	}

	public void signUp(User user) {
		
		if(iUserChechService.checkUser(user)) {
			System.out.println("Kullanýcý Kayýt Oldu: "+user.getName());
		}else {
			System.out.println("Kullanýcý Kayýt Olamadý");
		}
	
}}
