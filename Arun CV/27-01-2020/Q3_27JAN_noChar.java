import java.util.Scanner;

public class Q3_27JAN_noChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		int count=0;
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		try
		{
			for(int i=0; i<str.length();i++)
			{
				if(str.charAt(i)!=0)
					count++;	
				}
			System.out.println("The number is " +count);
		}
		catch(NullPointerException e)
		{
			System.out.println("Not accepted" +e);
		}
		
	}

}
