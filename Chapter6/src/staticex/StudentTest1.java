package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		
		Student studentT = new Student();
		
		System.out.println(studentJ.studentID);
		System.out.println(studentT.studentID);
		
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		Student studentK = new Student();
		System.out.println(studentK.studentID);
		
	}

}
