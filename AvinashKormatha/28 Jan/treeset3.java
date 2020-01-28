import java.util.Scanner;
import java.util.TreeSet;

public class treeset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(1);
		a.add(9);
		a.add(4);
		a.add(10);
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		for(int x:a)
		{
			if(x>=b)
			{
				System.out.println(x);
				break;
			}
			
		}
	}

}
