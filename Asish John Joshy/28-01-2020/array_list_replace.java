package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> array7=new ArrayList<String>();
		{
			array7.add("I");
			array7.add("am");
			array7.add("not");
			array7.add("loving");
			array7.add("it");
		}
		System.out.println(array7);
		System.out.println("Enter an element to replace the second element");
		String ps=s.nextLine();
		array7.set(1,ps);
		System.out.println(array7);
	}

}
