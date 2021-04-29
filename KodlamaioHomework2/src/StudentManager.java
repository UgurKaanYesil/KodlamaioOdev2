
public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " adlı öğrenci " + user.getCourse() + " kursuna kaydoldu.");
	}

	@Override
	public void list(User[] user) {
		System.out.println("Öğrencilerin ismi :");
		super.list(user);
	}
	
	public void answerHomework( Student student, String answer) {
		System.out.println(student.getFirstName() + " " + answer + " cevabı yollandı.");
	}

}
