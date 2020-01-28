import java.util.ArrayList;

public class Exer6_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		System.out.println("Previous list: "+mylist);
		String temp;
		String insert="Grey";
		int n= mylist.size();
		mylist.add(0, insert);
		System.out.println("After list: "+mylist);
	}

}
