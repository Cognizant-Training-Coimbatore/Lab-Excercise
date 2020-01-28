import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn05_array_update {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Jack");
		mylist.add("Bill");
		mylist.add("Steve");
		mylist.add("Elon");
		mylist.add("Tesla");
		mylist.add("Newton");
		mylist.add("Einstin");
		System.out.println("Total items "+mylist.size());
		System.out.println("Printing all items "+mylist);
		System.out.println("Enter an element no. to be removed from 1 to 6");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		mylist.remove(i);
		System.out.println("Enter a name to be added to the list:");
		String fname1 = sc.next();
		mylist.add(i, fname1);
		System.out.println(mylist);

	}

}
