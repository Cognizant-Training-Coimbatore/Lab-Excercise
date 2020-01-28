import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn04_retrive_element {

	public static void main(String[] args) 
	{

		List<String>namelist = new ArrayList<String>();
		namelist.add("superman");
		namelist.add("batman");
		namelist.add("Flash");
		namelist.add("Wonder Women");
		namelist.add("Martian Man Hunter");
		namelist.add("Cyborg");
		System.out.println("Total items" +namelist.size());
		System.out.println("Print all items" + namelist);
		System.out.println("Printing all items"+namelist);
		System.out.println("Enter an element number to be removed from 1 to 6");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		namelist.remove(i);
		System.out.println("Enter a name to be added to the list");
		String fname1 = s.next();
		namelist.add(i,fname1);
		System.out.println(namelist);
		

	}

}
