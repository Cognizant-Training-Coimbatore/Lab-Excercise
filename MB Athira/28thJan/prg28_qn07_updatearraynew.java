import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prg28_qn07_updatearraynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Revathy");
		mysomelist.add("Fakama");
		mysomelist.add("Athira");
		mysomelist.add("Della");
		mysomelist.add("Sreejith");
		mysomelist.add("Rohit");
		mysomelist.add("Dona");
		System.out.println("Total items "+mysomelist.size());
		System.out.println("Printing all items "+mysomelist);
		System.out.println("Enter an element no. to be replaced from 1 to 6");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		mysomelist.remove(i);
		System.out.println("Enter a name to be added to the list:");
		String fname1 = sc.next();
		mysomelist.add(i, fname1);
		System.out.println(mysomelist);
	}

}
