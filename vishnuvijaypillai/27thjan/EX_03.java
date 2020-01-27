package jan_27th;

import java.util.Scanner;

public class EX_03 {
static void validate(String x)throws Myexception
	
	{
		if(x.length()==0)
			throw new Myexception("this is not string");
		else
			System.out.println("this is  string");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		System.out.println("to check wether its a string");
		Scanner scanner =new Scanner(System.in);
		x = scanner.nextLine();
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
