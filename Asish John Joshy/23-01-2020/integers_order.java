package demo;

import java.util.Scanner;

class inte
{
	void series(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}
	}
}
public class integers_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		inte i=new inte();
		System.out.println("Enter 2 integers");
		int x=s.nextInt();
		int y=s.nextInt();
		i.series(x,y);
	}

}
