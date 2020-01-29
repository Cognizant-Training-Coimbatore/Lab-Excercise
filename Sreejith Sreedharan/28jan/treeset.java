package packc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("one");
		System.out.println(myset);
java.util.Iterator<String> it1=myset.iterator();
while(it1.hasNext())
	{Object obj=it1.next();
	System.out.println(obj);
	
	}
for(Object obj:myset)
{
	System.out.println(obj);
}
	}

}