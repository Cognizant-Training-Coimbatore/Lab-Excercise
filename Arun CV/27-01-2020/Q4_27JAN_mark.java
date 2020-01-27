import java.io.InputStream;
import java.util.Scanner;

public class Q4_27JAN_mark {
static void mark(int a) throws custom_exception
{
	if(a<0)
	{
		throw new custom_exception("Invalid mark");
	}
	else
	{
		System.out.println("Entered marks are " +a);
	}
}
	public static void main(String[] args) throws custom_exception
	{
		// TODO Auto-generated method stub
		int a;
		int[] b=new int[5];
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number of input");
		a = scanner.nextInt();
		int i;
		for(i=0; i<a;i++)
		{
			System.out.print("Enter the numbers");
			b[i] = scanner.nextInt();
			mark(b[i]);
		}
	}
	}
