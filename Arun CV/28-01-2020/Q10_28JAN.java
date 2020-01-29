import java.util.LinkedList;

public class Q10_28JAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>  mylist=new LinkedList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("The list:"+mylist);
		Object first = mylist.getFirst();
	    System.out.println("First Element is: "+first);
	 
	   
	    Object last = mylist.getLast();
	    System.out.println("Last Element is: "+last);
}

}
