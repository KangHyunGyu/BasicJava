package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		
		if(age <8) {
			
			charge = 1000;
			System.out.println("미 취학 아동");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("초등");
		}else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등");
		}else {
			charge = 3000;
			System.out.println("일반인");
		}
		
		System.out.println("입장료" + charge + "원 입니다.");
	}

}
