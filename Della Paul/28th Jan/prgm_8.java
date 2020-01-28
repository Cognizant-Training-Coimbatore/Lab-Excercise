import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
public class prgm_8 {

	public static void main(String[] args)
	{
		
		List<String> mycolors=new ArrayList<String>();
		mycolors.add("red");
		mycolors.add("blue");
		mycolors.add("green");
		mycolors.add("orange");
		mycolors.add("yellow");
		System.out.println("Printing all colors:"+ mycolors);
		System.out.println("printing with index");
		int x=mycolors.size();
		for(int i=0;i<x;i++)
		{
			System.out.println(mycolors.get(i));
		}
		
}
}

