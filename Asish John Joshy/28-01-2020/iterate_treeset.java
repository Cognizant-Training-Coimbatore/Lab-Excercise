package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterate_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array1=new ArrayList<String>();
		{
		array1.add("Red");
		array1.add("Blue");
		array1.add("Green");
		array1.add("Yellow");
		array1.add("Brown");
		System.out.println("Colors are:"+array1);
		}
		Iterator it1=array1.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
	}

}
