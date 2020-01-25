package demo;

import java.util.Scanner;

class mtable
{
	void table(int n)
	{
		for(int j=1;j<=n;j++)
		{
		for(int i=1;i<=10;i++)
		{
			System.out.println(j+"*"+i+"="+(j*i));
		}
		}
	}
	
}
public class mult_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		mtable m=new mtable();
		System.out.println("Enter a number");
		int a=s.nextInt();
		m.table(a);
	}

}
