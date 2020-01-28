import java.util.HashSet;
import java.util.Set;

public class Exer6_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mylist = new HashSet<String>();
		Set<String> mylist1 = new HashSet<String>();
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		mylist.add("Grey");
		mylist1.add("White");
		mylist1.add("Red");
		mylist1.add("Grey");
		mylist1.add("Green");
		mylist.retainAll(mylist1);
		System.out.println(mylist);

	}

}
