import java.util.Iterator;
import java.util.TreeSet;


public class treeset {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);//excludes duplicates
		Iterator it1=myset.iterator();
		System.out.println("using iterator object...");
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("using for loop...");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}

	}

}
