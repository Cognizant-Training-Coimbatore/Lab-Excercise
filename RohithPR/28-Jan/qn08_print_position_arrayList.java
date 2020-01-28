import java.util.ArrayList;
import java.util.List;

public class qn08_print_position_arrayList {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Batman");
		mylist.add("Superman");
		mylist.add("Wonder Women");
		mylist.add("Martian Man Hunter");
		mylist.add("Shazan");
		mylist.add("Flash");
		mylist.add("Aquaman");
		for (int i = 0; i < mylist.size(); i++) 
		{
			String Frname = mylist.get(i);
			System.out.println(Frname);
		}

	}

}
