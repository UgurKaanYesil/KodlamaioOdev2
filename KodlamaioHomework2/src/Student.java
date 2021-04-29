
public class Student extends User{
	private String email;

	

	public Student(int id, String firstName, String lastName, String course, String email) {
		super(id, firstName, lastName, course);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
