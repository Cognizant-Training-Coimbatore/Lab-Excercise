import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
