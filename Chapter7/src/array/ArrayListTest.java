package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		String[] slist = new String[10];
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s: list) {
			System.out.println(s);
		}
		for(int i =0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
