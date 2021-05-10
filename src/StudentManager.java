
public class StudentManager extends UserManager{
	
	public void attendance(Student student) {
		System.out.println(student.getFirstName() + " yoklamanýz baþarýyla alýnmýþtýr.");
	}
	
	public void uploadHomework(Student student) {
		System.out.println(student.getFirstName() + " baþarýyla ödevi yükledi!");
	}

	@Override
	public void login(User user) {
		super.login(user);
	}

	@Override
	public void logout(User user) {
		super.logout(user);
	}
	

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " sisteme baþarýyla eklendi!");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " sistemden baþarýyla silindi!");
	}
	
	
	
}
