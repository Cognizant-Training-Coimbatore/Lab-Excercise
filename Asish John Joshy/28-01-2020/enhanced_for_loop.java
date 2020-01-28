package demo;

import java.util.ArrayList;

public class enhanced_for_loop {
static void printArray(int a[])
{
	for(int x:a)
	{
		System.out.println(x);
	}
}
static void printArrayList(ArrayList list1)
{
	for(Object obj:list1)
	{
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
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		printArrayList(mylist);
	}

}
