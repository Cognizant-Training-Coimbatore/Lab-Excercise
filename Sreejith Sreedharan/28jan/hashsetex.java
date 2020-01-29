package packc;

import java.util.HashSet;
import java.util.Set;

public class hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>myset=new HashSet<String>();
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
