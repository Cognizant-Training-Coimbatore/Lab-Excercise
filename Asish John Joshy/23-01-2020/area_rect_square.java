package demo;

import java.util.Scanner;

class area
{
	void areas(int a)
	{
		System.out.println("Area of square="+(a*a));
	}
	void areas(int b,int l)
	{
		System.out.println("Area of rectangle="+(l*b));
	}
}
public class area_rect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		area are=new area();
		System.out.println("Enter length and breadth of rectangle");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("Enter side of square");
		int z=s.nextInt();
		are.areas(x,y);
		are.areas(z);
	}

}
