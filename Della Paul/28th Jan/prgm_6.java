import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
public class prgm_6 {

	public static void main(String[] args)
	{
		
		ArrayList<String> mycolors=new ArrayList<String>(3);
		mycolors.add("red");
		mycolors.add("blue");
		mycolors.add("green");
		System.out.println("Orginal array list:"+mycolors);
		mycolors.ensureCapacity(6);
		mycolors.add("black");
		mycolors.add("orange");
		mycolors.add("yellow");
		System.out.println("Printing all colors:"+ mycolors);
}
}