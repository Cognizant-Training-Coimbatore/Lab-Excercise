import java.util.ArrayList;
import java.util.Scanner;

public class arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		Scanner sc =new Scanner(System.in);
		int b = sc.nextInt();
		a.set(1, b);
		System.out.println(a);
	}

}
