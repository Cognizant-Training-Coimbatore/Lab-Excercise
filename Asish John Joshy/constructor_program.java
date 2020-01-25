package demo;

import java.util.Scanner;

class programming
{
	programming()
	{
		System.out.println("I love programming languages");
	}
	programming(String w)
	{
		System.out.println("I love "+w);
	}
}
public class constructor_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter something that you love");
		String nam=s.nextLine();
		if(nam.length()==0)
		{
			programming p=new programming();
		}
		else
		{
			programming p=new programming(nam);
		}
	}

}
