package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <=9) {
			
			times = 1; //초기화를 시켜야 9단까지 찍힘 
			while(times <=9) {
				if(times > dan) break;
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		System.out.println();
	}

}
