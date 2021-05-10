
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " sisteme baþarýyla eklendi!");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " sistemden baþarýyla silindi!");
	}
	
	public void login(User user){
		System.out.println(user.getFirstName() + " sisteme baþarýyla giriþ yaptýnýz!");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " sistemden baþarýyla çýkýþ yaptýnýz!");	
	}
	
	
	
}
