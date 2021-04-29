
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "Java + React", "MCT, PMP ve ITIL");
		
		Student student1 = new Student(2,"Uğur Kaan", "Yeşil", "Java + React","ugurkaan@...");
		Student student2 = new Student(3,"Asuman", "Yeşil", "Java + React","asuman@...");
		Student student3 = new Student(4,"Hakkı", "Yeşil", "Java + React","hakkı@...");
		Student student4 = new Student(5,"Şahin", "Yeşil", "C# + Angular","sahin@...");
		
		UserManager manager = new UserManager();
		
		manager.add(student1);
		manager.add(student2);
		manager.add(student3);
		
		Student[] students = {student1,student2,student3,student4};
		
		manager.list(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.addHomework("Oynatma listesinin 27-39 aralığını izleyiniz");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student4);
		studentManager.answerHomework(student4,"izlendi");
		
		

	}

}
