
public class StudentManager extends UserManager{
	
	public void attendance(Student student) {
		System.out.println(student.getFirstName() + " yoklaman�z ba�ar�yla al�nm��t�r.");
	}
	
	public void uploadHomework(Student student) {
		System.out.println(student.getFirstName() + " ba�ar�yla �devi y�kledi!");
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
		System.out.println(user.getFirstName() + " sisteme ba�ar�yla eklendi!");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " sistemden ba�ar�yla silindi!");
	}
	
	
	
}
