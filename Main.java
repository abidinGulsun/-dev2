package �dev3;

public class Main {

	public static void main(String[] args) {
		InstructorManager �nInstructorManager = new InstructorManager();

		Instructor �nInstructor = new Instructor("Engin demiro�", "Java + React \n",
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		�nInstructorManager.course�nfo(�nInstructor);

		User user1 = new User(1, "EnginDemiro�_06");

		User user2 = new User(1, "AbidinGulsun06");

		UserManager userManager = new UserManager();
		userManager.instructorlogin(user1);

		�nInstructorManager.instructor�nfo(�nInstructor);

		Student student1 = new Student("Abidin G�ls�n", "123456");

		userManager.studentLogin(user2);

		StudentManager studentManager = new StudentManager();
		studentManager.ogrenci�nfo(student1);
	}

}
