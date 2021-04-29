
public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " Hoca " + user.getCourse() + " kursunun hocası oldu.");
	}

	
	public void addHomework(String homework) {
		System.out.println(homework + " ödevi verildi.");
	}

}
