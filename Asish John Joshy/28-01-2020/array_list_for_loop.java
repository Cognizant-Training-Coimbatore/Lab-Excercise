package demo;

import java.util.ArrayList;
import java.util.List;

public class array_list_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array8=new ArrayList<String>();
		{
			array8.add("This");
			array8.add("is");
			array8.add("not");
			array8.add("good");
			array8.add("food");
		}
		for(String s:array8)
		{
			System.out.println(s);
		}
	}

}
