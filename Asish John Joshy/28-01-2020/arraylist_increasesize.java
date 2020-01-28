package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist_increasesize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> array6=new ArrayList<String>();
		{
			array6.add("This");
			array6.add("is");
			array6.add("exciting");
			array6.add("for");
			array6.add("me");
		}
		System.out.println(array6);
		((ArrayList<String>) array6).ensureCapacity(400);
		System.out.println("Total items "+array6.size());
	}

}
