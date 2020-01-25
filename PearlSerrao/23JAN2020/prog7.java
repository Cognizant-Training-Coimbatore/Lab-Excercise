package demo;

import java.util.Scanner;

class AddAmount
{
	int amount=50;
	AddAmount()
	{
		amount=amount+0;
	}
	AddAmount(int a)
	{
		amount=amount+a;
	}
	void print()
	{
		System.out.println("Total=$"+amount+".00");
	}
}
public class prog7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Enter the amount you want to deposit");
		a=s.nextInt();
		if(a==0)
		{
			AddAmount add=new AddAmount();
			add.print();
		}
		else
		{
			AddAmount add=new AddAmount(a);
			add.print();
		}
		
	}

}

