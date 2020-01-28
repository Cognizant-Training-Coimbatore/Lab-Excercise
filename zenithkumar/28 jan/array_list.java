import java.util.ArrayList;
import java.util.List;
public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		myList.add("item1");
	    myList.add("item2");
	    myList.add("item3");		
	    myList.add("item4");
	    myList.add("item5");
	    System.out.println("Total items" +myList.size());
	    System.out.println("Testing item4 exists" +myList.contains("item4"));
	    System.out.println("Printing all items" +myList);
	    System.out.println("Removing item 3.......");
	    
	}

}
