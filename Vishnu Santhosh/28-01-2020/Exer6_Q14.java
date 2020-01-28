import java.util.Set;
import java.util.TreeSet;

public class Exer6_Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> mylist = new TreeSet<Integer>();
		mylist.add(4);
		mylist.add(41);
		mylist.add(14);
		mylist.add(24);
		mylist.add(7);
		mylist.add(2);
		mylist.add(1);
		System.out.print("Numbers less than 7: ");
		for(int x:mylist) {
			if(x<7) {
				System.out.print(x);
				System.out.print(',');
			}
		}
		
	}

}
