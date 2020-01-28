import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
public class prgm_7 {

	public static void main(String[] args)
	{
		
		List<String> mycolors=new ArrayList<String>();
		mycolors.add("red");
		mycolors.add("blue");
		mycolors.add("green");
		mycolors.add("orange");
		mycolors.add("yellow");
		System.out.println("Printing all colors:"+ mycolors);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the color");
		String s=sc.next();
		mycolors.set(2,s);
		System.out.println("the color after changing is:"+mycolors);
}
}

