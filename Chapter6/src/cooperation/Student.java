package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName , int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {//��ü�� ������ �̷������ �κ�
		bus.take(1000);
		money -= 1000;
	}
	public void takeSubway(Subway subway) {//��ü�� ������ �̷������ �κ�
		subway.take(1500);
		money -= 1500;
	}
	
	/*
	 * public void takeTrans(Trans trans) {
	 * 
	 * 
	 * }
	 */
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money +"�Դϴ�.");
	}
}
