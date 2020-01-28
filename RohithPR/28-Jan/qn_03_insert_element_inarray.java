import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn_03_insert_element_inarray {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Batman");
		mylist.add("Superman");
		mylist.add("Wonder Women");
		mylist.add("Flash");
		mylist.add("Shazam");
		mylist.add("Aquaman");
		mylist.add("Martian Man Hunter");
		System.out.println("Enter a name to be added");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		mylist.add(0, s);
		System.out.println("Printing all :"+mylist);

	}

}
