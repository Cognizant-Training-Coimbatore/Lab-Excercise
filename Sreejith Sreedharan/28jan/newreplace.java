package packc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newreplace {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		System.out.println("printing all colors "+mylist);
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string replacement");
		String s=sc.next();
		mylist.set(1,s);
		System.out.println("replaced list "+mylist);

	}

}
