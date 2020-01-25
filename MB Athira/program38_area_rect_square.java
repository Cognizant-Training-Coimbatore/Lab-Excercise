import java.util.Scanner;

class arearectsqu
{
	arearectsqu(int a, int b)
	{
		int ar = a*b;
		System.out.println("Area of rectangle:" +ar);
	}
	arearectsqu(int a1)
	{
		int ar1 = a1*a1;
		System.out.println("Area of Square: "+ar1);
	}
}
public class program38_area_rect_square
{

	public static void main(String[] args)
	{	
		System.out.println("Enter the length and breadth of the rectangle");
		Scanner sc = new Scanner(System.in);
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		arearectsqu obj = new arearectsqu(a2,b1);
		System.out.println("Enter the side of square");
		int c1 = sc.nextInt();
		arearectsqu obj2 = new arearectsqu(c1);
		
	}

}
