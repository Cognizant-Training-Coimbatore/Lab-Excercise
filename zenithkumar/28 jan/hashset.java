import java.util.HashSet;
import java.util.Set;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mySet = new HashSet<String>();
		mySet.add("one");
		mySet.add("two");
		mySet.add("three");
		mySet.add("one");
		System.out.println(mySet);
		for (String x:mySet)
		{
			System.out.println(x);
		}

	}

}
