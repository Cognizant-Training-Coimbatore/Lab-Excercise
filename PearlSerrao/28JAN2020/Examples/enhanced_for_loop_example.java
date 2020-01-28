package demo;

import java.util.ArrayList;

public class enhanced_for_loop_example {
	static void printArray(int myarray[]) {
		for(int x:myarray) {
			System.out.println(x);
		}
	}
	static void printArrayList(ArrayList list1) {
		for(Object o:list1)
			System.out.println(o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[3];
		no[0]=10;
		no[1]=2;
		no[2]=3;
		printArray(no);
		
		//or
		
		java.util.ArrayList list=new ArrayList();
		
		list.add("A");
		list.add("B");		
		list.add("C");
		printArrayList(list);
	}

}
