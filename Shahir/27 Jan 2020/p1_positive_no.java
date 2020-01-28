import java.util.InputMismatchException;
import java.util.Scanner;

public class p1_positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try
			{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number:");
			int a = s.nextInt();
			if(a>=0)
			{
				System.out.println("The number is postive");
				s.close();
			}
			else
			{
				System.out.println("The number cannot be accepted");
			}
		}
		catch (InputMismatchException e)
		{
		
		}
	}

}
