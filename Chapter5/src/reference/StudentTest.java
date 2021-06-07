package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100,"James");
		studentJames.setKorea(100);
		studentJames.setmath(100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setKorea(80);
		studentTomas.setmath(60);
		
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
