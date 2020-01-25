import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pie=3.14;
		double area;
		int r;
		System.out.println("Enter the radius");
		Scanner input=new Scanner(System.in);
		r=input.nextInt();
		area=pie*r*r;
		System.out.println("Area is:"+area);


	}

}
