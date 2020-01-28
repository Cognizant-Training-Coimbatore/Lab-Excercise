import java.util.Set;
import java.util.HashSet;
public class prgm_12 {

	public static void main(String[] args)
	{
		Set<String> myset =new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		System.out.println(myset);
		Set<String>myset1=new HashSet<String>();
		myset1.add("one");
		myset1.add("blue");
		myset1.add("black");
		myset.retainAll(myset1);
		System.out.println(myset);

	}

}

