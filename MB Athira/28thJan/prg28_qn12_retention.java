import java.util.HashSet;
import java.util.Set;

public class prg28_qn12_retention 
{

	public static void main(String[] args) 
	{
		Set<String>myset1 = new HashSet<String>();
		myset1.add("one");
		myset1.add("two");
		myset1.add("three");
		Set<String>myset2 = new HashSet<String>();
		myset2.add("one");
		myset2.add("three");
		myset1.retainAll(myset2);
		System.out.println(myset1);
	}

}
