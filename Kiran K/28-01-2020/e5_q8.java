package demo;

import java.util.ArrayList;
import java.util.List;

public class e5_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Arsenal");
		mysomelist.add("United");
		mysomelist.add("Chelsea");
		mysomelist.add("Liverpool");
		mysomelist.add("City");
		mysomelist.add("Spurs");
		mysomelist.add("Wolves");
		for (int i = 0; i < mysomelist.size(); i++) 
		{
			String Frname = mysomelist.get(i);
			System.out.println(Frname);
		}
	}

}
