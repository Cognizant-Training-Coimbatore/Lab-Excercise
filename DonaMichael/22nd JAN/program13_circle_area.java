import java.util.Scanner;

public class program13_circle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pie=3.14;
		int r;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextInt();
		area=pie*r*r;
		System.out.println("Area is:"+area);
	}

}
