import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class excersise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		mylist.add("adipoli");
		mylist.add("vaa");
		mylist.add("povaam");
		System.out.println(mylist);
		Iterator itr=mylist.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
			}
		
		
		

	}

}
