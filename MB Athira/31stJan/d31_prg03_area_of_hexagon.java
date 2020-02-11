import java.util.Scanner;

public class d31_prg03_area_of_hexagon 
{

	public static void main(String[] args) 
	{
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		double a = (6*(s*s));
		double b = Math.tan(pi/6);
		double res = a/(4*b);
		System.out.println("Area = "+res);
		
	}

}
