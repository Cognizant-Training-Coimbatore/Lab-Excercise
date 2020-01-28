import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prg28_qn03_add_element {

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
		System.out.println("Enter a name to be added");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		mysomelist.add(0, s);
		System.out.println("Printing all :"+mysomelist);
	}

}
