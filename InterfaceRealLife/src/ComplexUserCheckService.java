
public class ComplexUserCheckService implements IUserChechService {
	
	public boolean checkUser(User user) {
		if(user.getAge()>=18 && user.getName().startsWith("Mu")) {
			return true;
		}
		return false;
	}
}
