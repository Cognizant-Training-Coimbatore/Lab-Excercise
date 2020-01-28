import java.util.HashSet;


public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> myset = new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("four");
		System.out.println(myset);
		for(String x:myset)
		{
			System.out.println(x);
		}
	}

}
