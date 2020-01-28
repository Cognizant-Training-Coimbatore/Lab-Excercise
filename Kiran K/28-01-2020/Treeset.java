package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<String> myset=new TreeSet<String>(); 
         myset.add("Java");
         myset.add("Selenium");
         myset.add("C");
         myset.add("C++");
         System.out.println(myset);
         Iterator it1=myset.iterator();
         System.out.println("Using Iterator object...");
         while(it1.hasNext())
         {
        	Object obj=it1.next();
        	System.out.println(obj);
         }
         System.out.println("Using for loop..");
         for(Object obj:myset)
         {
        	 System.out.println(obj);
         }
	}

}
