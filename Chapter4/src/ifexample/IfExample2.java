package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		
		if(age <8) {
			
			charge = 1000;
			System.out.println("�� ���� �Ƶ�");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ�");
		}else if (age < 20) {
			charge = 2500;
			System.out.println("��, ���");
		}else {
			charge = 3000;
			System.out.println("�Ϲ���");
		}
		
		System.out.println("�����" + charge + "�� �Դϴ�.");
	}

}
