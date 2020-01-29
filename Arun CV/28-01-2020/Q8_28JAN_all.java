import java.util.ArrayList;

public class Q8_28JAN_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>  mylist=new ArrayList<String>(4);
		mylist.add("Man");
		mylist.add("Women");
		mylist.add("Child");
		mylist.add("Family");
		System.out.println("Item"+mylist);
	
		System.out.println("Print using index of an element: ");
		//  int no_of_elements =list.size();
		  for (int i= 0; i <mylist.size(); i++) 
		   System.out.println(mylist.get(i));
}
}