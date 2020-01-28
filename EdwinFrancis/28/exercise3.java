import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		mylist.add("hello");
		mylist.add("world");
		mylist.add("name");
		mylist.add("is");
		System.out.println(mylist);
		String str;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string:");
		str=input.nextLine();
		mylist.add(0,str);
		System.out.println(mylist);

	}

}
