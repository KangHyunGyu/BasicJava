package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		this("�̸�����" , 1); //this �տ��� ��� �������ͽ��� �ü��� ����.
							// this�� �ϴ��� �ڽ��� �޸𸮸� ����Ŵ , �����ڿ��� �ٸ� �����ڸ� ȣ�� , �ڽ��� �ּҸ� ��ȯ
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
