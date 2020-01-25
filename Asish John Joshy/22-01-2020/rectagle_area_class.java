package demo;

import java.util.Scanner;

class Area
{
	int returnArea(int l,int b)
	{
		return((l*b));
	}
}
public class rectagle_area_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,are;
		Scanner s=new Scanner(System.in);
		Area ar=new Area();
		System.out.println("Enter length");
		x=s.nextInt();
		System.out.println("Enter breadth");
		y=s.nextInt();
		are=ar.returnArea(x,y);
		System.out.println("Area="+are);
	}

}
