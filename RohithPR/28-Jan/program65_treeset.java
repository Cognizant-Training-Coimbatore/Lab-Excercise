import java.util.TreeSet;
import java.util.Iterator;

public class program65_treeset {

	public static void main(String[] args) 
	{
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("java");
		myset.add("selinum");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator it1 = myset.iterator();
		while (it1.hasNext())
		{
			Object obj = it1.hasNext();
			System.out.println(obj);
		}
		System.out.println("Using for loop...");
		for(Object obj:myset)
		{
			System.out.println("obj");
		}

	}

}
