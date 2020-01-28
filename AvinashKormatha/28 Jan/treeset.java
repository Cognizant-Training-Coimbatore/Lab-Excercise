import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a = new TreeSet<String>();
		a.add("java");
		a.add("selenium");
		a.add("c");
		a.add("python");
		System.out.println(a);
		Iterator it1 = a.iterator();
		while(it1.hasNext())
		{
			Object obj = it1.next();
			System.out.println(obj);
		}
		for(Object obj:a)
		{
			System.out.println(obj);
		}
	}

}
