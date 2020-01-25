package demo;

import java.util.Scanner;

class logi
{
	int display(int a)
	{
		System.out.println(a);
		return(a);
	}
}
class addd extends logi
{
	int display1(int b,int j)
	{
		System.out.println((j+b));
		return(j+b);
	}
}
class adddd extends addd
{
	void display2(int c,int i)
	{
		System.out.println((i+c));
	}
}
public class multilevel_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		adddd lad=new adddd();
		System.out.println("Enter 3 numbers");
		int x,y,z;
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		int n=lad.display(x);
		int m=lad.display1(n,y);
		lad.display2(z,m);
	}

}
