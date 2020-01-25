import java.util.Scanner;

public class p3_area_circle 
{

	public static void main(String[] args) 
	{
		int r;
		double a;
		final double pi=3.14;
		System.out.println("Enter the radius of the circle=");
		Scanner s = new Scanner(System.in);
		r=s.nextInt();
		a=4*pi*r*r;
		System.out.println("The area of circle=" +a);
	}

}
