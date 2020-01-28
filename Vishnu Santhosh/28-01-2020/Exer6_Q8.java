import java.util.ArrayList;

public class Exer6_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Blue");
		mylist.add("White");
		mylist.add("Red");
		mylist.add("Grey");
		mylist.add("Green");
		System.out.print("Array list= ");
		for(int i=0;i<mylist.size();i++) {
			System.out.print(mylist.get(i)+",");
		}
	}

}
