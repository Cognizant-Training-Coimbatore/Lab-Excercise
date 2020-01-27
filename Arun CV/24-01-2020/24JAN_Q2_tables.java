import java.util.Scanner;

class tab
{
	void series(int a)
	{
		int j;
		for(j=1; j<=a; j++)
		{
			int i;
			for(i=1; i<=10; i++)
			{
				System.out.println(j+ "*" +i+ "=" +j*i);
			}
		}
	}
}
public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int x;
		x = scanner.nextInt();
		tab obj = new tab();
		obj.series(x);
	}

}
