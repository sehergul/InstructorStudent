
public class InstructorManager extends UserManager{
	
	public void uploadVideo(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " video yükledi!");
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
