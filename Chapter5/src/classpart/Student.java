package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
	}
	
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudnetName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		
		Student studentLee = new Student(100, "�̼���");
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "America SanHo";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}
	
	
}
 