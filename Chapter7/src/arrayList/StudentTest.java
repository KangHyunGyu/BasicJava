package arrayList;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001 , "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("----------------------------");
		Student studentKim = new Student(1002 , "Kim");
		studentKim.addSubject("����", 87);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 65);
		
		studentKim.showStudentInfo();
		
	}

}
