package jan_27th;

import java.util.Scanner;

public class EX_06 {
static void validate(int x)throws Myexception
	
	{
		if(x<0)
			throw new Myexception("this is first if");
		else
			System.out.println("this is else");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("for explaing wat is throw!!!!!!!!!!!");
		Scanner scanner =new Scanner(System.in);
		x = scanner.nextInt();
		try
		{
			validate(x);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:" +m);
		}
		

	}

}
