
public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor("Engin", "Demiro�", 1, "engindemirog@gmail.com","12345","Yaz�l�mc�");
		Student student = new Student("Seher", "G�l", 2, "sehernege@gmail.com","98765");
		User user = new User("Bab�r", "Robot", 10, "iyiailerobotu@gmail.com","123oldDays");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.login(student);
		studentManager.attendance(student);
		studentManager.uploadHomework(student);
		studentManager.logout(student);
		studentManager.delete(student);
		

		System.out.println("\n\n--------\n\n");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.login(instructor);
		instructorManager.uploadVideo(instructor);
		instructorManager.logout(instructor);
		
		System.out.println("\n\n--------\n\n");

		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.login(user);
		userManager.logout(user);
		
		
		
		
	}

}
