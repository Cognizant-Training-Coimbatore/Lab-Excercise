import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class prgm_2 {

	public static void main(String[] args) {
		List<String> mycolors=new ArrayList<String>();
		mycolors.add("red");
		mycolors.add("blue");
		mycolors.add("green");
		mycolors.add("orange");
		mycolors.add("yellow");
		System.out.println("Printing all colors:"+ mycolors);
		Iterator it1=mycolors.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
			}
	}

}

