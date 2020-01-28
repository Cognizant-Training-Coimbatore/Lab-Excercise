package prgrms;

import java.util.HashMap;

public class pr16keyvalue {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "c#");
		hashmap1.put(3, "selenium");
		hashmap1.put(4, "perl");
		hashmap1.put(5, "cobol");
		hashmap1.put(6, "fortran");
		System.out.println("size is "+hashmap1.size());
		

	}

}
