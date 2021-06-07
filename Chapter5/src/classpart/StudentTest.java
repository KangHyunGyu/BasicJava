package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		Student studentLee = new Student();
		studentLee.studentName = "이순시";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "America SanHo";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
