import java.util.ArrayList;

public class Exer6_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		System.out.println("Initial List: "+mylist);
		mylist.set(1, "Green");
		System.out.println("Final List: "+mylist);
	}
		
}
