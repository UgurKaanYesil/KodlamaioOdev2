
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getCourse() + " a eklendi.");
	}
	
	public void list(User[] user) {
		for (User users : user) {
			System.out.println(users.getFirstName());
		}
	}
}
