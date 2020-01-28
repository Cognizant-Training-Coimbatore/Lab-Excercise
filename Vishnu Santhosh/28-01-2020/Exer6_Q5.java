import java.util.ArrayList;
import java.util.Scanner;

public class Exer6_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		System.out.println(mylist);
		System.out.print("Enter the item to be replaced: ");
		String x= scan.next();
		System.out.print("Enter the item to be replaced with: ");
		String y= scan.next();
		int n=mylist.indexOf(x);
		mylist.add(n, y);
		mylist.remove(n+1);
		System.out.println(mylist);
	}

}
