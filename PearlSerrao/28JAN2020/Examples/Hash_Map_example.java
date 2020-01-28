package demo;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map_example {

	public static void main(String[] args) {
		// TOD
		HashMap<Integer,String>  hash=new HashMap<Integer, String>();
		hash.put(1,"java");
		hash.put(2,"perl");
		hash.put(3,"cobol");
		hash.put(4,"python");
		hash.put(5,"C");
		int opt;
	
Scanner s=new Scanner(System.in);
System.out.println("enter option 1-5??");
opt=s.nextInt();
String course=hash.get(opt);
System.out.println(course);
}
}