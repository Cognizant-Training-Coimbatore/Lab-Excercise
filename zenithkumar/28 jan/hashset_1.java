import java.util.HashSet;
public class hashset_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>myset = new HashSet<String>();
		HashSet<String>myset1 = new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("four");
		
		myset1.add("one");
		myset1.add("two");
		myset1.add("three");
		myset1.add("four");
		myset.retainAll(myset1);
		System.out.println(myset);
		

	}

}
