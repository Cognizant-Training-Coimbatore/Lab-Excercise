import java.util.ArrayList;
import java.util.Scanner;

public class arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(7);
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i=0;
		for(int x:a)
		{
			if(b==x)
			{
				break;
			}
			i++;
		}
		a.set(i, c);
		System.out.println(a);
	}

}
