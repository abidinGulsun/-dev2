package �dev3;

public class InstructorManager {

	public void instructor�nfo(Instructor �Instructor) {
		System.out.println("E�itmen Ad� : " + �Instructor.getInstructorName());
		System.out.println("E�itmen Bran�� : " + �Instructor.getBranch());
	}

	public void course�nfo(Instructor �nInstructor) {
		System.out.println("Kursun Ad� : " + �nInstructor.getCourse() + "\n");
	}
}
