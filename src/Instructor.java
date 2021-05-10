import java.util.List;

public class Instructor extends User{
	private String description;


	public Instructor(String firstName, String lastName, int id, String email, String password,
			String description) {
		super(firstName, lastName, id, email, password);
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	
	
	
}
