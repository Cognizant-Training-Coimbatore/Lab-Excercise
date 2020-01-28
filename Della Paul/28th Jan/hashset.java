import java.util.Set;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args)
	{
		Set<String> myset =new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("one");
		System.out.println(myset);
		for(String x:myset)
		{
			System.out.println(x);
		}
		

	}

}
