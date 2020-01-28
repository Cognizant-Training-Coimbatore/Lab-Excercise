import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exer6_Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> mylist = new TreeSet<Integer>();
		Scanner scan = new Scanner(System.in);
		mylist.add(4);
		mylist.add(41);
		mylist.add(14);
		mylist.add(24);
		mylist.add(7);
		mylist.add(2);
		mylist.add(1);
		System.out.print("Enter the number: ");
		int n=scan.nextInt();
		System.out.println(mylist);
		System.out.print("Number just greater is: ");
		for(int x:mylist) {
			if(x>n) {
				System.out.print(x);
				break;
			}
		}

	}

}
