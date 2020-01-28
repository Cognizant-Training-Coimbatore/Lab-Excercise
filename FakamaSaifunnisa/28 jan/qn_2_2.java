import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;

public class qn_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myset=new ArrayList();
		myset.add("Java");
		myset.add("Selenium");
		myset.add("C++");
		myset.add("perl");
		myset.add("Unix");
		myset.add("Ada");
		myset.add("Java");
		Iterator it1=myset.iterator();
		while(it1.hasNext())
		{
		Object obj=it1.next();
		System.out.println(obj);
		}
		
	}

}
