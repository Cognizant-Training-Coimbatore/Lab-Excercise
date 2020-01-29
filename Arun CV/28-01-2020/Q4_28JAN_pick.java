import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4_28JAN_pick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pick =new ArrayList<String>();
		pick.add("Virat Kohli");
		pick.add("Shivam Dube");
		pick.add( "AB de Villiers");
	pick.add("Aaron Finch");
		pick.add( "Yuzi Chahal");
	
		
		//System.out.print("Choose your RCB Icon by selecting between 1 to 6");
		String s=pick.get(1);
		System.out.println(pick);
		pick.add(1, "Moeen Ali");
		System.out.println(pick);
	}

	

}
