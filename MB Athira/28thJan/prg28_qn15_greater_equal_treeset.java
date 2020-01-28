import java.util.Scanner;
import java.util.TreeSet;

public class prg28_qn15_greater_equal_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>mytree1 = new TreeSet<Integer>();
		mytree1.add(23);
		mytree1.add(1);
		mytree1.add(4);
		mytree1.add(67);
		mytree1.add(6);
		System.out.println("No. set: "+mytree1);
		System.out.println("Enter a no.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(mytree1.ceiling(i));
	}
}
