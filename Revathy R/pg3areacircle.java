import java.util.Scanner;

public class pg3areacircle {

	public static void main(String[] args) {
		final double pie=3.14;
		int r;
		double a;
		System.out.println("enter the radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		a=pie*(r*r);
		System.out.println("area is "+a);
	}

}
