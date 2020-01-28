import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class prgm_4 {

	public static void main(String[] args)
	{
		
		List<String> mycolors=new ArrayList<String>();
		mycolors.add("red");
		mycolors.add("blue");
		mycolors.add("green");
		mycolors.add("orange");
		mycolors.add("yellow");
		System.out.println("Printing all colors:"+ mycolors);
		System.out.println("Adding violet.....");
		mycolors.add(0,"violet");
		System.out.println("Items after adding violet:"+mycolors);
		String newcolor=mycolors.get(2);
		System.out.println("the element at index 2 is:"+newcolor);
}
}
