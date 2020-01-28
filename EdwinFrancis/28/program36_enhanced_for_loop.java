package demo;

import java.util.ArrayList;

public class program36_enhanced_for_loop {
	static void printArray(int myarray[]) {
		for(int x:myarray) {
			System.out.println(x);
		}
		
	}
	static void printArrayList(ArrayList list1) {
		for(Object obj:list1) {
			System.out.println(obj);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[3];
		n[0]=10;
		n[1]=20;
		n[2]=30;
		printArray(n);
		ArrayList mylist=new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printArrayList(mylist);
		
		

	}

}
