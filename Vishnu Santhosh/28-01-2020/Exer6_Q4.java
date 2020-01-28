import java.util.ArrayList;
import java.util.Scanner;

public class Exer6_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		System.out.print("Enter the index[1-4]: ");
		int n= scan.nextInt();
		n-=1;
		System.out.println(mylist.get(n));
	}

}
