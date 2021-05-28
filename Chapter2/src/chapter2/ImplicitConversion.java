package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num ;
		System.out.println(dNum);
	}

}
//리터럴 (literal) : 프로그램에서 사용하는 모든 숫자, 값, 논리 값
//ex) 10,3.14,'A',true