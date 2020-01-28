package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e5_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Arsenal");
		mysomelist.add("United");
		mysomelist.add("Chelsea");
		mysomelist.add("Liverpool");
		mysomelist.add("City");
		mysomelist.add("Spurs");
		mysomelist.add("Wolves");
		System.out.println("Total items "+mysomelist.size());
		System.out.println("Printing all items "+mysomelist);
		System.out.println("Enter the number to be replaced:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		mysomelist.remove(1);
		System.out.println("Enter the name to replace the second name:");
		String fname1 = sc.next();
		mysomelist.add(1, fname1);
		System.out.println(mysomelist);
	}

}
