
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " sisteme ba�ar�yla eklendi!");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " sistemden ba�ar�yla silindi!");
	}
	
	public void login(User user){
		System.out.println(user.getFirstName() + " sisteme ba�ar�yla giri� yapt�n�z!");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " sistemden ba�ar�yla ��k�� yapt�n�z!");	
	}
	
	
	
}
