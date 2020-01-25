import java.util.Scanner;

public class program34_multiplication_table {

	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number between 1 - 9");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i = 1;i<a+1;i++)
		{
			for(int j = 1;j<11;j++)
			{
				int p = i*j;
				System.out.println(i+"*"+j+"="+p);
			}
			
		}
		
	}

}
