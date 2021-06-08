package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		this("이름없음" , 1); //this 앞에는 어떠한 스테이터스도 올수가 없다.
							// this가 하는일 자신의 메모리를 가리킴 , 생성자에서 다른 생성자를 호출 , 자신의 주소를 반환
	}
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {//
		return this;
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println(p1.returnSelf());
	}

}
