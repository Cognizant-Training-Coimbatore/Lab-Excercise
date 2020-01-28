	import java.util.Iterator;
	import java.util.TreeSet;
public class exs_2 {





		public static void main(String[] args) {
			
	TreeSet<String> myset =new TreeSet<String>();
	myset.add("java");
	myset.add("html");
	myset.add("perl" );
	myset.add("sql");

		System.out.println(myset);
		Iterator it1 = myset.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("using for loop");
		for(String s:myset)
		System.out.println(s);
			
			
			
		}
		

	

		
	}


