package packc;

import java.util.ArrayList;

public class enhanced_forloop {
static void printArray(int myarray[])
{
	for(int x:myarray)
	{
		System.out.println(x);
		
	}
}
	static void printArrayList(ArrayList List1)
	{
	for(Object obj:List1)
	{System.out.println(obj);
		
	}
	}
	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=10;
		no[1]=10;
		no[2]=20;
		no[3]=30;
		printArray(no);
		ArrayList mylist=new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("Item3");
		mylist.add("Item4");
		printArrayList(mylist);

	}

}
